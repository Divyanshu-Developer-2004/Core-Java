package Map_Set_Linkelist;
import java.util.HashSet;
import java.util.Iterator;
import java.time.LocalDate;
import java.time.Month;
public class Employee_Driver {
	public static void main(String[] args) {
		HashSet<Employee> emp_list=new HashSet<Employee>();
		emp_list.add(new Employee(1,"Dinga","Male",LocalDate.of(2001, Month.FEBRUARY, 2),2,233464783));
		emp_list.add(new Employee(2,"Dingi","Female",LocalDate.of(2003, Month.FEBRUARY, 1),0,453465663));
		emp_list.add(new Employee(3,"Dunga","Male",LocalDate.of(1997, Month.JULY, 19),5,434455445));
		emp_list.add(new Employee(4,"Rajan","Male",LocalDate.of(1995, Month.JANUARY, 13),7,769399273));
		emp_list.add(new Employee(5,"Raman","Male",LocalDate.of(2000, Month.NOVEMBER, 12),3,452334378));
		emp_list.add(new Employee(6,"Jaggu","Male",LocalDate.of(1997, Month.DECEMBER, 22),5,748946478));
		emp_list.add(new Employee(7,"Guddi","Female",LocalDate.of(2002, Month.JULY, 5),1,654796478));
		
		for(Employee e:emp_list) {
			System.out.println(e);
		}
		
		System.out.println("============================================================================================================");
		System.out.println();
		
		Iterator<Employee> iterator = emp_list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("============================================================================================================");
		System.out.println();
		
		emp_list.forEach(System.out::println);//lambda function 1
		
		System.out.println("============================================================================================================");
		System.out.println();
		
		emp_list.forEach((e)->System.out.println(e));//lambda function 2
		
	}
}
