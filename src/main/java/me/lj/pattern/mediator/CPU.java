package me.lj.pattern.mediator;

public class CPU extends Colleague{
	
	private String dataVideo, dataSound; //��Ƶ����Ƶ����

	public CPU(Mediator mediator) {
		super(mediator);
	}

	/**
	 * ��ȡ��Ƶ����
	 * 
	 * @return ��Ƶ����
	 */
	public String getDataVideo(){
		return dataVideo;
	}
	
	/**
	 * ��ȡ��Ƶ����
	 * 
	 * @return ��Ƶ����
	 */
	public String getDataSound(){
		return dataSound;
	}
	
	/**
	 * ��������
	 * 
	 * @param data������Ƶ����
	 */
	public void decodeData(String data){
		//�ָ�������Ƶ����
		String[] tmp = data.split(",");
		
		//����������Ƶ����
		dataVideo = tmp[0];
		dataSound = tmp[1];
		
		//�����н�������״̬�ı�
		mediator.changed(this);
	}
}
