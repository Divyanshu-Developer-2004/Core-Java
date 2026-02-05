package Day2_Assignment.Level2;
import java.util.*;
public class Task_Scheduler {
	
	ArrayDeque<String> ts;//=new ArrayDeque<String>();
	
	public Task_Scheduler() {
		ts=new ArrayDeque<String>();
	}
	public static void main(String[] args) {
		Task_Scheduler ts=new Task_Scheduler();
		ts.add("Waking Up");
		ts.add("Study Maths");
		ts.done();
		ts.add("Study Chemistry");
		ts.add("PYQ Practice");
		ts.done();
	}
	
	public boolean add(String s) {
		return ts.offer(s);
	}
	
	public String done() {	
		System.out.println(ts.peek()+" is done");
		return ts.poll();
	}
}
