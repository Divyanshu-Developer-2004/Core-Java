package Abstraction;

public class Game_Driver {
	public static void main(String[] args) {
		Game g1=new Cricket();
		Game g2=new Football();
		g1.play();
		g2.play();
	}
}
