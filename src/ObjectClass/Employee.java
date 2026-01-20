package ObjectClass;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	
	@Override
	public String toString() {//Overriding toString method 
		return "id : "+id+", Name: "+name+", Salary: "+salary+", Department: "+department;
	}
	
	Employee(int id,String name,double salary,String department){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(4,"Dinga",54333.32,"Sales");
		Employee e2=new Employee(1,"Dunga",43633.32,"Sales");
		Employee e3=new Employee(7,"Dingi",104333.32,"IT");
		Employee[] emp= {e1,e2,e3};
		System.out.println(emp[0]);
		System.out.println(emp[1]);
		System.out.println(emp[2]);
		System.out.println(emp[0]);
	}
}
