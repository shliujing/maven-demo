package me.lj.pattern.visitor;

public interface Visitor {
	/**
	 * 访问攻城狮类�?
	 */
	public void visit(Engineer engineer);
	
	/**
	 * 访问经理类型
	 */
	public void visit(Manager manager);
}
