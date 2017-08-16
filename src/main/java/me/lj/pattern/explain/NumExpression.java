package me.lj.pattern.explain;

public class NumExpression extends ArithemticExpression{

	private int num;
	
	public NumExpression(int num){
		this.num = num;
	}
	
	@Override
	public int interpreter() {
		return num;
	}
}
