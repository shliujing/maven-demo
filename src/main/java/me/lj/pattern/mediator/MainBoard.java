package me.lj.pattern.mediator;

public class MainBoard extends Mediator{
	
	private CDDevice cdDevice; //�����豸
	private CPU cpu; //CPU
	private SoundCard soundCard; //�����豸
	private GraphicsCard graphicsCard; //�Կ��豸

	@Override
	public void changed(Colleague c) {
		//���������ȡ������
		if(c == cdDevice){
			handleCD((CDDevice) c);
		}
		//���CPU����������
		else if(c == cpu){
			handleCD((CPU) c);
		}
	}

	/**
	 * ���������ȡ���ݺ��������豸�Ľ���
	 * 
	 * @param cdDevice �����豸
	 */
	public void handleCD(CDDevice cdDevice){
		cpu.decodeData(cdDevice.read());
	}
	
	/**
	 * ����CPU��ȡ���ݺ��������豸�Ľ���
	 * 
	 * @param cpu CPU
	 */
	public void handleCD(CPU cpu){
		soundCard.soundPlay(cpu.getDataSound());
		graphicsCard.videoPlay(cpu.getDataVideo());
	}
	
	/**
	 * ����CD�豸
	 * 
	 * @param CDDevice CD�豸
	 */
	public void setCDDevice(CDDevice cdDevice){
		this.cdDevice = cdDevice;
	}
	
	/**
	 * ����CPU
	 * 
	 * @param cpu CPU
	 */
	public void setCPU(CPU cpu){
		this.cpu = cpu;
	}
	
	/**
	 * ���������豸
	 * 
	 * @param soundCard �����豸
	 */
	public void setSoundCard(SoundCard soundCard){
		this.soundCard = soundCard;
	}
	
	/**
	 * �����Կ��豸
	 * 
	 * @param graphicsCard �Կ��豸
	 */
	public void setGraphicsCard(GraphicsCard graphicsCard){
		this.graphicsCard = graphicsCard;
	}
}
