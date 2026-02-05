package Map_Set_Linkelist;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
public class Employee implements Comparable<Employee>{
	private String name;
	private int id;
	private LocalDate localDate;
	private int experience;
	private String gender;
	private long phone_no;
	public Employee(int id,String name,String gender,LocalDate localDate,int experience,long phone_no) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.localDate=localDate;
		this.experience=experience;
		this.phone_no=phone_no;
	}
	
	public String toString() {
		return ("ID :"+id+
				"\tName :"+name+
				"\tGender: "+gender+
				"\tDOB : "+localDate+
				"\tExperirnce : +"+experience+
				"\t\tPhone.No :"+phone_no);
	}
	
	@Override
	public int compareTo(Employee e) {
		return this.id-e.id;
	}
	
	@Override
	public int hashCode() {
		return	Objects.hash(id);
	}
}
