package me.lj.pattern.template;

/**
 * 抽象�? Computer
 */
public abstract class AbstractComputer {
	//下面是基本方法，子类可以覆盖,不允许外部直接调用这些方法，�?以用protected
	/**
     * �?启电�?
     */
	protected abstract void powerOn();
	
	/**
     * �?查硬�?
     */
	protected abstract void checkHardware();
	
	/**
     * 载入操作系统
     */
	protected abstract void loadOS();
	
	/**
     * 登录
     */
	protected abstract void login();
	
	//下面是钩子方法，声明并实�?
	/**
     * 是否�?要登�?
     * 
     * @return true为需要登�?
     */
	protected boolean isLogin(){
        return true;
    }
	
	//下面是模板方法，定义为final，子类不能覆盖此方法 
	/**
     * 启动计算机方法，步骤为开启电源�?�系统检查�?�加载系统�?�检查是否登录�??
     */
	public final void startUp(){
		System.out.println("--------�?�? START--------");
		powerOn();
		checkHardware();
		loadOS();
		if(isLogin()){
			login();
		}
		System.out.println("-------- �?�? END --------");
	}
	
}
