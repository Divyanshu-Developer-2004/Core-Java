package Has_a_Relationship_Example1_1;

public class StudentCourse {
	
	private Student std;
	private Course cou;
	
	public void setStudent(Student std) {
		this.std=std;
	}
	
	public void setCourse(Course cou) {
		this.cou=cou;
	}
	
	public void showStudentCourseDetails() {
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getRollNumber());
		System.out.println(std.getGrade());
		System.out.println(cou.getCourseID());
		System.out.println(cou.getCourseName());
	}
	
	
}
