package me.lj.pattern.bridge;

public abstract class Coffee{
	
	protected CoffeeAdditives impl;

	public Coffee(CoffeeAdditives impl) {
		this.impl = impl;
	}
	
	/**
	 * 咖啡具体�?么样由子类决�? 
	 */
	public abstract void makeCoffee();
}