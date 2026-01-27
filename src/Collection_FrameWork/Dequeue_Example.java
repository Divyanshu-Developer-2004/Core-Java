package Collection_FrameWork;
import java.util.*;
public class Dequeue_Example {
	public static void main(String[] args) {
		ArrayDeque<String> ad1=new ArrayDeque<String>();
		
		//insert operation
		ad1.addFirst("java");
		ad1.addFirst("sql");
		ad1.addLast("python");
		System.out.println(ad1);
		
		//remove operation
		ad1.removeFirst();
		ad1.removeLast();
		System.out.println(ad1);
		
		//peak operation
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		System.out.println("----------------------------------------------");
		ArrayDeque<String> ad2=new ArrayDeque<String>();
		
		//insert operation without exception
		ad2.offerFirst("java");
		ad2.offerFirst("sql");
		ad2.offerLast("python");
		System.out.println(ad2);
		
		//remove operation without exception
		ad2.pollFirst();
		System.out.println(ad2.pollLast());//will return the deleted element
		System.out.println(ad2);
		
		//peak operation without exception
		System.out.println(ad2.peekFirst());
		System.out.println(ad2.peekLast());
	}
}
