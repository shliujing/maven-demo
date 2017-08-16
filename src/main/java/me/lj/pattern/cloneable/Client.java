package me.lj.pattern.cloneable;

public class Client {
	public static void main(String[] args) {
        try {
            Book book1 = new Book(50,"��1","����");
            book1.addImage("ͼ1");
            book1.showBook();

            Book book2 = (Book) book1.clone();
            book2.showBook();

            book2.setTitle("��2");
            book2.addImage("ͼ2");
            book2.showBook();

            book1.showBook();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
