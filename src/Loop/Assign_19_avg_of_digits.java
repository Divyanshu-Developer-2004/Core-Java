package Loop;

public class Assign_19_avg_of_digits {
	public static void main(String[] args) {
		int n=154879,a=n,c=0;
		float sum=0,avg;
		while(a>0) {
			sum+=(a%10);
			c++;
			a/=10;
		}
		avg=sum/c;
		System.out.println("Average of digits of "+n+" is "+avg);
	}
}
