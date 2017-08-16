package me.lj.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

//员工业务报表类（ObjectStructure�?
public class BusinessReport {

	List<Staff> mStaffs = new LinkedList<Staff>();

	public BusinessReport() {
		mStaffs.add(new Manager("王经�?"));
		mStaffs.add(new Engineer("攻城�?-A"));
		mStaffs.add(new Engineer("攻城�?-B"));
		mStaffs.add(new Manager("李经�?"));
		mStaffs.add(new Engineer("攻城�?-C"));
	}
	
	/**
	 * 为访问�?�展示报�? 
	 * @param visitor 如CEO、CTO
	 */
	public void showReport(Visitor visitor){
		for(Staff staff : mStaffs){
			staff.accept(visitor);
		}
	}
}
