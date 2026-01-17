package Encapsulation;

public class Accessing_Encapsulation {
	
	public static void main(String[] args) {
		Student_Encapsulation e=new Student_Encapsulation();
		System.out.println(e.getPass());
		e.setPass(14775);
		System.out.println(e.getPass());
	}
}
