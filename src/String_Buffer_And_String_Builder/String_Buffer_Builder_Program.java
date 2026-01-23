package String_Buffer_And_String_Builder;

import java.util.Arrays;

public class String_Buffer_Builder_Program {
	public static void main(String[] args) {
//		String s="Hi my name is Dinga";
//		reverseWordPositionInTheString(s);
		
//		String s1="ABCD";
//		String s2="ADBC";
//		anagramChecking(s1, s2);
//		panagramChecking("Abcdefghijklmnopqrstuvwxyz");
		frequencyOfEachAlphabet("ddddddcbbbbbb");
	}
	
	//Method to reverse word position in the String
	public static void reverseWordPositionInTheString(String s) {
		String[] c=s.split(" ");
		String a="";
		for(int i=c.length-1;i>=0;i--) {
			a+=c[i]+" ";
		}
		System.out.println(a);
	}
	
	//Method to check strings is Anagram
	public static void anagramChecking(String a,String b) {
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1,c2));
	}
	
	//Method to check strings is Panagram
	public static void panagramChecking(String s) {
		s=s.toLowerCase();
		s=s.replace(" ","");
		char[] c=s.toCharArray();
		Arrays.sort(c);
		int counter=0;
		boolean flag=true;
		for(int i=0;i<c.length-1;i++) {
			if(!((c[i]>='a' && c[i]<='z') || c[i] !=' ' ) ){
				flag=false;
				break;
			}
			if(c[i]==c[i+1] && c[i]!=' ') {
				flag=false;
				break;
			}
			if(c[i]!=' ') {
				counter++;
			}
		}
		counter++;
		if(counter==26) {
			
		}
		else
			flag=false;
		System.out.println(flag);
	}
	
	//Method to find frequency of each alphabet
	public static void frequencyOfEachAlphabet(String s) {
		s=s.toUpperCase();
		char[] s1=s.toCharArray();
		Arrays.sort(s1);
		int c=0;
		char[] uniques_s1= new char[s1.length];
		int[] freq=new int[s1.length];
		for(int i=0;i<s1.length;i++) {	
			if(searchCharacter(uniques_s1,s1[i]) || !(s1[i]>='A' && s1[i]<='Z')) {
				continue;
			}
			else {
			uniques_s1[c]=s1[i];
			freq[c]=frequencyOfAlphabet(s1,s1[i]);
			c++;
			}
		}
		int i=0;
		while(uniques_s1[i]!='\u0000') {
			System.out.println(uniques_s1[i]+" : "+freq[i]);
			i++;
		}
	}
	
	//Method to return frequecy of a character in char Array
	public static int frequencyOfAlphabet(char[] c,char a) {
		int counter=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]==a)
				counter++;
		}
		return counter;
	}
	
	//Method to Check character in the array
	public static boolean searchCharacter(char[] c,char a) {
		boolean flag=false;
		for(int i=0;i<c.length;i++) {
			if(c[i]==a) {
				flag=true;
				break;
			}
		}
		return flag;
	}
}
