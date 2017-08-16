package me.lj.pattern.builder;

public class ConcreteBuilder implements Builder {

	Part partA, partB, partC;
	
	@Override
	public void buildPartA() {
		//这里是具体如何构建partA的代�?
		System.out.println("构建partA");
	}

	@Override
	public void buildPartB() {
		//这里是具体如何构建partB的代�?
		System.out.println("构建partB");
	}

	@Override
	public void buildPartC() {
		//这里是具体如何构建partC的代�?
		System.out.println("构建partC");
	}

	@Override
	public Product getResult() {
		//返回�?后组装成品结�?
		return null;
	} 
	
}
