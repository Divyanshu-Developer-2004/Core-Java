package Conditional_Statement;

public class Calculator_1_1 {
	public static void main(String[] args) {
		int a=11,b=47;
		char s='+';
		switch(s) {
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		case '%':System.out.println(a%b);
		break;
		default:System.out.println("No match");
		}
	}
}
