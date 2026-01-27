package Collection_FrameWork;

import java.util.*;

public class ArrayList_Example2 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(50);
		a1.add(10);
		a1.add(10);
		a1.add(50);
		System.out.println(a1);
		HashSet<Integer> set=new HashSet<Integer>(a1);
		System.out.println(set);
		
		a1.clear();
		a1.addAll(set);
		System.out.println(a1);
	}
}
