package Problems_Day_1_to_5;
import java.util.HashMap;
import java.util.Map;
public class Unique_Elements_In_Array {
	
	public static char[] uniqueElement(String s) {
		char[] ch=s.toCharArray();
		char[] b=new char[ch.length];
		HashMap<Character,Integer> mp=new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			if(mp.containsKey(ch[i])) {
				mp.put(ch[i],mp.get(ch[i])+1);
			}else {
				mp.put(ch[i],1);
			}
		}
		int i=0;
		for(Map.Entry<Character,Integer> e:mp.entrySet()) {
			if(e.getValue()==1) {
				b[i]=e.getKey();
				i++;
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		String s="HakkaMan";
		System.out.println(uniqueElement(s));
	}
}
