package me.lj.pattern.mediator;

public class Client {

	public static void main(String[] args) {
		//�����������
		MainBoard mediator = new MainBoard();
		
		//�ֱ���������
		CDDevice cd = new CDDevice(mediator);
		CPU cpu = new CPU(mediator);
		GraphicsCard gc = new GraphicsCard(mediator);
		SoundCard sc = new SoundCard(mediator);
		
		//�����������װ������
		mediator.setCDDevice(cd);
		mediator.setCPU(cpu);
		mediator.setGraphicsCard(gc);
		mediator.setSoundCard(sc);
		
		//���ŵ�Ӱ
		cd.load();
	}

}
