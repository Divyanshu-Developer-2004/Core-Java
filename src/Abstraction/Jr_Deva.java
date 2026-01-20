package Abstraction;

public class Jr_Deva extends Deva{
	
	@Override
	public void goldloan() {
		System.out.println("Junior Deva Paid Gold Loan");
	}
	
	public void bike() {
		System.out.println("Honda");
	}
	
	public static void main(String[] args) {
		Jr_Deva jd=new Jr_Deva();
		jd.homeloan();
		jd.goldloan();
		jd.bike();
		System.out.println();
		//we cannot create object of Deva as it is an abstract class
		Parent1 p=new Jr_Deva();//Up Casting 
		p.homeloan();
		p.goldloan();
		//p.bike(); gives Compile Time Error
		System.out.println();
		Deva d=new Jr_Deva();//Up Casting
		d.homeloan();
		d.goldloan();
		//d.bike(); gives Compile Time Error
	}
}
