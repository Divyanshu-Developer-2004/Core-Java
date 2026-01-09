package Conditional_Statement;

public class Example4 {
	public static void main(String[] args) {
		char c='V';
		if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
			System.out.println("It's a Alphabet");
		}
		else if(c>='0' && c<='9') {
			System.out.println("It's a digit");
		}
		else {
			System.out.println("It's a Special Character");
		}
	}
}
