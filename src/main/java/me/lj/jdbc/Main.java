package me.lj.jdbc;

import me.lj.jdbc.test.JDBCTest;
import me.lj.jdbc.test.JsonTest;
import me.lj.jdbc.test.PinyinToolTest;
import net.sf.json.JSONArray;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by liujingb on 2017-8-2.
 */
public class Main {
  public static void main(String[] args) throws Exception {
    Connection conn = JDBCTest.getConnection();
    conn.setAutoCommit(false);
//     batchVendorInsert(conn);//vendor
//     batchCHQueryServiceCityConfigInsert(conn);//bizcity carcity
//    batchVehicleGroupInsert(conn);// vehicle vehiclegroup
    conn.close();
  }

  /**
   * #TODO 手动修改IsActive，增加时是不维护 填充VendorDesc，WifiImageURL
   */
  private static void batchVendorInsert(Connection conn) throws Exception {
    try {
      JSONArray jsonArray = JsonTest.getJsonArray("CHVendor");
      int size = jsonArray.size();
      if (size == 0) {
        return;
      }

      String sql =
          "INSERT INTO `vendor` (`VendorId`, `VendorName`, `EnglishName`, `VendorDesc`, `OnlineImageURL`, `WifiImageURL`, `IsActive`) VALUES(?,?,?,'',?,'',0)";
      long startTime = System.currentTimeMillis();
      // 关闭事务自动提交
      PreparedStatement pst = conn.prepareStatement(sql);
      for (int i = 0; i < size; i++) {
        pst.setInt(1, i + 1);
        pst.setString(2, jsonArray.getJSONObject(i).getString("Name"));
        pst.setString(3, PinyinToolTest.toPinYin(jsonArray.getJSONObject(i).getString("Name")));
        pst.setString(4, jsonArray.getJSONObject(i).getString("ImageUrl"));
        // 把一个SQL命令加入命令列表
        pst.addBatch();
      }
      // 执行批量更新
      pst.executeBatch();
      // 语句执行完毕，提交本事务
      conn.commit();
      long endTime = System.currentTimeMillis();
      System.out.println("testBatchInsert用时：" + (endTime - startTime));
      pst.close();
    } catch (Exception e) {
      throw e;
    }
  }

  private static void batchCHQueryServiceCityConfigInsert(Connection conn) throws Exception {
    try {
      JSONArray jsonArray = JsonTest.getJsonArray("CHQueryServiceCityConfig");
      int size = jsonArray.size();
      if (size == 0) {
        return;
      }

      String sqlCity =
              "INSERT INTO `citycarcorp` (`CityId`, `CityName`, `CityCode`, `EnglishName`, `FirstChar`, `PinYin`, `ProvinceId`, `CountryId`) VALUES (?, ?, ?, ?, ?, ?, 0, 1)";
      String sqlBizCity =
              "INSERT INTO `bizcity` (`CityId`, `BizType`, `IsHot`, `IsActive`, `SortNum`, `ChangeBy`) VALUES (?, ?, ?, 0, ?, 'Admin')";

      long startTime = System.currentTimeMillis();
      // 关闭事务自动提交
      PreparedStatement pstCity = conn.prepareStatement(sqlCity);
      PreparedStatement pstBizCity = conn.prepareStatement(sqlBizCity);

      for (int i = 0; i < size; i++) {
        String py = PinyinToolTest.toPinYin(jsonArray.getJSONObject(i).getString("Name"));
        pstCity.setInt(1, i + 1);
        pstCity.setString(2, jsonArray.getJSONObject(i).getString("Name"));
        pstCity.setString(3, py);
        pstCity.setString(4, jsonArray.getJSONObject(i).getString("EnName"));
        pstCity.setString(5, py.substring(0, 1));
        pstCity.setString(6, py);
        pstCity.addBatch();

        pstBizCity.setInt(1, i + 1);
        pstBizCity.setString(2, jsonArray.getJSONObject(i).getString("Name"));
        pstBizCity.setBoolean(3, Boolean.parseBoolean(jsonArray.getJSONObject(i).getString("IsHot")));
        pstBizCity.setString(4, jsonArray.getJSONObject(i).getString("SortNum"));
        pstBizCity.addBatch();
      }
      // 执行批量更新
      pstCity.executeBatch();
      pstBizCity.executeBatch();

      // 语句执行完毕，提交本事务
      conn.commit();

      long endTime = System.currentTimeMillis();
      System.out.println("testBatchInsert用时：" + (endTime - startTime));
      pstCity.close();
      pstBizCity.close();
    } catch (Exception e) {
      throw e;
    }
  }



  /**
   * # todo 手动维护ProvinceId，以后有省表再维护也可以 CityCode已经用pinyin了
   * 
   * @param conn
   * @throws Exception
   */
  private static void batchVehicleGroupInsert(Connection conn) throws Exception {
    try {
      JSONArray jsonArray = JsonTest.getJsonArray("CHVehicleGroup");
      int size = jsonArray.size();
      if (size == 0) {
        return;
      }
      String sqlVehicleGroup =
          "INSERT INTO `vehiclegroupcarcorp` ( `VehicleGroupId`, `VehicleGroupName`, `EnglishName`, `OnlineImageUrl`, `WifiImageUrl`, `SeatCount`, `SeatDesc`, `BaggageNum`, `BaggageDesc`, `IsActive`) VALUES ( ?, ?, ?, ?, '', ?, ?, ?, ?, 0);";
      String sqlVehicle =
          "INSERT INTO `vehiclecarcorp` ( `VehicleID`, `VehicleName`, `EnglishName`, `OnlineImageURL`, `WifiImageURL`, `SeatCount`, `BaggageNum`, `GearType`, `VehicleGroupId`, `IsActive`) VALUES (?, ?, '', ?, '', ?, ?, '', ?, 0);";

      long startTime = System.currentTimeMillis();
      // 关闭事务自动提交
      PreparedStatement pstVehicleGroup = conn.prepareStatement(sqlVehicleGroup);
      PreparedStatement pstVehicle = conn.prepareStatement(sqlVehicle);

      int vehGroupCount = 0;
      int vehCount = 0;
      for (int i = 0; i < size; i++) {
        vehGroupCount++;
        pstVehicleGroup.setInt(1, vehGroupCount);
        pstVehicleGroup.setString(2, jsonArray.getJSONObject(i).getString("Name"));
        pstVehicleGroup.setString(3, jsonArray.getJSONObject(i).getString("EnName"));
        pstVehicleGroup.setString(4, jsonArray.getJSONObject(i).getString("ImageUrl"));
        pstVehicleGroup.setString(5, jsonArray.getJSONObject(i).getString("SeatCount"));
        pstVehicleGroup.setString(6, jsonArray.getJSONObject(i).getString("SeatDesc"));
        pstVehicleGroup.setString(7, jsonArray.getJSONObject(i).getString("CarRiageNum"));
        pstVehicleGroup.setString(8, jsonArray.getJSONObject(i).getString("CarRiageDesc"));
        pstVehicleGroup.addBatch();

        JSONArray itemJsonArray = JSONArray.fromObject(jsonArray.getJSONObject(0).getString("VehicleTypeDetailList"));
        int sizeJ = itemJsonArray.size();
        for (int j = 0; j < sizeJ; j++) {
          vehCount++;
          pstVehicle.setInt(1, vehCount);
          pstVehicle.setString(2, itemJsonArray.getJSONObject(j).getString("Name"));
          pstVehicle.setString(3, itemJsonArray.getJSONObject(j).getString("BrandImgUrl"));
          pstVehicle.setString(4, jsonArray.getJSONObject(i).getString("SeatCount"));
          pstVehicle.setString(5, jsonArray.getJSONObject(i).getString("CarRiageNum"));
          pstVehicle.setInt(6, vehGroupCount);
          pstVehicle.addBatch();
        }
      }
      // 执行批量更新
      pstVehicleGroup.executeBatch();
      pstVehicle.executeBatch();

      // 语句执行完毕，提交本事务
      conn.commit();

      long endTime = System.currentTimeMillis();
      System.out.println("testBatchInsert用时：" + (endTime - startTime));
      pstVehicleGroup.close();
      pstVehicle.close();
    } catch (Exception e) {
      throw e;
    }
  }
}
