package Collection_FrameWork;
import java.util.*;
public class PriorityQueue_Example {
	public static void main(String[] args) {
//		PriorityQueue<String> pq1=new PriorityQueue<String>();
//		pq1.add("java");
//		pq1.add("python");
//		pq1.add("sql");
////		pq1.add(null);//Null is not allowed in PriorityQueue
		
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		pq1.offer(30);
		pq1.offer(20);
		pq1.offer(70);
		pq1.offer(10);
		pq1.offer(100);
		pq1.offer(70);
		pq1.offer(55);
		System.out.println(pq1);
	}
}
