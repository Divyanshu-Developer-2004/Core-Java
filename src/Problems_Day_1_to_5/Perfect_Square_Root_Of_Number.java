package Problems_Day_1_to_5;
import java.util.Scanner;
public class Perfect_Square_Root_Of_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int per_sqr_root=-1;
		if(N==1)
			per_sqr_root=1;
//		for(int i=0;i<=N/2;i++) {
//			if(i*i==N)
//				per_sqr_root=i;
//		} //O(N)
		
//		int i=0;
//		while(i*i<=N) {
//			if(i*i==N)
//				per_sqr_root=i;
//		}//O(Root N)
		
		int min=1,max=N,mid;
		for(;min<=max;) {
			mid=min+((max-min)/2);
			if(mid*mid<=N) {
				per_sqr_root=mid;
				min=mid+1;
			}else {
				max=mid-1;
			}
			
		}//O(logN base 2) This will work perfectly for perfect squares but for non perfect squares it will give integer value of its previous perfect squares
		
		if(per_sqr_root==-1)
			System.out.println("Its not a perfect Square:");
		else
			System.out.println(per_sqr_root);
	}
}
