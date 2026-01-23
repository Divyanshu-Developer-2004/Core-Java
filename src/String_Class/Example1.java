package String_Class;

public class Example1 {
	public static void main(String[] args) {
		String a="XYZ";//Stored in SCP in heap area
		String b="XYZ";//Stored in SCP in heap area
		String c="abc";//Stored in SCP in heap area
		
		String s1=new String("xyz");//Stored in heap and in SCP i.e. two objects will be created
		String s2="abc";
		String s3="xyz";
		String s4=new String("xyz");
		String s5=new String("abc");
		String s6="abc";
		
		System.out.println(a.toString());
		System.out.println(a.getClass());
		System.out.println(a.equals(b));
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println();
		
		System.out.println(s1.equals(s3));//true
		System.out.println(s1==s3);//false
		System.out.println(s4.equals(s5));//false
		System.out.println(s4==s5);//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1==s4);//false
		System.out.println(s2.equals(s6));//true
		System.out.println(s2==s6);//true
		
	}
}
