package me.lj.pattern.abfactory;

public class NormalBrake implements IBrake{
	@Override
	public void brake() {
		System.out.println("普通制动");
	}
}
