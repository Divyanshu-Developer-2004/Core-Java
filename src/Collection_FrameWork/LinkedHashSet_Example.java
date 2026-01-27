package Collection_FrameWork;

import java.util.*;

public class LinkedHashSet_Example {
	public static void main(String[] args) {
		LinkedHashSet<String> hs1=new LinkedHashSet<String>();//Generic
		LinkedHashSet hs2=new LinkedHashSet();//Non Generic
		
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
		
	}
}
