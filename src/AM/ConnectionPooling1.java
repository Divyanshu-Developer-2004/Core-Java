package AM;

public class ConnectionPooling1 {
	
	private static int counter=1;
	public static ConnectionPooling1 getSingleTonClass2() {//return same object if object is not created create object 
		if(counter>5) {
			System.out.println("Maximum number of object creation is Exausted");
			return null;
		}
		else {
			counter++;
			return new ConnectionPooling1();
		}
	}
	
	private ConnectionPooling1() {//Constructor should be private
		
	}
}
