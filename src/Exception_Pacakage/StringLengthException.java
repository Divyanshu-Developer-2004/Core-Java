package Exception_Pacakage;

public class StringLengthException extends RuntimeException {
	
	public StringLengthException(String message) {
		super(message);
	}
	
	public static void check_Length(String s) {
		if(s.length()>10) {
			throw new StringLengthException("Cannot store more than 10 character");
		}
		else {
			System.out.println("Valid String");
		}
	}
}
