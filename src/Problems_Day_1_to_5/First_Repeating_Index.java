package Problems_Day_1_to_5;
import java.util.HashMap;
import java.util.Map.Entry;
public class First_Repeating_Index {
	public static void main(String[] args) {
		String s="abddjcklbjckla";
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> rep_ind=new HashMap<Character, Integer>();
		for(int i=ch.length-1;i>=0;i--) {
			rep_ind.put(ch[i],i);
		}
//	    for (Entry<Character, Integer> entry : rep_ind.entrySet()) {
//	    	System.out.println(entry.getKey() + " -> " + entry.getValue());
//	    }		
	    
	    System.out.println(firstRepeating(s));
	}
	
//	public static char
	
	public static char firstRepeating(String s) {
		char f='\u0000';
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> rep_ind=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(rep_ind.containsKey(ch[i]))
				rep_ind.put(ch[i],rep_ind.get(ch[i])+1);
			else
				rep_ind.put(ch[i],0);
		}
	    for (Entry<Character, Integer> entry : rep_ind.entrySet()) {
	    	if(entry.getValue()>1) {
	    		f=entry.getKey();
	    		break;
	    	}
	    }
	    return f;
	}
}
