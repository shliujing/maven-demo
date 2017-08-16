package me.lj.pattern.component;

import java.util.List;

public class File extends Dir{

	public File(String name) {
		super(name);
	}

	@Override
	public void addDir(Dir dir) {
		throw new UnsupportedOperationException("�ļ�����֧�ָò�����");
	}

	@Override
	public void rmDir(Dir dir) {
		throw new UnsupportedOperationException("�ļ�����֧�ָò�����");
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("�ļ�����֧�ָò�����");
	}

	@Override
	public void print() {
		System.out.print(getName());
	}

	@Override
	public List<Dir> getFiles() {
		throw new UnsupportedOperationException("�ļ�����֧�ָò�����");
	}

}
