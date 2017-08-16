package me.lj.pattern.mediator;

public class SoundCard extends Colleague{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * ������Ƶ����
	 * 
	 * @param ��Ƶ����
	 */
	public void soundPlay(String data){
		System.out.println("��Ƶ��" + data);
	}
}
