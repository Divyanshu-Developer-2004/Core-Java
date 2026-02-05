package Day3_Assignment.PartA;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int per_sqr_root=-1;
		if(N==1)
			per_sqr_root=1;
		int min=1,max=N,mid;
		for(;min<=max;) {
			mid=min+((max-min)/2);
			if(mid*mid<=N) {
				per_sqr_root=mid;
				min=mid+1;
			}else {
				max=mid-1;
			}
			
		}
		System.out.println(per_sqr_root);
	}
}
