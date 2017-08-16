package me.lj.pattern.visitor;

public class CTOVisitor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("攻城狮：" + engineer.name + ", 代码数量:" + engineer.getCodeLines());
	}

	@Override
	public void visit(Manager manager) {
		System.out.println("经理�?" + manager.name +", 产品数量 �?" + manager.getProducts());
	}

}

