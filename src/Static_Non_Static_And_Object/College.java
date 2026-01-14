package Static_Non_Static_And_Object;

public class College {
	String name;
	String location;
	public void exam() {
		System.out.println(name+" is taking Exams");
	}
	public void College_data() {
		System.out.println(name);
		System.out.println(location);
		
	}
	public static void main(String[] args) {
		College c1=new College();
		College c2=new College();
		College c3=new College();
		c1.name="UEM";
		c1.location="Salt Lake";
		c2.name="IEM";
		c2.location="New Town";
		c3.name="Techno";
		c3.location="Viswa Bangla Gate";
		c2.exam();
		c1.College_data();
		c3.College_data();
	}
}
