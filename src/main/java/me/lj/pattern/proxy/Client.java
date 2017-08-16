package me.lj.pattern.proxy;

import java.lang.reflect.Proxy;


public class Client {
	public static void main(String[] args) {
		//构�?�出诉讼人小�?
		ILawsuit xiaomin = new XiaoMin();
		
		//1.静�?�代�?
		//构�?�一个代理律师，并将小民传�?�进�?
		//ILawsuit lawyer = new Lawyer(xiaomin);
		
		//--------------------------------------
		//2.动�?�代�?
		//构�?�一个动态代�?
		DynamicPorxy proxy = new DynamicPorxy(xiaomin);
		
		//获取被代理类小民的ClassLoader
		ClassLoader loader = xiaomin.getClass().getClassLoader();
		
		//动�?�构造一个代理�?�律�?
		ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ ILawsuit.class }, proxy);
		
		//律师提交申请
		lawyer.submit();
		
		//律师进行举证
		lawyer.burden();
		
		//律师代小民辩�?
		lawyer.defend();
		
		//完成诉讼
		lawyer.finish();
	}
}
