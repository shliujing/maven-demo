package me.lj.pattern.state;

/**
 * 
 * ċĵ?ĉşçĥĉïĵĉä½ĉĉ
 * 
 * */
public class PowerOnState implements TVState{

	@Override
	public void nextChannel() {
		System.out.println("ä¸ä¸é˘é");
	}

	@Override
	public void prevChannel() {
		System.out.println("ä¸ä¸é˘é");
	}

	@Override
	public void turnUp() {
		System.out.println("è°éĞé³é");
	}

	@Override
	public void turnDown() {
		System.out.println("è°ä½é³é");
	}
}
