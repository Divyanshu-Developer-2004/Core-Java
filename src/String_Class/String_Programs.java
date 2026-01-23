package String_Class;

public class String_Programs {
	
	public static void main(String[] args) {
		String s1="abc@1%3^";
		String s2="XYZa24";
		String s3="my name is dinga";
		String s4="MY NAME IS DINGA";
//		toUpperCase(s1);
//		toLowerCase(s2);
//		removeDigit(s2);
//		countAlphabetDigitSpecialCharacter(s2);
//		System.out.println();
//		countAlphabetDigitSpecialCharacter(s1);
//		startingCharacterOfWordtoUpperCase(s3);
		convertLastCharacterOfEveryWordToLowerCase(s4);
		swapFirstAndLastCharacterOfEveryWord(s4);
		removeSpacesFromString(s4);
	}
	
	//Method to remove spaces from the String
	public static void removeSpacesFromString(String s) {
		System.out.println(s.replace(" ", ""));
	}
	
	//Method to convert last character of every word to lower case
	public static void convertLastCharacterOfEveryWordToLowerCase(String s) {
		String a="";
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++) {
			char[] ch=st[i].toCharArray();
			if(ch[ch.length-1]>='A' &&ch[ch.length-1]<='Z') {
				ch[ch.length-1]=(char)(ch[ch.length-1]+32);
			}
			String temp=new String(ch);
			a+=temp+" ";
		}
		System.out.println(a);
	}
	
	//Method to swap First and last Character of every word
	public static void swapFirstAndLastCharacterOfEveryWord(String s) {
		String a="";
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++) {
			char[] ch=st[i].toCharArray();
			char temp=ch[0];
			ch[0]=ch[ch.length-1];
			ch[ch.length-1]=temp;
			String t=new String(ch);
			a+=t+" ";
		}
		System.out.println(a);
	}
	
	//Method to remove Digits from String
	public static void removeDigit(String s) {
		String a="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>'0' && s.charAt(i)<'9')
				continue;
			a+=s.charAt(i);
		}
		System.out.println(a);
	}
	
	//Method to count how many Alphabet,digits and special character present in string and print the three
	public static void countAlphabetDigitSpecialCharacter(String s) {
		int al=0,di=0,sp=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>'0' && s.charAt(i)<'9')
				di++;
			else if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z'))
				al++;
			else
				sp++;
		}
		System.out.println("Number of Alphebet : "+al);
		System.out.println("Number of Digit : "+di);
		System.out.println("Number of Special Character : "+sp);
	}
	
	//Method to Convert Every First Character of Words to Upper Case(Try to do using method)
	public static void startingCharacterOfWordtoUpperCase(String s) {
		String a="";
		//Since first Character is not adding in next for loop
		if(s.charAt(0)!=' ') {
			if((s.charAt(0)>='a' && s.charAt(0)<='z')) {
				a+=(char)(s.charAt(0)-32);
			}
		}
		
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==' ' && s.charAt(i)!=' ') {
				if((s.charAt(i)>='a' && s.charAt(i)<='z')) {
					a+=(char)(s.charAt(i)-32);
				}
			}
			else
				a+=s.charAt(i);
		}
		System.out.println(a);
	}
	
	//Method to count number of Alphabet in String
	public static void countAlpahbet(String s) {
		
		int c=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z'))
				c++;
		}
		System.out.println("Number of Alphabet = "+c);
	}
	
	//Method to convert to Upper Case
	public static void toUpperCase(String s) {
		String a="";
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='a' && s.charAt(i)<='z'))
				a=a+(char)((s.charAt(i))-32);
			else
				a=a+s.charAt(i);
		}
		
		System.out.println(a);
	}
	
	//Method to convert to Lower Case
	public static void toLowerCase(String s) {
		String a="";
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='A' && s.charAt(i)<='Z'))
				a=a+(char)((s.charAt(i))+32);
			else
				a=a+s.charAt(i);
		}
		
		System.out.println(a);
	}
}
