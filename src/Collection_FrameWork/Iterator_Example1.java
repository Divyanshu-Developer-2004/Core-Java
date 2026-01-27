package Collection_FrameWork;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//Iterator is used when you don't want to use for each loop
public class Iterator_Example1 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(22);
		list.add(23);
		list.add(74);
		list.add(257);
		
		//1st
		Iterator<Integer> i=list.iterator();
		ListIterator<Integer> i2=list.listIterator();//Its a child of Iterator interface 
		//It has two extra method hasprevious() and previous (moves pointer/cursor in reverse direction)
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("----------------------");
		
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println();
		
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
////		System.out.println(i.next());//Gives error
	}
}
