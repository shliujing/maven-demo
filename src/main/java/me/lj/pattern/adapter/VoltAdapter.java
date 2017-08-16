package me.lj.pattern.adapter;
//类适配器模式
public class VoltAdapter extends Volt220 implements FiveVolt{

	@Override
	public int getVolt5() {
		return 5;
	}
	
}
