package Static_Non_Static_And_Object;

public class Student_Constructor_Example {

	int id;
	String name;
	
	public Student_Constructor_Example() {// No argument constructor
		System.out.println("Constructor");
	}
	
	public Student_Constructor_Example(int id,String name) {//Parameterized constructor
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Student_Constructor_Example s1=new Student_Constructor_Example();
		s1.display();
		Student_Constructor_Example s2=new Student_Constructor_Example(24,"Jadu");
		s2.display();
	}
}
