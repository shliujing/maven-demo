package me.lj.pattern.decorator;

public class HomeCloth extends PersonCloth{

	public HomeCloth(Person mPerson) {
		super(mPerson);
	}

	/**
	 * 穿短裤
	 */
	private void dressShorts(){
		System.out.println("穿短裤");//在家里随便点
	}
	
	@Override
	public void dressed() {
		super.dressed();
		dressShorts();
	}
	
}
