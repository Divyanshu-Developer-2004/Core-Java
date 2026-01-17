package Inheritance;

public class Student extends Human{
	double percen;
	
	public Student(String name,int age,char gender,double percen) {
		super(name,age,gender);
		this.percen=percen;
	}
	
	public void display() {
		Human_data();
		System.out.println(percen);
		System.out.println();
	}
}
