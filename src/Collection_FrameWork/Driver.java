package Collection_FrameWork;
import java.util.*;//All FrameWorks in this util Pacakage
public class Driver {
	
	public static void main(String[] args) {
		//generic-> same type element <Datatype>
		//non-generic-> different type element
		
		//Create ArrayList (here generic one is created)
		ArrayList<String> a1=new ArrayList<String>();//we can do upcasting and store child in parent also i.e.(List<String>)
		a1.add("java");
		a1.add("sql");
		a1.add("python");
		
		//Read all element 
		System.out.println(a1);
		
		//Read element by index
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		
		//Update element
		a1.set(1,"javaScript");
		System.out.println(a1);
		
		//Delete element by index
		a1.remove(2);
		System.out.println(a1);
		
		//Delete element by content
		a1.remove("javaScript");
		System.out.println(a1);
		
		ArrayList l2=new ArrayList();//Default Capacity 10
		l2.add("Home");
		l2.add(11);
		l2.add(null);
		int a=99;
		l2.add(a);//auto boxing happens
		System.out.println(l2);
		
		//we can define capacity
		ArrayList l3=new ArrayList(45);
		//now capacity is 45
		l3.add(44);
		l3.add("jana");
		
		ArrayList l5=new ArrayList(l2);//stores or copy all data of l2 to l5
		l5.add("Bye");
		System.out.println(l5);
		
		l5.add(2,"SQL");
		System.out.println(l5);//Inserts element at given index
		
		l5.addAll(l3);//Adds l3 to l5 collection by default puts data at last
		System.out.println(l5);
		
		l5.addAll(2,l3);//Adds l3 to l5 to the given index
		System.out.println(l5);
		
		
		
	}
}
