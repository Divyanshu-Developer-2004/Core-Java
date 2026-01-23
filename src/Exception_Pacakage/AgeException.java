package Exception_Pacakage;

public class AgeException extends RuntimeException {
	
	public AgeException(String message) {
		super(message);
	}
	
//	public static void main(String[] args) {
//		int age=-10;
//		
//		if(age > 0 ) {
//			System.out.println("Age is Valid");
//		}
//		else {
//			throw new AgeException(age+" is invalid");
//		}
//	}
	
	public static void checkage(int age) {
		
		if(age > 0 ) {
			System.out.println("Age is Valid");
		}
		else {
			throw new AgeException(age+" is invalid");
		}
	}
	
	public static void main(String[] args) {
		int age1=9;
		checkage(age1);
		int age2=-6;
		try {
			checkage(age2);
		}catch (AgeException e) {
			System.out.println("AgeException handled");
		}
	}
}
