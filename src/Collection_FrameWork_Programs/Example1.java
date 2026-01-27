package Collection_FrameWork_Programs;
import java.util.*;
public class Example1 {
	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(23,"A");
		m1.put(11,"B");
		m1.put(46,"C");
		
		for(Map.Entry<Integer, String> entry: m1.entrySet()) {//Entry is an interface that stores entry set
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
