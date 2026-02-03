package Stack_1;

import java.util.Arrays;

public class Stack_Driver {
	public static void main(String[] args) {
		CustomStack st=new CustomStack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}
		System.out.println();
		
	}
}
