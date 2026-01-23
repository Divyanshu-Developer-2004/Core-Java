package String_Buffer_And_String_Builder;
import java.util.Arrays;
public class String_Buffer_Builder_Methods {
	
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Hello World");//all methods are same in StringBuilder but the difference is in threads handling
		System.out.println(s);
//		reverseMethod(s);
//		appendMethod(s);
//		insertMethod(s);
//		deleteMethod(s);
//		replaceMethod(s);
//		System.out.println(s);
//		capacityMethod(s);
//		System.out.println();
//		getCharsMethod(s);
		sortMethod();
	}
	
	public static void sortMethod() {//Arrays method
		char[] ch1= {'b','a','c'};
		char[] ch2= {'c','a','b'};
		Arrays.sort(ch1);
		System.out.println(Arrays.toString(ch1));
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));
	}
	
	public static void insertMethod(StringBuffer s) {
		s.insert(1,"EF");//insert data in string at that given index 
	}
	
	public static void deleteMethod(StringBuffer s) {
		s.delete(1,5);//delete from starting index to end index-1
	}
	
	public static void reverseMethod(StringBuffer s) {
		s.reverse();//reverse string
	}
	
	public static void appendMethod(StringBuffer s) {
		s.append(" User");
	}
	
	public static void capacityMethod(StringBuffer s) {
		System.out.println(s.capacity());//print capacity of StringBuffer i.e.(16+length of String)
	}
	
	public static void replaceMethod(StringBuffer s) {
		s.replace(0, 2,"hii");//Replace data in string at that given index 
	}
	
	public static void getCharsMethod(StringBuffer s) {
		char[] ch=new char[s.length()];
		s.getChars(0, s.length(),ch,0);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
	}
}
