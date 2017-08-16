package me.lj.pattern.observer;

/**
 *  抽象观察者类，为�?有具体观察�?�定义一个接口，在得到�?�知时更新自�?
 */
public interface Observer {
	/**
	 *  有更�?
	 *  
	 *  @param message 消息
	 */
	public void update(String message);
	
}