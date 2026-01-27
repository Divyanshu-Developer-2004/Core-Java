package Collection_FrameWork;

import java.util.*;
public class Stack_Example {
	public static void main(String[] args) {
		
		//Creating Linked List
		Stack<String> ll1=new Stack<String>();//Push and Pop methods are in Stack Class
		
//		//Add elements (Create)
//		ll1.add("java");
//		ll1.add("sql");
//		ll1.add("python");
		
		//Add element (Push)
		ll1.push("java");
		ll1.push("sql");
		ll1.push("python");
		
		//Read element by index (Read)
		System.out.println("First Element: "+ ll1.get(0));//java
		
		//Update element (Update) Vector is parent of Stack therefore remove, add, set methods all work here 
//		ll1.set(1, "javaScript");
//		ll1.add(2,"Math");//add maths at index 2
		
		//Delete element (delete)
//		ll1.remove(2);
		System.out.println("Updated List: "+ll1);
		ll1.pop();//removes last inserted element
		
		//Print the Update list
		System.out.println("Updated List: "+ll1);
	}
}
