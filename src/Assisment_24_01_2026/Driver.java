package Assisment_24_01_2026;

public class Driver {

	public static void main(String[] args) {
		Full_time_Employee fte1=new Full_time_Employee();
		Contract_Employee ce1=new Contract_Employee();
		fte1.setEmployee(new Employee(34,"Dinga","IT",34000.0));
		ce1.setEmployee(new Employee(11,"Genda","Sales",55000.0));
//		ce1.Contract_Emp(-20000, "HR");//Error
//		fte1.Full_time_Emp(90000.0,"IT");//Exception
		fte1.Full_time_Emp(90000.0,"HR");//Normal
		
	}
}
//Abstract Class Payroll
interface Payroll{
	public abstract void Full_time_Emp(double salary,String role);
	public abstract void Contract_Emp(double salary,String role);
	
}

//Employee Service Class of each Employee
class Full_time_Employee implements Payroll{
	private Employee e;

	public Employee getEmployee() {
		return e;
	}

	public void setEmployee(Employee e) {
		this.e = e;
	}
	@Override
	public void Full_time_Emp(double salary,String role) {
		e.setSalary(role, salary);
	}
	@Override
	public void Contract_Emp(double salary,String role) {
		System.out.println("Not a Contract Base Employee");
	}
}

class Contract_Employee implements Payroll{
	private Employee e;

	public Employee getEmployee() {
		return e;
	}

	public void setEmployee(Employee e) {
		this.e = e;
	}
	@Override
	public void Full_time_Emp(double salary,String role) {
		System.out.println("Not a Full Time Employee");
	}
	@Override
	public void Contract_Emp(double salary,String role) {
		e.setSalary(role, salary);
	}
}
//Employee Class
class Employee{
	int id;
	String name;
	String role;
	private double salary;
	
	public Employee(int id,String name,String role,double salary) {
		this.id=id;
		this.name=name;
		this.role=role;
		this.salary=salary;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(String role,double salary) {
		try {
			UnAuthorizationException.checkAuthorization(role);
		}catch(UnAuthorizationException e) {
			System.out.println("UnAuthorized Access");
		}
		try {
			InValidSalaryException.checkSalary(salary);
		}catch(InValidSalaryException e) {
			System.out.println("Invalid Salary");
		}
		this.salary = salary;
	}
}

//UnAuthorizationException 
class UnAuthorizationException extends RuntimeException{
	
	public UnAuthorizationException(String message) {
		super(message);
	}
	
	public static void checkAuthorization(String role) {
		if(role!="HR") {
			throw new UnAuthorizationException("UnAuthorized Access");
		}
	}
}

//InValidSalaryException
class InValidSalaryException extends Error{
	
	public InValidSalaryException(String message) {
		super(message);
	}
	
	public static void checkSalary(double salary) {
		if(salary<0) {
			throw new UnAuthorizationException("Invalid Salary");
		}
	}
}
