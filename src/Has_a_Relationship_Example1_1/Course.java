package Has_a_Relationship_Example1_1;

public class Course {
	
	private int courseID;
	private String courseName;
	
	public void setCourseID(int courseID) {
		this.courseID=courseID;
	}
	
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	
	public int getCourseID() {
		return this.courseID;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
}
