package Collection_FrameWork;
import java.util.*;
public class HashSet_Example {
	public static void main(String[] args) {
		HashSet<String> hs1=new HashSet<String>();//Generic
		HashSet hs2=new HashSet();//Non Generic
		
		hs1.add("java");
		hs1.add("python");
		hs1.add("sql");
		System.out.println(hs1);
		
		hs2.add(24);
		hs2.add("Maths");
		hs2.add('F');
		System.out.println(hs2);
		
		hs1.add("java");
		hs1.add(null);
		System.out.println(hs1);
		
		hs2.add("Maths");
		hs2.add(null);
		System.out.println(hs2);
		
		System.out.println(hs1.contains("java"));
		
	}
}
