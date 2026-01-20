package Abstraction;

public class ChildTest implements Test{

//	@Override
//	public void m2() {
//		System.out.println();
//	}
	
	public static void main(String[] args) {
		
		ChildTest t=new ChildTest();
		t.m2();
		Test.m3();
		System.out.println(Test.a);
	}
}
