package Exception_Pacakage;

public class Example2 {
	
	public static void main(String[] args) {
//		Arithematic_Exception();
//		Null_Pointer_Exception();
//		Array_Out_Of_Bound_Exception();
//		String_Out_Of_Bound_Exception();
//		Class_Cast_Exception();
//		Checked_Exception_InterruptedException();
		multi_Catch_Block();
	}
	
	public static void Arithematic_Exception() {
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide with Zero");
		}
	}
	
	public static void Null_Pointer_Exception() {
		String s=null;
		try {
			s.toLowerCase();
		}
		catch(NullPointerException e) {
			System.out.println("Cannot perform Operations on Null");
		}
	}
	
	public static void Array_Out_Of_Bound_Exception() {
		int[] a= {1,5,8,3,0};
		try {
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is Out of Range");
		}
	}
	
	public static void String_Out_Of_Bound_Exception() {
		String a="Hi How Are You" ;
		try {
			System.out.println(a.charAt(30));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Index is out of Bound");
		}
	}
	
	public static void Class_Cast_Exception() {
		 Example2 a=new C1();
		try {
			C2 b=(C2)a;
		}
		catch(ClassCastException e) {
			System.out.println("Class doen't Match");
		}
	}
	
	public static void Checked_Exception_InterruptedException() {
		System.out.println("hi");
		try {
			Thread.sleep(30000);//pause in milli second
		}catch (InterruptedException e) {
			System.out.println("Sleep method called");
		}
		System.out.println("bye");
	}
	
	public static void Checked_Exception_ClassNotFoundException() {
		System.out.println("hi");
		try {
			Class.forName("Array.Employee");
		}catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		System.out.println("bye");
	}
	
	public static void multi_Catch_Block() {
		System.out.println("Hi");
		try {//checks error at a time
			System.out.println(3/0);
			Class.forName("Array.Employee");
			String s=null;
			s.toLowerCase();
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide with Zero");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class info is wrong");
		}
		catch(Exception e) {
			System.out.println("Something is wrong");
		}
		System.out.println("Bye");
	}
	
}
