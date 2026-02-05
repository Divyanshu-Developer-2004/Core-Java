package Problems_Day_1_to_5;
import java.util.HashMap;
import java.util.Map;
public class Frequency_Of_Number {
	
	public static HashMap<Integer,Integer> freq(int[] a){
		HashMap<Integer,Integer> f=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(f.containsKey(a[i]))
				f.put(a[i],f.get(a[i])+1);
			else
				f.put(a[i],1);
		}
		return f;
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,7,3,2,5,4,1,2,6};
		HashMap<Integer,Integer> f=freq(a);
		for(Map.Entry en:f.entrySet()) {
			System.out.println(en.getKey()+" -> "+en.getValue());
		}
		
//		f.putIfAbsent(null, null);//This will not override the value if the key is already present
	}
}
