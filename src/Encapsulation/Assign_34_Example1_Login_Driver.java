package Encapsulation;

public class Assign_34_Example1_Login_Driver {
	public static void main(String[] args) {
		Assign_34_Exapmle1_Login l1=new Assign_34_Exapmle1_Login("Dinga","D4D5");
		System.out.println(l1.getName("D4D5"));
		System.out.println(l1.getName("D4De"));
		l1.setPass("D4De","D4D2");
		l1.setPass("D4D5","D4D2");
		System.out.println(l1.getName("D4D5"));
		System.out.println(l1.getName("D4D2"));
	}
}
