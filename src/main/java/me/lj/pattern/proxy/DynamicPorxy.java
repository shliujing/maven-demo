package me.lj.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicPorxy implements InvocationHandler{

	private Object obj; //被代理类的引�?
	
	public DynamicPorxy(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 调用被代理类对象的方�?
		Object result = method.invoke(obj, args);
		return result;
	}

}
