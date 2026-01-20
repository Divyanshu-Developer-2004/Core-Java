package Array;
import java.util.Scanner;
public class StudentHelper {
	public static void inputStudent(Student[] s) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Students data: ");
		for(int i=0;i<s.length;i++) {
			Student temp=new Student();
			System.out.print("Enter Students id: ");
			temp.id=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Students name: ");
			temp.name=sc.nextLine();
			System.out.print("Enter Students marks: ");
			temp.marks=sc.nextInt();
			s[i]=temp;
		}
	}
		
	public static Student[] passStudent(Student[] s,int pass_marks) {
		Student[] new_s;
		int c=0;
		for(Student i:s) {
			if(i.marks>=pass_marks)
				c++;
		}
		new_s= new Student[c];
		int j=0;
		for(Student i:s) {
			if(i.marks>=pass_marks) {
				new_s[j]=i;
				j++;
			}
		}
		return new_s;
	}
	
	public static void printStudent(Student[] s) {
		System.out.println("Enter Students data: ");
		for(Student i: s) {
			System.out.println("Students id: "+i.id);
			System.out.println("Students name: "+i.name);
			System.out.println("Students marks: "+i.marks);
			System.out.println();
		}
	}
}

