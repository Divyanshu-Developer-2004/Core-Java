package Inheritance;

public class WA_V1 {

	public void chat() {
		System.out.println("Chat");
	}
	
	public static void main(String[] args) {
		WA_V1 w1=new WA_V1();
		WA_V2 w2=new WA_V2();
		WA_V3 w3=new WA_V3();
		w1.chat();
		System.out.println();
		w2.chat();
		w2.status();
		System.out.println();
		w3.chat();
		w3.status();
		w3.metaAI();
	}
}
