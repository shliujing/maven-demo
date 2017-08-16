package me.lj.pattern.flyweight;

final class Client {
	public static void main(String[] args) {
		Ticket ticket01 = TicketFactory.getTicket("����", "�ൺ");
		ticket01.showTicketInfo("����");
		
		Ticket ticket02 = TicketFactory.getTicket("����", "�ൺ");
		ticket02.showTicketInfo("����");
		
		Ticket ticket03 = TicketFactory.getTicket("����", "����");
		ticket03.showTicketInfo("��Ʊ");
	}
}
