package me.lj.pattern.component;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir {
	/**
	 * ����һ��List��Ա�����������ļ����µ�����Ԫ��
	 */
	protected List<Dir> dirs = new ArrayList<Dir>();
	
	private String name; //��ǰ�ļ����ļ�����

	public Dir(String name) {
		this.name = name;
	}
	
	/**
	 * ���һ���ļ����ļ���
	 * 
	 * @param dir �ļ����ļ���
	 */
	public abstract void addDir(Dir dir);
	
	/**
	 * �Ƴ�һ���ļ����ļ���
	 * 
	 * @param dir �ļ����ļ���
	 */
	public abstract void rmDir(Dir dir);
		
	/**
	 * ����ļ���������Ԫ��
	 */
	public abstract void clear();
	
	/**
	 * ����ļ���Ŀ¼�ṹ
	 */
	public abstract void print();
	
	/**
	 * ��ȡ�ļ��������е��ļ����ļ���
	 * 
	 * @return �ļ��������е��ļ����ļ���
	 */
	public abstract List<Dir> getFiles();
	
	/**
	 * ��ȡ�ļ����ļ�����
	 * 
	 * @return �ļ����ļ�����
	 */
	public String getName(){
		return name;
	}
}
