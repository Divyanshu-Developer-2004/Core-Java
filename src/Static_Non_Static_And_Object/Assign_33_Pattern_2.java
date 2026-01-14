package Static_Non_Static_And_Object;

public class Assign_33_Pattern_2 {
	
	public static void P1(int n) {//diamond pattern
		int i=n;
		while(i>=1) {
			for(int j=1;j<=n;j++) {
				if(j>i/2 && j<n-(i/2)+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			i-=2;
		}
		i+=2;
		while(i<=n-2) {
			i+=2;
			for(int j=1;j<=n;j++) {
				if(j>i/2 && j<n-(i/2)+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
	}
	
	public static void P2(int n) {//sand-glass pattern
		int i=1;
		while(i<=n) {
			for(int j=1;j<=n;j++) {
				if(j>(i/2) && j<=n-(i/2))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			i+=2;
		}
		i-=2;
		while(i>=1) {
			for(int j=1;j<=n;j++) {
				if(j>(i/2) && j<=n-(i/2))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			i-=2;
		}
	}
	
	public static void main(String[] args) {
		P1(11);
		System.out.println();
		P2(11);
	}
}
