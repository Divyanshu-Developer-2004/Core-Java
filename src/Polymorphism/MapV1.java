package Polymorphism;

public class MapV1 {
	
	public void route(){
		System.out.println("North");
	}
	
	public static void main(String[] args) {
		MapV1 m1=new MapV1();
		MapV2 m2=new MapV2();
		MapV3 m3=new MapV3();
		m1.route();
		System.out.println();
		m2.route();
		System.out.println();
		m3.route();
		m3.boolkCab();
		System.out.println();
		MapV1 m4=new MapV3(); //up casting
		m4.route();//method in V2 will be executed since overriding is taking place in V2
		System.out.println();
		MapV2 m6=(MapV2)m4;//down casting to different level of child
		m6.route();
		//m6.bookCab;
		System.out.println();
		MapV3 m5=(MapV3)m4;//down casting
		m5.route();
		m5.boolkCab();
	}
}
