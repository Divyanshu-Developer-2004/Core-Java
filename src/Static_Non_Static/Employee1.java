package Static_Non_Static;
import java.util.Scanner;
public class Employee1 {
	int id;
	String name;
	double salary;
	
	public void work() {
		System.out.println(name+" is working...");
	}
	public void Employee_data() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public void initilize(int id,String name,Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("How many Employee are there : ");
		int n=sc.nextInt();
		int i=0,id;
		String name;
		Double salary;
		while(n!=0) {
			i++;
			Employee1 a=new Employee1();
			System.out.print("Enter ID of Employee "+i+" : ");
			id=sc.nextInt();
			System.out.print("Enter Name of Employee "+i+" : ");
			sc.nextLine();
			name=sc.nextLine();
			System.out.print("Enter Salary of Employee "+i+" : ");
			salary=sc.nextDouble();
			a.initilize(id, name, salary);
			a.Employee_data();
			n--;
		}
		
	}
}
