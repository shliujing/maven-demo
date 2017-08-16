package me.lj.pattern.proxy;

public class XiaoMin implements ILawsuit{

	@Override
	public void submit() {
		//小民申请仲裁
		System.out.println("老板年底拖欠工资，特此申请仲裁！");
	}

	@Override
	public void burden() {
		//小民提交证据
		System.out.println("这是合同书和过去�?年的银行工资流水�?");
	}

	@Override
	public void defend() {
		//铁证如山
		System.out.println("证据确凿，不�?要再说什么！");
	}

	@Override
	public void finish() {
		//结果
		System.out.println("诉讼成功，判决�?�板即日起七天内结算工资�?");
	}

}
