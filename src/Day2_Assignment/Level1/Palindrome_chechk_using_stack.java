package Day2_Assignment.Level1;
import java.util.*;
public class Palindrome_chechk_using_stack {
	public static void main(String[] args) {
		String s1="Hakkah";
		System.out.println(checkPalindrome(s1));
	}
	
	public static boolean checkPalindrome(String s) {
		if(s=="")
			return false;
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		Stack<Character> st=new Stack<Character>();
		st.push(ch[0]);
		for(int i=1;i<ch.length;i++) {
			if(st.peek()==ch[i])
				st.pop();
			else
				st.push(ch[i]);
		}
		if(st.size()==0)
			return true;
		else
			return false;
	}
}
