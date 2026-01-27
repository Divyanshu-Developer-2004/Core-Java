package Collection_FrameWork;
import java.util.*;
public class HashMap_Example {
	 public static void main(String[] args) {
		HashMap<Integer,String> hm1=new HashMap<Integer, String>();//Generic
		HashMap hm2=new HashMap();//Non Generic 
		hm1.put(11, "Dinga");
		hm1.put(1, "Dingi");
		hm1.put(101, "Raju");
		hm1.put(2, "Jhingur");
		
		Collection<String> a1=hm1.values();//Only values are stored
		System.out.println(a1);
		
		Collection<Integer> a2=hm1.keySet();//only keys are stored
		System.out.println(a2);
		
		System.out.println(hm1);
		System.out.println();
		
		hm1.put(1,"Dingi ka Papa");//override the key
		System.out.println(hm1);
		System.out.println();
		
		//finding by key
		System.out.println(hm1.get(2));//returns value if key present and null if key is not present
		System.out.println(hm1.getOrDefault(3,"Not Found"));//returns value if key present and the given defaultValue if key is not present
		
		//removing
		System.out.println(hm1.remove(11,"Raju"));//To remove must match key and value both
		System.out.println(hm1.remove(11));//To remove must match key only
		
		//replacing
		System.out.println(hm1.replace(11,"Dinga", "Dinga Ka Papa"));//Matches both key value pair
		
		System.out.println(hm1.containsKey(101));//searches key
		System.out.println(hm1.containsValue("Jhingur"));//searches value 
	 }
}
