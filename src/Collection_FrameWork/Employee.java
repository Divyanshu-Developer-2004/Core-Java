package Collection_FrameWork;

public class Employee {
	
	int id;
	String name;
	double salary;
	String department;
	
	public Employee(int id,String name,String department,double salary) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public String toString() {
		return "id :"+id+"  name :"+name+" department :"+department+" Salary :"+salary;
	}
}
