package me.lj.pattern.cursor;


public class CompanyHui implements Company{

	private Employee[] array = new Employee[3];
	
	public CompanyHui(){
		array[0] = new Employee("辉哥", 28, "男", "程序猿");
		array[1] = new Employee("小红", 23, "男", "程序猿");
		array[2] = new Employee("小辉", 25, "男", "程序猿");
	}

	public Employee[] getEmployees(){
		return array;
	}

	@Override
	public Iterator iterator() {
		return new HuiIterator(array);
	}
}
