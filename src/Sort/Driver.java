package Sort;
import java.time.*;
import java.util.Arrays;
import java.util.Comparator;
public class Driver {
	public static void main(String[] args) {
		
		Student[] st= {new Student(1,"Dinga","Dinga567@gmail.com","Male",LocalDate.of(2006,Month.DECEMBER,22)),
				new Student(5,"Dingi","Dingi67@gmail.com","Female",LocalDate.of(2010,Month.DECEMBER,1)),
				new Student(3,"Dunga","Dunga5@gmail.com","Male",LocalDate.of(2006,Month.FEBRUARY,13)),
				new Student(6,"Rajan","Rajan7@gmail.com","Male",LocalDate.of(2006,Month.OCTOBER,4)),
				new Student(2,"Sayan","Sayan2567@gmail.com","Male",LocalDate.of(2006,Month.JULY,19)),
				new Student(4,"Gulabo","Gulabo69@gmail.com","Female",LocalDate.of(2006,Month.AUGUST,30))
				};
		
		System.out.println("Original: ");
		for(Student i:st) {
			System.out.println(i);
		}
		
		System.out.println("==================================================================================");
		System.out.println("Sorting Based on Name: ");
		System.out.println();
		Arrays.sort(st);
		
		for(Student i:st) {
			System.out.println(i);
		}
		
		System.out.println("==================================================================================");
		System.out.println("Sorting Based on ID: ");
		System.out.println();
		Arrays.sort(st,new IDcompare());
		
		for(Student i:st) {
			System.out.println(i);
		}
		
		System.out.println("==================================================================================");
		System.out.println("Sorting Based on Name in reverse order using Lambda Function: ");
		System.out.println();
		Arrays.sort(st,(s1,s2)->s2.getName().compareTo(s1.getName()));
		
		for(Student i:st) {
			System.out.println(i);
		}
	}
}

class IDcompare implements Comparator<Student>{
	
	public int compare(Student s1,Student s2) {
		return s1.getId()-s2.getId();
	}
}
