package me.lj.pattern.mediator;

public class GraphicsCard extends Colleague{

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * ������Ƶ����
	 * 
	 * @param ��Ƶ����
	 */
	public void videoPlay(String data){
		System.out.println("��Ƶ��" + data);
	}
}
