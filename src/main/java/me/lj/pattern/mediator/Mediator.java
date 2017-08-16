package me.lj.pattern.mediator;

public abstract class Mediator {

	/**
	 * ͬ�¶���ı�ʱ֪ͨ�н��ߵķ���
	 * ��ͬ�¶���ı�ʱ���н���ȥ֪ͨ������ͬ�¶���
	 * 
	 * @param c ͬ�¶���
	 */
	public abstract void changed(Colleague c);
}
