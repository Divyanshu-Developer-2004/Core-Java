package Static_Non_Static;

public class Student_Constructor_Chaining {
	int id;
	String name;
	long phone;
	
	public Student_Constructor_Chaining(int id) {// No argument constructor
		this.id=id;
	}
	
	public Student_Constructor_Chaining(int id,String name) {//Parameterized constructor
		this(id);
		this.name=name;
	}
	
	public Student_Constructor_Chaining(int id,String name,long phone) {
		this(id,name);
		this.phone=phone;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(phone);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Student_Constructor_Chaining s1=new Student_Constructor_Chaining(11,"Jwala",1991645871);
		s1.display();
		Student_Constructor_Chaining s2=new Student_Constructor_Chaining(24,"Jadu",1884442200);
		s2.display();
	}
}
