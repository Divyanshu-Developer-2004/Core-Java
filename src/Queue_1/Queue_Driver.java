package Queue_1;

public class Queue_Driver {
	public static void main(String[] args) {
		CustomQueue q=new CustomQueue(4);
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(4);
		
		System.out.println(q.peek());
		System.out.println(q.Dequeue());
	}
}
