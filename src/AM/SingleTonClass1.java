package AM;

public class SingleTonClass1 {
	
	private static Example e=new Example();
	public static Example createObj() {
		return e;
	}
}
