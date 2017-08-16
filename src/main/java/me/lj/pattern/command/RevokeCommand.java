package me.lj.pattern.command;

public class RevokeCommand implements Command{

	//����һ��������������Ϸ���������
	private PushBox pushBox;
		
	public RevokeCommand(PushBox pushBox){
		this.pushBox = pushBox;
	}
	
	@Override
	public void execute() {
		//���þ�������
		pushBox.revoke();;
	}
	@Override
	public void getCommand() {
	}
}


