package Has_a_Relationship_Example1_1;

public class Student extends Person{
	
	private int rollNumber;
	private char grade;
	private Course course;
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public void setGrade(char grade) {
		this.grade=grade;
	}
	
	public void setCourse(Course course) {
		this.course=course;
	}
	
	public int getRollNumber() {
		return this.rollNumber;
	}
	
	public char getGrade() {
		return this.grade;
	}
	
	public Course getCourse() {
		return this.course;
	}
}
