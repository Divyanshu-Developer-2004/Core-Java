package Encapsulation;

public class Assign_34_Exapmle1_Login {
	private String name;
	private String pass;
	
	public Assign_34_Exapmle1_Login(String name,String pass) {
		this.name=name;
		this.pass=pass;
	}
	
	public Assign_34_Exapmle1_Login() {
		
	}
	
	public String getName(String pass) {
		if(this.pass==pass)
			return this.name;
		else
			return "Wrong Password";
	}
	
	public String getPass(String name) {
		if(this.name==name)
			return this.pass;
		else
			return "Wrong Password";
	}
	
	public void setName(String pass,String name) {
		if(this.pass==pass)
			this.name=name;
		else
			System.out.println("Wrong Password");
	}
	
	public void setPass(String prevPass,String newPass) {
		if(this.pass==prevPass)
			this.pass=newPass;
		else
			System.out.println("Wrong Previous Password");
	}
}
