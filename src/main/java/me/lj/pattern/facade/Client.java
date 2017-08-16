package me.lj.pattern.facade;

public class Client {

	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone();
		
		//拍照
		mobilePhone.takePicture();
		//视频聊天
		mobilePhone.videoChat();
	}

}
