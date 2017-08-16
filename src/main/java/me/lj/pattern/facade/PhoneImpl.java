package me.lj.pattern.facade;

public class PhoneImpl implements Phone{

	@Override
	public void dail() {
		System.out.println("打电�?");
	}

	@Override
	public void hangup() {
		System.out.println("挂断");
	}

}
