package me.lj.pattern.visitor;



public class Client {
	public static void main(String[] args) {
		//构建报表
		BusinessReport report = new BusinessReport();
		System.out.println("===== 给CEO看报�? =====");
		//设置访问者CEO
		report.showReport(new CEOVisitor());
		System.out.println("===== 给CTO看报�? =====");
		//设置访问者CTO
		report.showReport(new CTOVisitor());
	}
}
