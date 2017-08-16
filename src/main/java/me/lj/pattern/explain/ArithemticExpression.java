package me.lj.pattern.explain;

public abstract class ArithemticExpression {
	/**
	 * 抽象的解析方�? 
	 * 具体的解析�?�辑由具体的子类实现
	 * 
	 * @return 解析得到具体的�??
	 */
	public abstract int interpreter();
}
