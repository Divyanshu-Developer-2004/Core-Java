package Inheritance;

public class Employee extends Human {
	int id;
	double salary;
	
	public Employee(String name,int age,char gender,int id,double salary) {
		super(name,age,gender);
		this.id=id;
		this.salary=salary;
	}
	
	public void display() {
		Human_data();
		System.out.println(id);
		System.out.println(salary);
		System.out.println();
	}
}
