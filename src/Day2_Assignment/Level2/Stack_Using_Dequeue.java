package Day2_Assignment.Level2;
import java.util.*;
public class Stack_Using_Dequeue {
	Deque<Integer> dq;
	private int head;
	private int tail;
	private int sz;
	
	public Stack_Using_Dequeue() {
	}
	
	public Stack_Using_Dequeue(int sz) {
		this.sz=sz;
		dq=new ArrayDeque<Integer>(sz);
		head=-1;
		tail=-1;
	}
	
	public boolean underflow() {
		if(tail==head && tail==-1) {
			System.out.println("underflow");
			return true;
		}
		return false;
	}
	
	public boolean overflow() {
		if(tail==(sz-1)) {
			System.out.println("overflow");
			return true;
		}
		return false;
	}
	
	public void push(int e) {
		if(overflow())
			return;
		dq.addLast(e);
		if(head==-1)
			head++;
		tail++;
	}
	
	public int pop() {
		if(underflow())
			return -1;
		tail--;
		return dq.removeLast();
	}
	
	public int peek() {
		if(underflow())
			return -1;
		return dq.getLast();
	}
	
	public void printstack() {
		if(underflow())
			return;
		System.out.println("Stack is:\n");
		System.out.println(dq);
	}
	
	public static void main(String[] args) {
		Stack_Using_Dequeue sd=new Stack_Using_Dequeue(2);
		sd.printstack();
		sd.push(1);
		sd.printstack();
		sd.push(2);
		sd.printstack();
		sd.push(3);
		System.out.println("element popped is: "+sd.pop());
		sd.push(3);
		sd.printstack();
		System.out.println("top of stack is: "+sd.peek());
	}
}
