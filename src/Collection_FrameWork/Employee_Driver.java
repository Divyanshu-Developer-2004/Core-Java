package Collection_FrameWork;
import java.util.*;
public class Employee_Driver {
	
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Dinga","IT",450000.0));
		emp.add(new Employee(2,"Laila","Sales",600000.0));
		emp.add(new Employee(3,"Genda","Support",550000.0));
		emp.add(new Employee(4,"Sirish","IT",800000.0));
		emp.add(new Employee(5,"Jadu","IT",350000.0));
		
		List<Employee> emp_dep=depEmployee(emp,"IT");
		List<Employee> emp_more_money=moreSalaryEmployee(emp,480000.0);
		
		for(Employee i:emp_dep) {
			System.out.println(i.toString());
			System.out.println();
		}
		System.out.println("-----------------------------------");
		
		for(Employee i:emp_more_money) {
			System.out.println(i.toString());
			System.out.println();
		}
		System.out.println("-----------------------------------");
	}
	
//	public static void depEmployee(List<Employee> l1,String department) {
//		for(Employee i:l1) {
//			if(i.department==department) {
//				System.out.println(i.toString());
//				System.out.println();
//			}
//		}
//		System.out.println("-----------------------------------");
//	}
//	
//	public static void moreSalaryEmployee(List<Employee> l1,double salary) {
//		for(Employee i:l1) {
//			if(i.salary>salary) {
//				System.out.println(i.toString());
//				System.out.println();
//			}
//		}
//		System.out.println("-----------------------------------");
//	}
	
	public static List<Employee> depEmployee(List<Employee> l1,String department) {
		List<Employee> emp_dep=new ArrayList<Employee>();
		for(Employee i:l1) {
			if(i.department==department) {
				emp_dep.add(i);
			}
		}
		return emp_dep;
	}
	
	public static List<Employee> moreSalaryEmployee(List<Employee> l1,double salary) {
		List<Employee> emp_more_money=new ArrayList<Employee>();
		for(Employee i:l1) {
			if(i.salary>salary) {
				emp_more_money.add(i);
			}
		}
		return emp_more_money;
	}
}
