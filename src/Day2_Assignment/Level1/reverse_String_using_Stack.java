package Day2_Assignment.Level1;
import java.util.*;
public class reverse_String_using_Stack {
	public static void main(String[] args) {
		String s1="Jai Shree Ram";
		System.out.println(revString(s1));
	}
	
	public static String revString(String s) {
		String s2="";
		char[] ch=s.toCharArray();
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<ch.length;i++) {
			st.push(ch[i]);
		}
		for(int i=0;i<ch.length;i++) {
			s2+=st.pop();
		}
		return s2;
	}
}
