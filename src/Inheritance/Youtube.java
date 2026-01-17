package Inheritance;

public class Youtube extends App {
	String username;
	String password;
	
	Youtube(){
		
	}
	
	Youtube(String name,float dl,String user,String pass){
		password=pass;
		this.name=name;
		download=dl;
		password=pass;
	}
	
	public void WhatsAPP_data() {
		System.out.println(name);
		System.out.println(download+"M");
		System.out.println(username);
		System.out.println(password);
	}
	
	public static void main(String[] args) {
		Youtube y1=new Youtube("Youtube",4.5f,"GOAT-24","jj41");
		Youtube y2=new Youtube("Youtube",4.5f,"GAZA-4","bOOM41");
		y2.WhatsAPP_data();
		System.out.println();
		y1.WhatsAPP_data();
	}
}
