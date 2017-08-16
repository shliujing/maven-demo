package me.lj.pattern.observer;

/**
 * ���󱻹۲�����
 */
public interface Observable {

	/**
	 * ������Ϣ
	 * 
	 * @param message ����
	 */
	void push(String message);

	/**
	 * ����
	 * 
	 * @param observer ������
	 */
	void register(Observer observer);
}
