package Stack_1;
import java.util.*;
public class Stack_Example {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		for(int i=0;i<st.size();i++) {
			System.out.print(st.get(i)+" ");
		}
		System.out.println();
		
		for(Integer i:st) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}
		System.out.println();
	}
}
