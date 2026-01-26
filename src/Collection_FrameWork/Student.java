package Collection_FrameWork;

public class Student {
	
	int id;
	String name;
	int marks;
	
	public Student(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return "id :"+id+"  Name :"+name+"  Marks :"+marks;
	}
}
