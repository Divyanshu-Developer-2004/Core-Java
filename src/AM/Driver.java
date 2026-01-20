package AM;

public class Driver {
	public static void main(String[] args) {
//		Example e=new Example(); //cannot make object of private constructor
//		Example e1=SingleTonClass1.createObj();
//		System.out.println(e1);
//		Example e2=SingleTonClass1.createObj();
//		System.out.println(e2);
		
		
//		SingleTonClass2 obj1=SingleTonClass2.getSingleTonClass2();
//		SingleTonClass2 obj2=SingleTonClass2.getSingleTonClass2();
//		SingleTonClass2 obj3=SingleTonClass2.getSingleTonClass2();
//		
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(obj3);
		
		ConnectionPooling1 c1=ConnectionPooling1.getSingleTonClass2();
		System.out.println(c1);
		
		ConnectionPooling1 c2=ConnectionPooling1.getSingleTonClass2();
		System.out.println(c2);

		ConnectionPooling1 c3=ConnectionPooling1.getSingleTonClass2();
		System.out.println(c3);

		ConnectionPooling1 c4=ConnectionPooling1.getSingleTonClass2();
		System.out.println(c4);

		ConnectionPooling1 c5=ConnectionPooling1.getSingleTonClass2();
		System.out.println(c5);

		ConnectionPooling1 c6=ConnectionPooling1.getSingleTonClass2();
		System.out.println(c6);
	}
}
