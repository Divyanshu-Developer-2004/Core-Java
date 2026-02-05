package Problems_Day_1_to_5;
import java.util.HashSet;
public class LongestConsecutiveLength {
	
	public static int longestConsecutive(int[] a) {
		int length=-1;
		HashSet<Integer> n=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			n.add(a[i]);
		}
		for(int i:n) {
			int l=1;
			if(!n.contains(i-1)) {
				continue;
			}
			int currentNum=i;
			while(n.contains(currentNum)) {
				l++;
				currentNum++;
			}
			if(l>length)
				length=l;
		}
		return length;
	}
	
	public static void main(String[] args) {
		int[] a= {11,4,200,1,3,2,5,6};
		System.out.println(longestConsecutive(a));
	}
}
