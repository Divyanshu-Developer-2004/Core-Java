package Array;

public interface EmployeeService {
	
	Employee[] getHighSalaryEmployees(Employee[] employees,double minSalary);
	
	double calculateAverageSalary(Employee[] employees);
	
	Employee getTopPaidEmployee(Employee[] employees);
	
	Employee[] getExperiencedEmployees(Employee[] employees, int minYears);
	
	Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department);
	
	double getAverageSalaryByDepartment(Employee[] employees,String department);
}

class EmployeeServiceImp implements EmployeeService{
	
	public Employee[] getHighSalaryEmployees(Employee[] employees,double minSalary) {
		Employee[] high_salary;
		int c=0;
		for(Employee i:employees) {
			if(i.getSalary()>minSalary)
				c++;
		}
		high_salary=new Employee[c];
		int j=0;
		for(Employee i:employees) {
			if(i.getSalary()>minSalary) {
				high_salary[j]=i;
				j++;
			}	
		}
		return high_salary;
	}
	
	public double calculateAverageSalary(Employee[] employees) {
		double average=0.0,sum=0.0;
		int c=0;
		for(Employee i:employees) {
				sum+=i.getSalary();
				c++;
		}
		average=sum/c;
		return average;
	}
	
	public Employee getTopPaidEmployee(Employee[] employees) {
		double max=employees[0].getSalary();
		Employee top_paidemployee=employees[0];
		for(Employee i:employees) {
			if(i.getSalary()>max) {
				top_paidemployee=i;
			}
		}
		return top_paidemployee;
	}
	
	public Employee[] getExperiencedEmployees(Employee[] employees, int minYears) {
		Employee[] exp_emp;
		int c=0;
		for(Employee i:employees) {
			if(i.getExperience()>=minYears)
				c++;
		}
		int j=0;
		exp_emp=new Employee[c];
		for(Employee i:employees) {
			if(i.getExperience()>=minYears) {
				exp_emp[j]=i;
				j++;
			}
				
		}
		
		return exp_emp;
	}
	
	public Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department) {
		Employee top_paid_by_department=new Employee();
		for(Employee i:employees) {
			if(i.getDepartment()==department) {
				if(i.getSalary()>top_paid_by_department.getSalary()) {
					top_paid_by_department=i;
				}
			}
		}
		return top_paid_by_department;
	}
	
	public double getAverageSalaryByDepartment(Employee[] employees,String department) {
		
		double average=0.0,sum=0.0;
		int c=0;
		for(Employee i:employees) {
			if(i.getDepartment()==department) {	
				sum+=i.getSalary();
				c++;
			}
		}
		average=sum/c;
		return average;
	}
}
