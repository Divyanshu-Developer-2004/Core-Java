package Inheritance;

public class Human {
	String name;
	int age;
	char gender;
	
	public Human(String name,int age,char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void Human_data() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("Dhara",34,'M',1332,70000.0);
		Student s1=new Student("Janki",45,'F',88.76);
		e1.display();
		s1.display();
	}
}
