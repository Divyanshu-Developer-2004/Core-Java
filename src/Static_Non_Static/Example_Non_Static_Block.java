package Static_Non_Static;

public class Example_Non_Static_Block {
	{
		System.out.println("N-S 1");
	}
	{
		System.out.println("N-S 2");
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		Example_Non_Static_Block e1=new Example_Non_Static_Block();
		Example_Non_Static_Block e2=new Example_Non_Static_Block();
		System.out.println("Main End");
	}
	{
		System.out.println("N-S 3");
	}
}
