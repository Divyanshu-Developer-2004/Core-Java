package Collection_FrameWork;

import java.util.*;

public class TreeSet_Example {
	
		public static void main(String[] args) {
			TreeSet<String> hs1=new TreeSet<String>();//Generic
			TreeSet hs2=new TreeSet();//TreeSet cannot be non generic its automatically becomes the type of the first element it stores
			
			hs1.add("java");
			hs1.add("python");
			hs1.add("sql");
			System.out.println(hs1);
			
			hs2.add(22);
			hs2.add(315);
			hs2.add(1);
			hs2.add(212);
//			hs2.add(24);
//			hs2.add("Maths");
//			hs2.add('F');
//			System.out.println(hs2);
			
			hs1.add("java");
//			hs1.add(null);//null not allowed in Tree Set
			System.out.println(hs1);
			
//			hs2.add("Maths");
//			hs2.add(null);//null not allowed in Tree Set
//			System.out.println(hs2);
			
		}
}
