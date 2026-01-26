package Collection_FrameWork;
import java.util.*;
public class Student_Driver {
	
	public static void main(String[] args) {
		List<Student> std= new ArrayList<Student>();
		std.add(new Student(1,"Dinga",66));
		std.add(new Student(2,"Sayantan",95));
		std.add(new Student(3,"Kisnenudu",90));
		std.add(new Student(4,"Dengu",35));
		std.add(new Student(5,"Dingi",20));
		std.add(new Student(6,"Arush",56));
		std.add(new Student(7,"Pandey",2));
		std.add(new Student(8,"Dingi",39));
		
		List<Student> pass_std=passingStudentList(std, 40);
		display(pass_std);
		System.out.println();
		
		int pass_std_count=passingStudentCount(pass_std, 40);
		int fail_std_count=std.size()-pass_std_count;
		System.out.println("Pass count : "+pass_std_count);
		System.out.println("Fail count : "+fail_std_count);
		System.out.println();
		
		Student topper=topperStudent(std);
		System.out.println(topper.toString());
		System.out.println();
		
		List<Student> search_std=searchStudent(std, "Dingi");
		display(search_std);
		
	}
	
	public static void display(List<Student> std) {
		for(Student i:std) {
			System.out.println(i.toString());
		}
		if(std.size()==0)
			System.out.println("List is Empty");
	}
	
	//Method to return student list that passed
	public static List<Student> passingStudentList(List<Student> std,int marks) {
		List<Student> std_pass=new ArrayList<Student>();
		for(Student i:std) {
			if(i.marks>=marks)
				std_pass.add(i);
		}
		return std_pass;
	}
	
	//Method to return number of student that passed
	public static int passingStudentCount(List<Student> std,int marks) {
		int c=0;
		for(Student i:std) {
			if(i.marks>=marks)
				c++;
		}
		return c;
	}
	
	//Method to return topper student
	public static Student topperStudent(List<Student> std) {
		Student topper=std.get(0);
		for(int i=1;i<std.size();i++) {
			if(topper.marks<std.get(i).marks)
				topper=std.get(i);
		}
		return topper;
	}
	
	//Method to search Student by name
	public static List<Student> searchStudent(List<Student> std,String name) {
		List<Student> student=new ArrayList<Student>();
		for(Student i:std) {
			if(i.name==name)
				student.add(i);
		}
		return student;
	}
}
