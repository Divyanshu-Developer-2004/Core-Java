package Has_A_Relationship_Assign_38;

public class Mobile_Driver {
	public static void main(String[] args) {
		Mobile mb1=new Mobile(new Battery("Inbuilt",30000.0));
		mb1.setSi(new Sim());
		mb1.getSi().setCompany("Jio");
	}
}
