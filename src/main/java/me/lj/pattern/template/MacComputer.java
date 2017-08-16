package me.lj.pattern.template;

/**
 * Mac系统电脑
 */
public class MacComputer extends AbstractComputer{

	@Override
	protected void powerOn() {
		System.out.println("Mac电脑�?启电�?");
	}

	@Override
	protected void checkHardware() {
		System.out.println("Mac电脑�?查硬�?");
	}

	@Override
	protected void loadOS() {
		System.out.println("Mac电脑载入操作系统");
	}

	@Override
	protected void login() {
		System.out.println("Mac电脑登录");
	}

}
