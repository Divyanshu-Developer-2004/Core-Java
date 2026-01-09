package Conditional_Statement;

public class Assign_11_Alphabet_Conversion {
	public static void main(String[] args) {
		char c='f';
		if(c>='A' && c<='Z') {
			int a=c+32;
			System.out.println(c+" is converted to "+(char)a);
		}
		else if(c>='a' && c<='z') {
			int a=c-32;
			System.out.println(c+" is converted to "+(char)a);
		}
		else {
			System.out.println("It's not an Alphabet");
		}
	}
}
