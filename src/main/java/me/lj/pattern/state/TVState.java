package me.lj.pattern.state;

/**
 * 电视状�?�接口，定义了电视的操作函数
 * 
 * */
public interface TVState {
	
	public void nextChannel();
	public void prevChannel();
	public void turnUp();
	public void turnDown();
	
}
