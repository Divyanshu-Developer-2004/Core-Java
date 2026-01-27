package Collection_FrameWork;
import java.util.*;
public class Array_to_List {
	public static void main(String[] args) {
		String[] arr= {"a","b","c","a"};
		
		List<String> list=Arrays.asList(arr);//converts array to list
		Set<String> set=new HashSet<>(list);
		
		System.out.println(list);
		System.out.println(set);
	}
}
