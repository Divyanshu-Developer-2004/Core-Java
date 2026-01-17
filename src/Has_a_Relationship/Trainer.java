package Has_a_Relationship;

public class Trainer {
	
	private String name;
	private String subject;
	private Student std;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	public void setStudent(Student std) {
		this.std=std;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public Student getStudent() {
		return this.std;
	}
}
