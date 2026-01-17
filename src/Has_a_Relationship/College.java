package Has_a_Relationship;

public class College {
	
	private String name;
	private String location;
	private Student std;
	private Trainer tr;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public void setStudent(Student std) {
		this.std=std;
	}
	
	public void setTrainer(Trainer tr) {
		this.tr=tr;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public Student getStudent() {
		return this.std;
	}
	
	public Trainer getTrainer() {
		return this.tr;
	}
	
	public void display() {
		System.out.println("----------College------------");
		System.out.println(getName());
		System.out.println(getLocation());
		System.out.println("----------Student------------");
		System.out.println(getStudent().getID());
		System.out.println(getStudent().getName());
		System.out.println("----------Trainer------------");
		System.out.println(getTrainer().getName());
		System.out.println(getTrainer().getSubject());
	}
}
