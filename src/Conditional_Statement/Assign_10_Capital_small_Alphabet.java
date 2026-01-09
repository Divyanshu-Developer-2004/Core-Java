package Conditional_Statement;

public class Assign_10_Capital_small_Alphabet {
	public static void main(String[] args) {
		char c='A';
		if(c>='A' && c<='Z') {
			System.out.println(c+" is Capital Alphabet");
		}
		else if(c>='a' && c<='z') {
			System.out.println(c+" is Small Alphabet");
		}
		else {
			System.out.println("It's not an Alphabet");
		}
	}
}
