package me.lj.pattern.iterator;

public class Manager extends Leader{

	@Override
	public int limit() {
		return 10000;
	}

	@Override
	public void handle(int money) {
		System.out.println("������������"+ money +"Ԫ");
	}

	@Override
	public String getLeader() {
		return "��ǰ�Ǿ���";
	}

}

