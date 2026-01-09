package Loop;

public class Example3 {
//	method 1
/*	public static void main(String[] args) {
		int i=1,n=15;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
*/
	
// method 2	
	public static void main(String[] args) {
		int i=2,n=15;
		while(i<=n) {
			System.out.println(i);
			i+=2;
		}
	}
}
