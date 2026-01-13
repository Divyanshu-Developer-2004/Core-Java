package Methods;

public class Example_vararg_double_string {
	public static void main(String[] args) {
		string("How","are","you","?");
		dou(44.2,12.14,12.22,77.22,77.11);
	}
	public static void string(String...s) {
		String r="";
		for(String i:s) {
			r+=(i+" ");
		}
		System.out.println(r);
	}
	public static void dou(double...d) {
		double r1=0,r2=d[0];
		for(double i:d) {
			if(r1<i) {
				r1=i;
			}
			if(r2>i) {
				r2=i;
			}
		}
		System.out.println(r1);
		System.out.println(r2);
	}
}
