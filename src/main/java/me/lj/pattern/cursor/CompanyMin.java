package me.lj.pattern.cursor;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Company{
	
	private List<Employee> list = new ArrayList<>();
	
	public CompanyMin(){
		list.add(new Employee("С��", 26, "��", "����Գ"));
		list.add(new Employee("Сܿ", 22, "Ů", "����"));
		list.add(new Employee("С��", 18, "Ů", "����"));
		list.add(new Employee("�ɶ�", 21, "Ů", "���"));
		list.add(new Employee("����", 19, "Ů", "���"));
	}

	public List<Employee> getEmployees(){
		return list;
	}

	@Override
	public Iterator iterator() {
		return new MinIterator(list);
	}
}
