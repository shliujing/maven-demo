package me.lj.pattern.decorator;

public class OutsideCloth extends PersonCloth{

	public OutsideCloth(Person mPerson) {
		super(mPerson);
	}

	/**
	 * ������ 
	 */
	private void dressShirt(){
		System.out.println("��������");
	}
	
	/**
	 * ��ţ�п� 
	 */
	private void dressJean(){
		System.out.println("��ţ�п�");
	}
	
	/**
	 * ��Ь�� 
	 */
	private void dressShoes(){
		System.out.println("��Ь�� ");
	}
	
	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressJean();
		dressShoes();
	}
	
}
