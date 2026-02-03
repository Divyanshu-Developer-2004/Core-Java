package Queue_1;
import java.util.*;
public class To_DO_List {
	Queue<String> to_do=new ArrayDeque<String>();
	public static void main(String[] args) {
		To_DO_List td1=new To_DO_List();
		td1.add("Waking Up");
		td1.add("Solving Maths Problem");
		td1.done();
		td1.add("Solving Apti");
	}
	
	public void done() {
		
		System.out.println(to_do.poll()+" done");
	}
	
	public void add(String s) {
		to_do.offer(s);
	}
}
