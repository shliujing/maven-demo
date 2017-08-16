package me.lj.jdbc.test;

/**
 * Created by liujingb on 2017-8-2.
 */

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class JsonTest {
  public static void main(String[] args) throws UnsupportedEncodingException {
    // testJson();
  }

  public static JSONArray getJsonArray(String fileName) {
    String JsonContext = new FileUtilTest().ReadFile("D:\\test\\" + fileName + ".json");
    return JSONArray.fromObject(JsonContext);
  }

  private static void testJson() {
    String JsonContext = new FileUtilTest().ReadFile("D:\\test\\apkinfo.json");
    JSONArray jsonArray = JSONArray.fromObject(JsonContext);

    int size = jsonArray.size();
    System.out.println("Size: " + size);
    for (int i = 0; i < size; i++) {
      JSONObject jsonObject = jsonArray.getJSONObject(i);
      System.out.println("[" + i + "]name=" + jsonObject.get("name"));
      System.out.println("[" + i + "]package_name=" + jsonObject.get("package_name"));
      System.out.println("[" + i + "]check_version=" + jsonObject.get("check_version"));
    }
  }

  public String ReadFile(String Path) {
    BufferedReader reader = null;
    String laststr = "";
    try {
      FileInputStream fileInputStream = new FileInputStream(Path);
      InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
      reader = new BufferedReader(inputStreamReader);
      String tempString = null;
      while ((tempString = reader.readLine()) != null) {
        laststr += tempString;
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return laststr;
  }
}
