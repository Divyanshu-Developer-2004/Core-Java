package Encapsulation;

public class Assign_34_Example2_Admin_Function {
	private int admin_pass;
	private String admin_name;
	
	public Assign_34_Example2_Admin_Function() {
		
	}
	
	public Assign_34_Example2_Admin_Function(String name,int pass) {
		this.admin_name=name;
		this.admin_pass=pass;
	}
	
	public void setName(String name,int pass) {
		if(this.admin_pass==pass)
			this.admin_name=name;
		else
			System.out.println("Wrong Password");
	}
	
	public void setPass(int prev_pass,int new_pass) {
		if(this.admin_pass==prev_pass)
			this.admin_pass=new_pass;
		else
			System.out.println("Wrong Password");
	}
	
	public String getName(int pass) {
		if(this.admin_pass==pass)
			return this.admin_name;
		else
			return null;
	}
	
	public int getPass(String name) {
		if(this.admin_name==name)
			return this.admin_pass;
		else
			return -1;
	}
	
}
