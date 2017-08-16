package me.lj.pattern.memorandum;

/**
 * 
 * ��ģ�⡰ʹ���ٻ�����Ϸ 
 * 
 */

public class CallOfDuty {
	
	private int mCheckpoint = 1;
	
	private int mLiftValue = 100;
	
	private String mWeapon = "ɳĮ֮ӥ";
	
	//����Ϸ
	public void play(){
		System.out.println("����Ϸ��"+String.format("��%d��", mCheckpoint) + "��սɱ����");
		mLiftValue -= 10;
		System.out.println("����������");
		mCheckpoint++;
		System.out.println("����" + String.format("��%d��", mCheckpoint));
	}
	
	//�˳���Ϸ
	public void quit(){
		System.out.println("--------------");
		System.out.println("�˳�ǰ����Ϸ���ԣ�" + this.toString());
		System.out.println("�˳���Ϸ");
		System.out.println("--------------");
	}
	
	/**
	 *��������¼ 
	 */
	public Memento createMemento(){
		Memento memento = new Memento();
		memento.mCheckpoint = mCheckpoint;
		memento.mLiftValue = mLiftValue;
		memento.mWeapon = mWeapon;
		return memento;
	}
	
	//�ָ���Ϸ
	public void restore(Memento memento){
		this.mCheckpoint = memento.mCheckpoint;
		this.mLiftValue = memento.mLiftValue;
		this.mWeapon = memento.mWeapon;
		System.out.println("�ָ������Ϸ���ԣ�" + this.toString());
	}
	
	@Override
	public String toString() {
		return "CallOfDuty [mCheckpoint=" + mCheckpoint + ",mLiftValue="
				+ mLiftValue + ",mWeapon=" + mWeapon + "]";
	}
}
