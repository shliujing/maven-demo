package me.lj.pattern.adapter;

public class Test {

	public static void main(String[] args) {
		VoltAdapter adapter = new VoltAdapter();
		System.out.println("输出电压：" + adapter.getVolt5());
	}

}
