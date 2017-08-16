package me.lj.pattern.flyweight;

import java.util.Random;

//��Ʊ
public class TrainTicket implements Ticket{

	public String from; // ʼ����
	public String to; // Ŀ�ĵ�
	public String bunk; //��λ
	public int price; //�۸�
	
	public TrainTicket(String from, String to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public void showTicketInfo(String bunk) {
		price = new Random().nextInt(300);
		System.out.println("���� �� " + from + " �� " + to + "��" + bunk + "��Ʊ" + ", �۸�" + price);
	}

}
