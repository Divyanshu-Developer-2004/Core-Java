package Stack_1;
import java.util.*;
public class ValidParenthesis {
	
	public static void main(String[] args) {
		
		String s1="{[()]}";
		String s2="{[(])}";
		System.out.println(validParenthesis(s1));
		System.out.println(validParenthesis(s2));
	}
	
	public static boolean validParenthesis(String s) {
		Stack<Character> st=new Stack<Character>();
		char[] ch=s.toCharArray();
		int i=0;
		while(i<ch.length) {
			if(ch[i]=='{' || ch[i]=='[' || ch[i]=='(') {
				st.push(ch[i]);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				char top=st.peek();
				if((ch[i]=='}' && top=='{') || (ch[i]==']' && top=='[') || (ch[i]==')' && top=='(')) {
					st.pop();
				}else {
					return false;
				}
			}
			i++;
		}
		if(st.isEmpty())
			return true;
		else
			return false;
	}
}
