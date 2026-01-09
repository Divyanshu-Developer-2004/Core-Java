package Loop;

public class Number_of_factors {
	public static void main(String[] args) {
		int c=0,n=30;
		for(int i=1;i<=30;i++) {
			if(n%i==0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
