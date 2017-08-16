package me.lj.pattern.explain;

public class Client {
	public static void main(String[] args) {
		Calculator c = new Calculator("22 + 553 + 83 + 5");
		System.out.println("计算结果�?"+c.calculate());
	}
}
