package Methods;

public class Example_var_args {
	public static void main(String[] args) {
		add(5,77,48,1,66,87,98);
		System.out.println("Next line");
		add();
		System.out.println("Printed");
		}
	//Here we are using For each Loop
	public static void add(int...n)//variable argument <DataType...variable>
	{
		for(int i:n) {
			System.out.println(i);
		}
	}
}
