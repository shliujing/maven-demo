package me.lj.pattern.decorator;

public class Client {
	public static void main(String[] args) {
		//������һ���к�
		Person person = new Boy();
		
		//�ڼ�
		PersonCloth personCloth = new HomeCloth(person);
		personCloth.dressed();
		System.out.println("--------------");
		//����
		PersonCloth personCloth1 = new OutsideCloth(person);
		personCloth1.dressed();
		
	}
}
