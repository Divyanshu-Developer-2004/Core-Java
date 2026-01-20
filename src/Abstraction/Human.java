package Abstraction;

public interface Human {
	void language();
	void religion();
}

class Middle_Asian implements Human {
	public void language() {
		System.out.println("Chinese, Japanese");
	}
	
	public void religion() {
		System.out.println("Buddism");
	}
}

class Western implements Human {
	public void language() {
		System.out.println("English");
	}
	
	public void religion() {
		System.out.println("Christian");
	}
}

class African implements Human {
	public void language() {
		System.out.println("Tik tok Lok");
	}
	
	public void religion() {
		System.out.println("Don't konw");
	}
}