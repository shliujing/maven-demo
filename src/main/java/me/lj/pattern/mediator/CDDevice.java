package me.lj.pattern.mediator;

public class CDDevice extends Colleague{

	private String data; //��Ƶ����
	
	public CDDevice(Mediator mediator) {
		super(mediator);
	}

	/**
	 * ��ȡ��Ƶ����
	 * 
	 * @return ��Ƶ����
	 */
	public String read(){
		return data;
	}
	
	/**
	 * ������Ƶ����
	 * 
	 * @return ��Ƶ����
	 */
	public void load(){
		data = "��Ƶ����,��Ƶ����";
		//�����н�������״̬�ı�
		mediator.changed(this);
	}
}
