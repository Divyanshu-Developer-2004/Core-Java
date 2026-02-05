package Problems_Day_1_to_5;

public class Peak_Element {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,60,5,4,3};
		System.out.println(peakElement1(a));
		System.out.println(peakElement2(a));
	}
	
	public static int peakElement1(int[] a) {
		int peak=0;
		boolean flag=true;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				peak=a[i];
				flag=false;
				break;
			}
		}
		if(flag==true)
			peak=a[a.length-1];
		return peak;
	}
	
	//using Binary search
	public static int peakElement2(int[] a) {
		int min=0,max=a.length-1,mid=0;
		while(min<max) {
			mid=min+((max-min)/2);
			if(a[mid]<a[mid+1])
				min=mid+1;
			else
				max=mid;
		}
		return a[mid];
	}
}
