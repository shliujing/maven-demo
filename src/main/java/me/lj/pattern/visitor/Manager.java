package me.lj.pattern.visitor;

import java.util.Random;

/**
 * 经理
 */
public class Manager extends Staff{

	private int products;//产品数量
	
	public Manager(String name) {
		super(name);
		products = new Random().nextInt(10);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	//�?年内做的产品数量
	public int getProducts(){
		return products;
	}
}
