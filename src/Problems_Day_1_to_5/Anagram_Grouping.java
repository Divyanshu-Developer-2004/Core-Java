package Problems_Day_1_to_5;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class Anagram_Grouping {
	
	public static List<List<String>> grouping(String[] a){
		
		List<List<String>> l=new LinkedList<List<String>>();
		HashMap<String,List<String>> hm=new HashMap<String, List<String>>();
		for(int i=0;i<a.length;i++) {
			char[] ch=a[i].toCharArray();
			Arrays.sort(ch);
			String b=new String(ch);
			if(hm.containsKey(b)) {
				hm.get(b).add(a[i]);
			}
			else {
				hm.put(b,new LinkedList<String>());
				hm.get(b).add(a[i]);
			}
		}
		for(Map.Entry<String,List<String>> e:hm.entrySet()) {
			l.add(e.getValue());
		}
		return l;
	}
	
	public static void main(String[] args) {
		String[] words= {"eat","tea","tan","ate","tab","nat","bat"};
		List<List<String>> list=grouping(words);
		System.out.println(list);
	}
}
