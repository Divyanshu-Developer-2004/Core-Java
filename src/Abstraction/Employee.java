package Abstraction;

public abstract class Employee {
	
	int id;
	String name;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public abstract void printEmployee();
	
	public static void main(String[] args) {
		Raju r1=new Raju(11,"Raju",100000.0);
		r1.printEmployee();
		
		Employee r2=new Raju(33,"Raju2",230000.5);
		r2.printEmployee();
	}
}

class Raju extends Employee{
	
	double sal;
	
	public Raju(int id,String name,double sal) {
		super(id,name);
		this.sal=sal;
	}
	
	@Override
	public void printEmployee() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		System.out.println();
	}
}