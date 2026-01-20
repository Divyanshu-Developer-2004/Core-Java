package Array;
import java.util.Scanner;
public class Employee_Driver {
	public static void main(String[] args) {
		
	Employee e1=new Employee(1,"Dinga",450000,"IT",4);
	Employee e2=new Employee(2,"Lila",150000,"Sales",3);
	Employee e3=new Employee(3,"Ganga",200000,"Sales",2);
	Employee e4=new Employee(4,"Panga",760000,"IT",5);
	Employee e5=new Employee(5,"Ghingur",360000,"Sales",4);
	Employee e6=new Employee(6,"Loca",560000,"Support",7);
	
	EmployeeService es=new EmployeeServiceImp();
	Employee[] emp= {e1,e2,e3,e4,e5,e6};
	Employee[] high_paid_employee;
	Employee top_paid_emplpyee;
	
	System.out.println("Average Salary is : "+es.calculateAverageSalary(emp));
	System.out.println();
	
	high_paid_employee=es.getHighSalaryEmployees(emp,210000);
	top_paid_emplpyee=es.getTopPaidEmployee(emp);
	System.out.println("------------Highly paid Employees detail---------------");
	for(Employee i:high_paid_employee) {
		System.out.println(i.getId());
		System.out.println(i.getName());
		System.out.println(i.getSalary());
		System.out.println();

	}
	
	System.out.println("------------Top paid Employee detail---------------");
	System.out.println(top_paid_emplpyee.getId());
	System.out.println(top_paid_emplpyee.getName());
	System.out.println(top_paid_emplpyee.getSalary());
	System.out.println();
	
	Employee[] high_exp_dep_wise;
	Employee top_paid_in_dep;
	
	System.out.println("Average Salary in IT is : "+es.getAverageSalaryByDepartment(emp,"IT"));
	System.out.println();
	
	high_exp_dep_wise=es.getExperiencedEmployees(emp,5);
	System.out.println("------------Highly Experienced Employees---------------");
	for(Employee i:high_exp_dep_wise) {
		System.out.println(i.getId());
		System.out.println(i.getName());
		System.out.println(i.getSalary());
		System.out.println(i.getExperience());
		System.out.println(i.getDepartment());
		System.out.println();

	}
	
	top_paid_in_dep=es.getTopPaidEmployeeByDepartment(emp,"IT");
	System.out.println("------------Top paid Employee of IT Department detail---------------");
	System.out.println(top_paid_in_dep.getId());
	System.out.println(top_paid_in_dep.getName());
	System.out.println(top_paid_in_dep.getSalary());
	System.out.println(top_paid_in_dep.getExperience());
	System.out.println(top_paid_in_dep.getDepartment());
	System.out.println();
	}
}
