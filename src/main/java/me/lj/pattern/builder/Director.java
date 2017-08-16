package me.lj.pattern.builder;

//Director 类，负责制�??
public class Director {

	private Builder builder;

	public Director( Builder builder ) { 
		this.builder = builder; 
	}	// 将部件partA partB partC�?后组成复杂对�?

	// 这里是将车轮 方向盘和发动机组装成汽车的过�?
	public void construct() { 
		
		builder.buildPartA();
	    builder.buildPartB();
		builder.buildPartC();

	}
}