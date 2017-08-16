package me.lj.pattern.decorator;

public class PersonCloth extends Person{
	
	protected Person mPerson; //����һ��Person�������
	
	public PersonCloth(Person mPerson) {
		super();
		this.mPerson = mPerson;
	}

	@Override
	public void dressed() {
		mPerson.dressed();
	}
}
