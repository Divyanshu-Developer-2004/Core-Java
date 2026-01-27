package Collection_FrameWork;
import java.util.*;
public class LinkedList_Example {
	public static void main(String[] args) {
		
		//Creating Linked List
		List<String> ll1=new LinkedList<String>();
		
		//Add elements (Create)
		ll1.add("java");
		ll1.add("sql");
		ll1.add("python");
		
		//Read element by index (Read)
		System.out.println("First Element: "+ ll1.get(0));//java
		
		//Update element (Update)
		ll1.set(1, "javaScript");
		ll1.add(2,"Math");//add maths at index 2
		
		//Delete element (delete)
		ll1.remove(2);
		
		//Print the Update list
		System.out.println("Updated List: "+ll1);
	}
}
