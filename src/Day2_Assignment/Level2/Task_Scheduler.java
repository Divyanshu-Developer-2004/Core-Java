package Day2_Assignment.Level2;
import java.util.*;
public class Task_Scheduler {
	
	ArrayDeque<String> ts;//=new ArrayDeque<String>();
	
	public Task_Scheduler() {
		ts=new ArrayDeque<String>();
	}
	public static void main(String[] args) {
		
	}
	
	public void add(String s) {
		ts.offer(s);
	}
	
	public String done() {		
		return ts.poll();
	}
}
