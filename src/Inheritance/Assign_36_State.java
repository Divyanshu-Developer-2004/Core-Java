package Inheritance;

public class Assign_36_State extends Assign_36_Country {
	String state;
	
	Assign_36_State(){
		
	}
	
	Assign_36_State(String planet,String country,String state){
		this.planet=planet;
		this.country=country;
		this.state=state;
	}
	
	public void State_data() {
		System.out.print(planet+" -> ");
		System.out.print(country+" -> ");
		System.out.println(state);
	}
	
	public static void main(String[] args) {
		Assign_36_State s1=new Assign_36_State("Earth","India","West Bengal");
		s1.State_data();
	}
}
