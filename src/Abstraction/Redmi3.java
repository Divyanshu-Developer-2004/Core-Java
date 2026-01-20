package Abstraction;

public class Redmi3 extends Redmi2{
	@Override
	public void smartCamera() {
		System.out.println("Redmi has Smart Camera");
	}
	
	public static void main(String[] args) {
		Redmi3 r1=new Redmi3();
		r1.camera();
		r1.battery();
		r1.smartCamera();
		System.out.println();
		
		Mobile r2=new Redmi3();
		r2.camera();
		r2.battery();
		//r2.smartCamera();cannot access this as smartCamera is in the Redmi2
		System.out.println();
		
		Redmi1 r3=new Redmi3();
		r3.camera();
		r3.battery();
		//r3.smartCamera(); Same problem as above
		
	}
}
