package me.lj.pattern.facade;

public class PhoneImpl implements Phone{

	@Override
	public void dail() {
		System.out.println("��绰");
	}

	@Override
	public void hangup() {
		System.out.println("�Ҷ�");
	}

}
