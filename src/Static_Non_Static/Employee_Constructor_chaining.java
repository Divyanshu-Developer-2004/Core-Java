package Static_Non_Static;

public class Employee_Constructor_chaining {

	public Employee_Constructor_chaining() {
		System.out.println("C1");
	}
	
	public Employee_Constructor_chaining(int a) {
		this();
		System.out.println("C2");
	}
	
	public static void main(String[] args) {
		Employee_Constructor_chaining e=new Employee_Constructor_chaining(24);
	}
}
