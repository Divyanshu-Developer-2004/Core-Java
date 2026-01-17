package Encapsulation;

public class Trainer_Encapsulation {
	private int id;
	private String name;
	private long pass;
	
	public Trainer_Encapsulation(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void setID(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPass(long pass) {
		this.pass=pass;
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public long getPass() {
		return pass;
	}
}
