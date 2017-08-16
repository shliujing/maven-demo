package me.lj.pattern.memorandum;

public class Client {
	public static void main(String[] args) {
		//������Ϸ����
		CallOfDuty game = new CallOfDuty();
		//1.����Ϸ
		game.play();
		
		Caretaker caretaker = new Caretaker();
		//2.��Ϸ�浵
		caretaker.archive(game.createMemento());
		//3.�˳���Ϸ
		game.quit();
		//4.�ָ���Ϸ
		CallOfDuty newGame = new CallOfDuty();
		newGame.restore(caretaker.getMemento());
		
		//5.�ٴδ���Ϸ(���浵)
		game.play();
		//6.�ָ�֮ǰ�浵
		newGame.restore(caretaker.getMemento());
	}
}
