package Encapsulation;

public class Assign_34_Example2_Admin_Driver {
	public static void main(String[] args) {
		Assign_34_Example2_Admin_Function a1=new Assign_34_Example2_Admin_Function("Divyanshu",24101);
		System.out.println(a1.getName(24101));
		System.out.println();
		System.out.println(a1.getPass("Divyanshu"));
		a1.setName("Dinga", 242424);
		a1.setName("Dinga", 24101);
		System.out.println();
		System.out.println(a1.getName(242424));
	}
}
