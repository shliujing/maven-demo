package me.lj.pattern.cursor;

public class Employee {

	private String name;// ����
	private int age;// ����
	private String sex;// �Ա�
	private String position;// ְλ

	public Employee(String name, int age, String sex, String position) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.position = position;
	}

	// �򻯴��룬ʡ��setter��getter����

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", sex="
				+ sex + ", position='" + position + '\'' + "}";
	}
}
