package Static_Non_Static;

public class Pattern {
	
	public static void P1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<=i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void P2(int n) {
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<n;j++) {
				if(j>=i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void P3(int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<n;j++) {
				if(j<i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void P4(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j>=i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		P1(5);//done
		P2(5);
		P3(5);//done
		P4(5);//done
	}
}
