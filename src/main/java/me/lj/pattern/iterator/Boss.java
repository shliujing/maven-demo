package me.lj.pattern.iterator;

public class Boss extends Leader{

	@Override
	public int limit() {
		return Integer.MAX_VALUE;
	}

	@Override
	public void handle(int money) {
		System.out.println("�ϰ���������"+ money +"Ԫ");
	}

	@Override
	public String getLeader() {
		return "��ǰ���ϰ�";
	}

}

