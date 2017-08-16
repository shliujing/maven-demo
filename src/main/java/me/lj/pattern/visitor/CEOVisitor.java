package me.lj.pattern.visitor;

public class CEOVisitor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("攻城狮：" + engineer.name + ", KPI:" + engineer.kpi);
	}

	@Override
	public void visit(Manager manager) {
		System.out.println("经理�?" + manager.name + ", KPI:" + manager.kpi
				+ ", 新产品数�? �?" + manager.getProducts());
	}

}
