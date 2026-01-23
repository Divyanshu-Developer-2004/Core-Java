package String_Buffer_And_String_Builder;
import java.util.Arrays;
public class Question_1_to_7 {

	public static void main(String[] args) {
//		commonCharacters("ABCXYHJ","ACXJIOP");
//		checkIsogram("Monali");
//		balancedParentheses("{}[]()");
//		maxVowelInString("Hello How Are You Nigga?");
//		compressString("AABBBBBBCCDDDDD");
//		removeDigitFromString("AB6Hu(  5JJ  O9");
		specialCharacterInString("Ab%^G*k()$");
	}
	
	//1.Method to find common character in two strings
	public static void commonCharacters(String s1,String s2) {
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		char[] c= new char[(a.length<b.length)?a.length:b.length];
		Arrays.sort(a);
		Arrays.sort(b);
		int counter=0;
		for(int i=0;i<a.length;i++) {
			if(Arrays.binarySearch(c,a[i])<0) {
				if(Arrays.binarySearch(b, a[i])>=0) {
					c[counter]=a[i];
					counter++;		
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
	
	//2.Check whether given string is Isogram or not
	public static void checkIsogram(String s1) {
		s1=s1.toLowerCase();
		char[] a=s1.toCharArray();
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			if(s1.indexOf(a[i])!=s1.lastIndexOf(a[i])) {
				flag=false;
				break;
			}
		}
		System.out.println(flag);
	}
	
	//3.Method to check if string contains balanced parentheses
	public static void balancedParentheses(String s) {
		int big_bracket=0,curly_bracket=0,round_bracket=0;
		for(int i=0;i<s.length();i++) {
			char t=s.charAt(i);
			if(t=='(')
				round_bracket++;
			if(t==')')
				round_bracket--;
			if(t=='{')
				curly_bracket++;
			if(t=='}')
				curly_bracket--;
			if(t=='[')
				big_bracket++;
			if(t==']')
				big_bracket--;
			
		}
		if(big_bracket==0 && curly_bracket==0 && round_bracket==0) {
			System.out.println("Balanced");
		}
		else
			System.out.println("Not Balanced");
	}
	
	//4.Method to print word with Maximum Vowel
	public static void maxVowelInString(String s) {
		s=s.toLowerCase();
		String[] a=s.split(" ");
		String b="";
		int max=0,index=0;
		for(String i:a) {
			int count=0;
			for(int j=0;j<i.length();j++) {
				char t=i.charAt(j);
				if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u')
					count++;
			}
			if(count>max) {
				max=count;
				b=i;
			}
		}
		System.out.println(b);
	}
	
	//5.Method to print compress String
	public static void compressString(String s) {

		String r="";
		int count = 1;
		char last = s.charAt(0);

		for(int i = 1; i < s.length(); i++){
		    if(s.charAt(i) == last){
		    count++;
		    }else{
		        if(count > 1){
		            r=r+last+count;
		        }else{
		            r=r+last;
		        }
		    count = 1;
		    last = s.charAt(i);
		    }
		}
		if(count > 1){
			r=r+last+count;
		}else{
			r=r+last;
		}
		System.out.println(r);
	}
	
	//6.Method to remove digit from the String
	public static void removeDigitFromString(String s) {
		String r="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				continue;
			r+=s.charAt(i);
		}
		System.out.println(r);
	}
	
	//7.Method to find and print special symbols in the String
	public static void specialCharacterInString(String s) {
		for(int i=0;i<s.length();i++) {
			char t=s.charAt(i);
			if(!(t>='A' && t<='Z') && !(t>='a' && t<='z') && t!=' ')
				System.out.print(t+" ");
		}
		System.out.println();
	}
}
