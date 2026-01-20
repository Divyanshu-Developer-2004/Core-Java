package Abstraction;

public class Person_Driver {
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		System.out.println("------------African people------------");
		p1.setH(new African());
		p1.getH().language();
		p1.getH().religion();
		
		System.out.println("---------Car---------");
		p1.setV(new Car());
		p1.getV().price();
		p1.getV().type();
		
		System.out.println("------------Middle_Asian people------------");
		p2.setH(new Middle_Asian());
		p2.getH().language();
		p2.getH().religion();
		
		System.out.println("---------Bike---------");
		p2.setV(new Bike());
		p2.getV().price();
		p2.getV().type();
		
		System.out.println("------------Western people------------");
		Person p3=new Person();
		p3.setH(HelpHuman.getHuman());
		p3.getH().language();
		p3.getH().religion();
		
		System.out.println("---------Spotify---------");
		Mobile_Music_Player mp1=new Mobile_Music_Player();
		mp1.setMp(new SpotifyPlayer());
		mp1.getMp().play();
		mp1.getMp().pause();
		mp1.getMp().stop();
		
		System.out.println("---------Yotube---------");
		Mobile_Music_Player mp2=new Mobile_Music_Player();
		mp2.setMp(new YouTubeMusicPlayer());
		mp2.getMp().play();
		mp2.getMp().pause();
		mp2.getMp().stop();
	}
}
