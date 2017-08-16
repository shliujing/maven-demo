package me.lj.pattern.visitor;

import java.util.Random;

/**
 * 攻城�? 
 */
public class Engineer extends Staff{

	private int codeLines;//代码数量
	
	public Engineer(String name) {
		super(name);
		codeLines = new Random().nextInt(10 * 10000);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	//攻城狮这�?年写的代码数�?
	public int getCodeLines(){
		return codeLines;
	}
}
