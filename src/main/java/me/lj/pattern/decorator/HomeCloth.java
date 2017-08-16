package me.lj.pattern.decorator;

public class HomeCloth extends PersonCloth{

	public HomeCloth(Person mPerson) {
		super(mPerson);
	}

	/**
	 * ���̿�
	 */
	private void dressShorts(){
		System.out.println("���̿�");//�ڼ�������
	}
	
	@Override
	public void dressed() {
		super.dressed();
		dressShorts();
	}
	
}
