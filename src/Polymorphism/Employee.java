package Polymorphism;

public class Employee {
	int id;
	String name;
	double salary;
	String dep;
	
	public Employee(){
		
	}
	
	public Employee(int id){
		this.id=id;
	}
	
	public Employee(int id,String name){
		this(id);
		this.name=name;
	}
	
	public Employee(int id,String name,String dep){
		this(id,name);
		this.dep=dep;
	}
	
	public Employee(int id,String name,String dep,double salary){
		this(id,name,dep);
		this.salary=salary;
	}
	
	public void display() {
		System.out.println(this.id+" "+this.name+" "+this.dep+" "+this.salary);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Dinga","Sales");
		Employee e2=new Employee(106,"Dingi","Devops",64000.0);
		e1.display();
		e2.display();
	}
}
