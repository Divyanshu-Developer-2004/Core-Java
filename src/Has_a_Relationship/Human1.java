package Has_a_Relationship;

public class Human1 {

	private Heart heart;// Strong has-a relationship
	private Address address;//Weak has-a relationship
	public Human1() {
		heart=new Heart();
	}
	
	public static void main(String[] args) {
		Human1 human=new Human1();
		human.heart.pump();
		human.setAddress(new Address());
		human.getAddress().location();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

class Heart{
	public void pump() {
		System.out.println("Heart is beating in");
	}
}

class Address{
	public void location() {
		System.out.println("India");
	}
}
