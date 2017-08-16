package me.lj.pattern.iterator;

public class Client {
	public static void main(String[] args) {
		//��������쵼����
		GroupLeader groupLeader = new GroupLeader();
		Director director = new Director();
		Manager manager = new Manager();
		Boss boss = new Boss();
		//�����ϼ��쵼�����߶���
		groupLeader.nextHandler = director;
		director.nextHandler = manager;
		manager.nextHandler = boss;
		
		//����������
		groupLeader.handleRequest(8000);
		
	}
}
