package Has_a_Relationship_Example1_1;

public class Driver_Student {
	public static void main(String[] args) {
		StudentCourse sc=new StudentCourse();
		Student s1=new Student();
		Course c1=new Course();
		sc.setStudent(s1);
		sc.setCourse(c1);
		s1.setAge(24);
		s1.setName("Divaynshu");
		s1.setGrade('B');
		s1.setRollNumber(426363);
		c1.setCourseID(86873);
		c1.setCourseName("Maths");
		sc.showStudentCourseDetails();
	}
}
