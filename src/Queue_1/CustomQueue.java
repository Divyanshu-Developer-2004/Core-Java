package Queue_1;
import java.util.*;
public class CustomQueue {
	
	private int[] q;
	private int size;
	private int f,r;
	
	public CustomQueue(int size) {
		q=new int[size];
		this.size=size;
		this.f=0;
		this.r=-1;
	}
	
	public boolean isFull() {
		return r==size-1;
	}
	
	public boolean isEmpty() {
		return f>r;
	}
	
	public int Enqueue(int el) {
		if(isFull())
			throw new RuntimeException("Queue is full!....");
		q[++r]=el;
		return el;
	}
	
	public int Dequeue() {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty!....");
		return q[f++];
	}
	
	public int size() {
		return r-f+1;
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty!....");
		return q[f];
	}
}
