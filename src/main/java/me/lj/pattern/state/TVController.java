package me.lj.pattern.state;

/**
 * 电视遥控�?
 * 
 * */
public class TVController implements PowerController{

	TVState mTVState;
	
	public void setTVState(TVState mTVState){
		this.mTVState = mTVState;
	}
	
	@Override
	public void powerOn() {
		setTVState(new PowerOnState());
		System.out.println("�?机了");
	}

	@Override
	public void powerOff() {
		setTVState(new PowerOffState());
		System.out.println("关机�?");
	}
	
	public void nextChannel(){
		mTVState.nextChannel();
	}
	
	public void prevChannel(){
		mTVState.prevChannel();
	}
	
	public void turnUp(){
		mTVState.turnUp();
	}
	
	public void turnDown(){
		mTVState.turnDown();
	}
}
