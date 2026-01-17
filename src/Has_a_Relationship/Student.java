package Has_a_Relationship;

public class Student {
	private int id;
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setID(int id) {
		this.id=id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.id;
	}
}
