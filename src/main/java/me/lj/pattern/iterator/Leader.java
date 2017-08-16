package me.lj.pattern.iterator;

public abstract class Leader {
	/**
	 * �ϼ��쵼������
	 */
	protected Leader nextHandler;
	
	/**
	 * ����������
	 * 
	 * @param money �������ı��˶�� 
	 * 
	 */
	public final void handleRequest(int money){
		System.out.println(getLeader());
		if(money <=limit()){
			handle(money);
		}else{
			System.out.println("���˶�Ȳ��㣬�ύ�쵼");
			if(null != nextHandler){
				nextHandler.handleRequest(money);
			}
		}
	}
	
	/**
	 * �����������Ķ��Ȩ��
	 * 
	 * @return ���
	 */
	public abstract int limit();
	
	/**
	 * ��������Ϊ
	 * 
	 * @param money ������
	 */
	public abstract void handle(int money);
	
	/**
	 * ��ȡ������
	 * 
	 * @return ������
	 */
	public abstract String getLeader();
}
