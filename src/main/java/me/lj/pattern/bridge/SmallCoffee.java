package me.lj.pattern.bridge;

public class SmallCoffee extends Coffee{

	public SmallCoffee(CoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffee() {
		System.out.println("小杯�?" + impl.addSomething() + "咖啡");
	}
}
