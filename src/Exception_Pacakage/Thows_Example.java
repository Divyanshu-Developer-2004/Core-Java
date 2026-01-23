package Exception_Pacakage;

public class Thows_Example {

	public static void main(String[] args) {
		try {
			m1();
		}catch(ClassNotFoundException e) {
			System.out.println("Handled");
		}catch (Exception e) {
			System.out.println("Handled");
		}finally {//to write clean up code for example to close connection gets executed exception id handled or not
			System.out.println("Finally Block");
		}
	}
	
	public static void m1() throws Exception {
		System.out.println("hi");
		System.out.println(7/0);
		System.out.println("bye");
	}
}
