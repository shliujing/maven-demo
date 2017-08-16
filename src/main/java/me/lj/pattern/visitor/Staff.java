package me.lj.pattern.visitor;

import java.util.Random;

/**
 * 员工基类（Element�? 
 */
public abstract class Staff {
	//员工姓名
	public String name;
	//员工KPI
	public int kpi;
	
	public Staff(String name) {
		super();
		this.name = name;
		this.kpi = new Random().nextInt(10);
	}
	//接受Visitor的访�?
	public abstract void accept(Visitor visitor);
	
}
