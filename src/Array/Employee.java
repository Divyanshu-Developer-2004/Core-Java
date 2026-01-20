package Array;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;
	private int experience;
	
	Employee(int id,String name,double salary, String department,int experience){
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
		this.department=department;
		this.experience=experience;
	}
	
	Employee(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}
