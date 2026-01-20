package Array;
import java.util.Scanner;
public class Student_Driver {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
//		Student[] students=new Student[3];
//		students[0]=new Student(18,"Dinga");
//		students[1]=new Student(45,"Dingi");
//		students[2]=new Student(7,"Dunga");
		
//		for(int i=0;i<students.length;i++) {
//			System.out.print(students[i].id+" ");
//			System.out.println(students[i].name);
//		}
//		System.out.println();
//		
//		for(Student i:students) {
//			System.out.print(i.id+" ");
//			System.out.println(i.name);
		
		System.out.print("Enter the number of students: ");
		int n=sc.nextInt();
		Student[] students=new Student[n];
		StudentHelper.inputStudent(students);
		System.out.println("Enter Passing Marks: ");
		int pass_marks=sc.nextInt();
		Student[] pass_students;
		pass_students=StudentHelper.passStudent(students,pass_marks);
		StudentHelper.printStudent(pass_students);
		}
}

