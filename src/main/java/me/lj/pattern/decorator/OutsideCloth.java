package me.lj.pattern.decorator;

public class OutsideCloth extends PersonCloth{

	public OutsideCloth(Person mPerson) {
		super(mPerson);
	}

	/**
	 * 穿短袖 
	 */
	private void dressShirt(){
		System.out.println("穿件短袖");
	}
	
	/**
	 * 穿牛仔裤 
	 */
	private void dressJean(){
		System.out.println("穿牛仔裤");
	}
	
	/**
	 * 穿鞋子 
	 */
	private void dressShoes(){
		System.out.println("穿鞋子 ");
	}
	
	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressJean();
		dressShoes();
	}
	
}
