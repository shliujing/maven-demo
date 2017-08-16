package me.lj.pattern.facade;

public class Client {

	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone();
		
		//����
		mobilePhone.takePicture();
		//��Ƶ����
		mobilePhone.videoChat();
	}

}
