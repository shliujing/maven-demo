package me.lj.pattern.state;

/**
 * 
 * �?机状态，操作有效
 * 
 * */
public class PowerOnState implements TVState{

	@Override
	public void nextChannel() {
		System.out.println("下一频道");
	}

	@Override
	public void prevChannel() {
		System.out.println("上一频道");
	}

	@Override
	public void turnUp() {
		System.out.println("调高音量");
	}

	@Override
	public void turnDown() {
		System.out.println("调低音量");
	}
}
