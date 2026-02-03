package Queue_1;
import java.util.*;
public class Queue_Example {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
//		Queue<Integer> q2=new ArrayDeque<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
		System.out.println(q);
		
		System.out.println(q.remove());//remove from first
		
		//Traversing
		for(int i:q) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
