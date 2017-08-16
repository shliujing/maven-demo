package me.lj.pattern.memorandum;

/**
 * Caretaker���������Memento
 */
public class Caretaker {

	Memento mMemento; //����¼
	
	/**
	 * �浵
	 */
	public void archive(Memento memento){
		this.mMemento = memento;
	}
	
	/**
	 * ��ȡ�浵
	 */
	public Memento getMemento(){
		return mMemento;
	}
}
