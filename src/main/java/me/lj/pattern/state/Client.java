package me.lj.pattern.state;

public class Client {
	public static void main(String[] args) {
		TVController tvController = new TVController();
		//设置�?机状�?
		tvController.powerOn();
		//下一频道
		tvController.nextChannel();
		//调高音量
		tvController.turnUp();
		//关机
		tvController.powerOff();
		//调低音量，此时不会生�?
		tvController.turnDown();
	}
}
