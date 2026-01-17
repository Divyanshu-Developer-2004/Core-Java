package Encapsulation;

public class Driver_Encapsulation {
	public static void main(String[] args) {
		//Trainer_Encapsulation e1= new Trainer_Encapsulation();//Before adding constructor
		Trainer_Encapsulation e1= new Trainer_Encapsulation(999,"Raju");//After adding constructor
		System.out.println(e1.getID());
		System.out.println(e1.getName());
		System.out.println(e1.getPass());
		e1.setID(10001);
		e1.setName("Aghora");
		e1.setPass(4887765);
		System.out.println(e1.getID());
		System.out.println(e1.getName());
		System.out.println(e1.getPass());
	}
}
