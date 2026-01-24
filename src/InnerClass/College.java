package InnerClass;

public class College {
	
	static int a=10;
	
	static interface Vehicle{//static will make the inner interface methods available to outer class
		
	}
	static class Student {//static will make the inner class methods available to outer class
		public static void m1() {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Student.m1();
	}
}
//Research more on inner class by yourself