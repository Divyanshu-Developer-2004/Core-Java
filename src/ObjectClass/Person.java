package ObjectClass;

public class Person {
	
	String name;
	int id;
	
	@Override
	public String toString() {
		return "id: "+id+" Name: "+name;
	}
	
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Person p=new Person(24,"ABC");
		System.out.println(p);
		System.out.println(p.toString());
	}
}
