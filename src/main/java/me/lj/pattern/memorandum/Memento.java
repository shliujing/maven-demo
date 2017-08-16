package me.lj.pattern.memorandum;

/**
 * ����¼��
 */
public class Memento {
	public int mCheckpoint;//����

	public int mLiftValue;//����

	public String mWeapon;//�ؿ�

	@Override
	public String toString() {
		return "Memento [mCheckpoint=" + mCheckpoint + ",mLiftValue="
				+ mLiftValue + ",mWeapon=" + mWeapon + "]";
	}

}
