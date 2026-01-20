package Abstraction;

public class C2 extends C1 implements I1,I2 {
	I1 i1=new C2();
	C1 c1=new C2();
	I2 i2=new C2();
//	I1 i3=new I1();//object creation not possible
//	public void m1() {// not able to overrride as I1 and I2 has same method but different return type now complier gets confused
//		
//	}
	
	public static void main(String[] args) {
		
	}

}

class C1 {
	
}

//interface I1 extends I2,I3{
//	
//}

interface I1{
//	void m1();
//	{
//		
//	}					Static and Non Static block is not possible
//	static {
//		
//	}
	
	public static void main() {//static method possible
		
	}
	
	private void m2() {
		
	}
	
	default void m3() {
		
	}
}

interface I2 {
	public static final int b=5;
	int a=0;//its automatically making it public static final 

	//	int m1();
//	I2(){//constructor in interface is not possible
//		
//	}
	
}

interface I3{
	
}
