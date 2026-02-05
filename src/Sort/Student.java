package Sort;
import java.time.LocalDate;
import java.util.Objects;
//import java.util.Comparator;
public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String email;
	private String gender;
	private LocalDate localDate;
	
	public Student() {
		
	}
	
	public Student(int id,String name,String email,String gender,LocalDate localDate) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.gender=gender;
		this.localDate=localDate;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public String toString() {
		return id+"\t"+name+"\t\t"+email+"\t\t"+gender+"\t\t"+localDate;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null || this.getClass()!=o.getClass()) {
			return false;
		}
		else {
			Student s=(Student)o;
			return this.id==s.getId();
		}
	}
	
	@Override
//	public int compareTo(Student s) {
//		return this.getId()-s.getId();
//	}
	
	public int compareTo(Student s) {
		return this.getName().compareTo(s.getName());
	}
}
