package Collection_FrameWork;

public class Employee2 {
	int id;
	String name;
	double salary;
	
	public Employee2(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return "id :"+id+"  name :"+name+" Salary :"+salary;
	}
}
