package me.lj.pattern.observer;

/**
 * 抽象被观察�?�类
 */
public interface Observable {

	/**
	 * 推�?�消�?
	 * 
	 * @param message 内容
	 */
	void push(String message);

	/**
	 * 订阅
	 * 
	 * @param observer 订阅�?
	 */
	void register(Observer observer);
}
