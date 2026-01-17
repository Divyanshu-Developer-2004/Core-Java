package Has_a_Relationship;

public class College_Driver {
	public static void main(String[] args) {
		College c=new College();//Creating College Object
		Student s=new Student();//Creating Student Object
		Trainer t=new Trainer();//Creating Trainer Object
		
		c.setStudent(s);//setting Student object in College Object
		c.setTrainer(t);//setting Trainer object in College Object 
		t.setStudent(s);//setting Student object in Trainer Object
		
		c.setName("IEM");
		c.setLocation("Salt Lake");
		c.getStudent().setID(214);
		c.getStudent().setName("Dinga");
		c.getTrainer().setName("Dingi ka PAPA");
		c.getTrainer().setSubject("Maths");
		c.display();
	}
}
