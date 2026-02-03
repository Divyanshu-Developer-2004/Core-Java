package Stack_1;

public class RevString {
	public static void main(String[] args) {
		revString("Hello World");
	}
	
	public static String revString(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		String s2=new String(ch);
		System.out.println(s2);
		return s2;
	}
}
