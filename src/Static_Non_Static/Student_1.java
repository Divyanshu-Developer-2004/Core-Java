package Static_Non_Static;

public class Student_1 {
	int id;
	String name;
	public void study() {
		System.out.println("Studying");
	}
	public static void main(String[] args) {
		Student_1 s1=new Student_1();
		System.out.println(s1);//Gives a converted or reference  address
		System.out.println(s1.id+" "+s1.name);
		s1.id=101;
		s1.name="Ben";
		System.out.println(s1.id+" "+s1.name);
		s1.study();
	}
}
