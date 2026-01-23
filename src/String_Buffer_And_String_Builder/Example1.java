package String_Buffer_And_String_Builder;

public class Example1 {
	
	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("xyz");
		StringBuffer s2=new StringBuffer("xyz");
		StringBuilder s3=new StringBuilder("xyz");
		StringBuilder s4=new StringBuilder("xyz");
		
		System.out.println(s1);
		System.out.println(s1.toString());//this and above is same as SBui and SBuf both only override toString()
		System.out.println(s3);
		System.out.println(s1.equals(s2));//false
		System.out.println(s1==s2);//false
		System.out.println();
		System.out.println(s3.equals(s4));//false
		System.out.println(s3==s4);//false
		
		String s=new String(s1);//converts stringBuffer into String
		StringBuffer s1_1=new StringBuffer(s);//converts String to StringBuffer
		//Same can be done for StringBuffer
	}
}
