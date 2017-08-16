package me.lj.pattern.template;

/**
 * Windows系统电脑
 */
public class WindowsComputer extends AbstractComputer{

	@Override
	protected void powerOn() {
		System.out.println("Windows电脑�?启电�?");
	}

	@Override
	protected void checkHardware() {
		System.out.println("Windows电脑�?查硬�?");
	}

	@Override
	protected void loadOS() {
		System.out.println("Windows电脑载入操作系统");
	}

	@Override
	protected void login() {
		
	}

	@Override
	protected boolean isLogin() {
		return false;//返回false，不�?登录
	}

}
