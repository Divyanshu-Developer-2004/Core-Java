package Static_Non_Static_And_Object;

public class Employee {
	int id;
	String name;
	double salary;
	
	public void work() {
		System.out.println(name+" is working...");
	}
	public void Employee_data() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e2.id=1;
		e2.name="Ramu";
		e2.salary=8.5;
		e1.id=2;
		e1.name="Mamu";
		e1.salary=6.4;
		e3.id=3;
		e3.name="Jamu";
		e3.salary=5.1;
		e1.work();
		e3.work();
		e2.Employee_data();
		
	}
}
