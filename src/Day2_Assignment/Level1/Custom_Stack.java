package Day2_Assignment.Level1;

public class Custom_Stack {
	int[] stack;
	private int size;
	private int top;
	
	public Custom_Stack(int size) {
		stack=new int[size];
		top=-1;
		this.size=size;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==(size-1);
	}
	
	public int push(int el) {
		if(isFull())
			throw new RuntimeException("Stack is Full cannot insert more");
		stack[++top]=el;
		return el;
	}
	
	public int pop() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty nothing to delete");
		return stack[top--]; 
	}
	
	public int size() {
		return top+1;
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty nothing to delete");
		return stack[top];
	}
}
