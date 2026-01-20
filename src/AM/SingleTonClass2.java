package AM;

public class SingleTonClass2 {
	private static SingleTonClass2 obj;
	
	public static SingleTonClass2 getSingleTonClass2() {//return same object if object is not created create object 
		if(obj==null) {
			obj=new SingleTonClass2();
		}
		return obj;
	}
	
	private SingleTonClass2() {//Constructor should be private
		
	}
}
