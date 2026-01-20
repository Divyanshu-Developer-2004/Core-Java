package ObjectClass;
import java.util.Objects;
public class Student {
	int id;
	String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int hashCode() {//Overriding hasCode
		return Objects.hash(id,name);
	}
	
//	@Override
//	public boolean equals(Object o) {
//		Student s=(Student)o;//Need to down Cast or we will not be able to access child members
//		return this.id==s.id && this.name==s.name;
//	}
	
	@Override
	public boolean equals(Object o) {//Here we will handle null pointer exception
		if(this==o) {//check adress is same or not ()
			return true;
		}
		if(o==null || o.getClass() != this.getClass()) {//null object or asame class
			return false;
		}
		
		else {//Content or states of an object
			Student s=(Student)o;//Need to down Cast or we will not be able to access child members
			return this.id==s.id && this.name==s.name;
		}
	}
	
	
	public boolean compareContentOfObject(Student s) {
		if(this.hashCode()==s.hashCode())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Student s1=new Student(11,"XYZ");
		Student s2=new Student(11,"XYz");
		Student s3=s1;
		Student s4=null;
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println();
//		System.out.println(s1.compareContentOfObject(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
