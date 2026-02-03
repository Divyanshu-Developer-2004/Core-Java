package Day2_Assignment.Level2;
import java.math.*;
public class Circular_Queue {
	int[] cq;
	int size;
	int front,rear;
	
	public Circular_Queue(int size) {
		this.size=size;
		cq=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty() {
		int cap=front-rear;
		if(cap==0)
			return true;
		return false;
	}
	
	public boolean isFull() {
		int cap=Math.abs(front-rear);
		if(cap==size)
			return true;
		return false;
	}
	
	public boolean insert(int n) {
		if(isFull()) {
			System.out.println("Queue is Full....!!");
			return false;
		}else {
			if(rear==cq.length-1)
				rear=-1;
			cq[++rear]=n;
			return true;
		}
	}
	
	public int delete() {
		if(isEmpty()) {
			System.out.println("Queue is Empty....!!");
			return Integer.MIN_VALUE;
		}else {
			if(front==cq.length)
				front=-1;
			front++;
			return cq[front];
		}
	}
	
	public void display() {
		int i=front+1;
		while(i!=rear) {
			System.out.print(cq[i]+" ");
			i++;
			if(i==size)
				i=0;
		}
		System.out.print(cq[i]+" ");
	}
	
	public static void main(String[] args) {
		Circular_Queue cq=new Circular_Queue(6);
		cq.insert(1);
		cq.delete();
		cq.delete();
		cq.insert(2);
		cq.display();
	}
}
