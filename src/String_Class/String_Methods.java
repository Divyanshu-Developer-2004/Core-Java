package String_Class;

public class String_Methods {
	
	public static void main(String[] args) {

//		lengthMethod();
//		trimMethod();
//		subStringMethod();
//		toCharArrayMethod();
//		indexOfMethod();
//		containsMethod();
//		splitMethod();
//		equalsIgnoreCaseMethod();
//		startsWithMethod();
//		endsWithMethod();
//		valueOfMethod();
//		isEmptyMethodAndIsBlankMethod();
//		replaceMethods();
//		stripMethod();
//		indentMethod();

	}
	
	public static void indentMethod() {
		String s="Hello World";
		System.out.println(s.indent(5));//add space at starting of string;
	}
	
	public static void stripMethod() {
		String s="  Hello  Wolrd   ";
		System.out.println(s.strip());//same as trim
		System.out.println(s.stripLeading());//only removes starting spaces
		System.out.println(s.stripTrailing());//only removes ending spaces
		
	}
	
	public static void replaceMethods() {
		String s1="hi hi hi students";
		
		System.out.println(s1.replace("hi","bye"));//replace all searching string by replacing String
		System.out.println(s1.replaceFirst("hi","bye"));//replace First searching string by replacing String
		
	}
	
	public static void isEmptyMethodAndIsBlankMethod() {
		String s="";
		System.out.println(s.isEmpty());//check if string length is 0
		System.out.println(s.isBlank());//check if string contains only space or length 0
		
		String s2=" ";
		System.out.println(s2.isEmpty());//check if string length is 0
		System.out.println(s2.isBlank());//check if string contains only space or length 0
	}
	
	public static void valueOfMethod() {
		int a=100;
		String s=null;
		s=s.valueOf(a);//converts any data type into String
		System.out.println(s);
	}
	
	public static void endsWithMethod() {
		String s="helloworld";
		System.out.println(s.endsWith("world"));//true//checks whether the string ends with the given string
		System.out.println(s.endsWith("wor"));//false
	}
	
	public static void startsWithMethod() {
		String s="helloworld";
		System.out.println(s.startsWith("hello"));//true//checks whether the string starts with the given string
		System.out.println(s.startsWith("Hello"));//false
	}
	
	public static void equalsIgnoreCaseMethod() {
		String s1="java";
		String s2="JAVA";
		System.out.println(s1.equalsIgnoreCase(s2));//true //compares while ignoring the case
		System.out.println(s1.equals(s2));//false
	}
	
	public static void splitMethod() {
		String s="hi,bye,java";
		String[] str=s.split(",");//return type is String[]
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	
	public static void containsMethod() {
		String s="i love java";
		System.out.println(s.contains("love"));//true //checks whether the string or character is present in string or not
		System.out.println(s.contains("python"));//false
	}
	
	public static void indexOfMethod() {
		String s="Abbulu";
		System.out.println(s.indexOf('l'));//Gives the first occurrence of character
		System.out.println(s.indexOf('u'));
		System.out.println(s.indexOf('z'));//return -1 meaning not found
		System.out.println(s.indexOf('u',4));//Start checking from index
		System.out.println(s.lastIndexOf('u'));//gives last index of the character
		System.out.println(s.indexOf('b'));
		System.out.println(s.lastIndexOf('b'));
		
		String s1="Hello was User. How was your day";
		System.out.println(s1.indexOf("was"));
		System.out.println(s1.indexOf("s U"));
		System.out.println(s1.indexOf("was",7));//Start checking from given index
	}
	
	public static void toCharArrayMethod() {
		String s="Abul";
		// String------->char[]
		char[] c=s.toCharArray();//Converts string to character array
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		// char[]---->String
		String st=new String(c);//Constructor Converting character array to String 
		System.out.println(st);
	}
	
	public static void trimMethod() {
		String s="   c23a bv  ";
		System.out.println(s);
		System.out.println(s.trim());//removes or trim the starting  and ending spaces in the string 
	}
	
	public static void subStringMethod() {
		String s="abcdefgh";//0-a,1-b,2-c,3-d,4-e,5-f,6-g,h-7
		System.out.println(s.substring(1));//gives string form the index
		System.out.println(s.substring(3));
		System.out.println(s.substring(7));
		System.out.println(s.substring(3,7));//gives string from string index to ending index-1
		System.out.println(s);
		
	}
	
	public static void toUpperCaseMethod() {
		String s="abc";
		s=s.toUpperCase();//convert string to Upper Case
		System.out.println(s);
	}
	
	public static void toLowerCaseMethod() {
		String s="ABC";
		s=s.toLowerCase();//convert string to Lower Case
		System.out.println(s);
	}
	
	public static void charAtMethod() {
		String s="abc";
		System.out.println(s.charAt(0));//a is extracted as a is in 0 index
		System.out.println(s.charAt(1));//b
	}
	
	public static void lengthMethod() {
		String s="abc";
		int l=s.length();//gives length of String
		System.out.println(l);
		System.out.println(l);
	}
}
