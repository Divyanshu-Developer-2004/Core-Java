package Abstraction;

public abstract class Game {
	
	public abstract void start();
	
	public abstract void end();
	
	public void play() {
		start();
		end();
		System.out.println();
	}
}

class Cricket extends Game{
	
	@Override
	public void start() {
		System.out.println("Start Cricket ");
	}
	
	@Override
	public void end() {
		System.out.println("End Cricket");
	}
}

class Football extends Game{
	
	@Override
	public void start() {
		System.out.println("Start Football ");
	}
	
	@Override
	public void end() {
		System.out.println("End Football");
	}
}

