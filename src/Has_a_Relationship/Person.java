package Has_a_Relationship;

public class Person {
	
	String name;
	PanCard panCard;
	
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Dinga";
		
		PanCard card=new PanCard();
		card.panID="ABC227";
		card.dob="14/04/2001";
		
		p1.panCard=card;//assigning object data
		
		System.out.println(p1.name);
		System.out.println(p1.panCard.panID);
		System.out.println(p1.panCard.dob);
	}
}
