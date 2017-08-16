package me.lj.pattern.factory;

public abstract class Factory {
	/**
	 * ���󹤳�����
	 * ����������ʵ��
	 * 
	 * @param clz ��Ʒ����������
	 * 
	 * @return ����Ĳ�Ʒ����
	 * */
	public abstract <T extends Product> T createProduct(Class<T> clz);
}
