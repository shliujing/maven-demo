package me.lj.pattern.cursor;


public class CompanyHui implements Company{

	private Employee[] array = new Employee[3];
	
	public CompanyHui(){
		array[0] = new Employee("�Ը�", 28, "��", "����Գ");
		array[1] = new Employee("С��", 23, "��", "����Գ");
		array[2] = new Employee("С��", 25, "��", "����Գ");
	}

	public Employee[] getEmployees(){
		return array;
	}

	@Override
	public Iterator iterator() {
		return new HuiIterator(array);
	}
}
