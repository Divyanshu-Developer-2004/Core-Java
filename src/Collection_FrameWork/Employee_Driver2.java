package Collection_FrameWork;
import java.util.*;
public class Employee_Driver2{
	

	public static void main(String[] args) {
		Employee2 e1=new Employee2(23,"Dinga",78000.0);
		Employee2 e2=new Employee2(3,"Dingi",28000.0);
		Employee2 e3=new Employee2(67,"Dunga",67000.0);
		Employee2 e4=new Employee2(33,"Dinesh",90000.0);
		Employee2 e5=new Employee2(45,"Dindu",86700.0);
		Employee2 e6=new Employee2(60,"Dhanna",45000.0);
		
		ArrayList<Employee2> e_list=new ArrayList<Employee2>();
		e_list.add(e1);
		e_list.add(e2);
		e_list.add(e3);
		e_list.add(e4);
		e_list.add(e5);
		e_list.add(e6);
		
		Collections.sort(e_list,(s1,s2)->s1.id-s2.id);//using lambda function
		System.out.println(e_list);
		System.out.println();
		
		Collections.sort(e_list,(s1,s2)->s1.name.compareTo(s2.name));//using lambda function
		System.out.println(e_list);
		System.out.println();
		Collections.sort(e_list,new SortEmployee());//using comparator in different class can use in this class also
		System.out.println(e_list);
	}
}
