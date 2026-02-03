package Day1_Assignment.SectionB;

public class Check_Palindrome {
	public static void main(String[] args) {
		String s1="Appappa";
		String s2="Appkoppa";
		System.out.println("S1 is Palindrome : "+checkPalindrome(s1));
		System.out.println("S2 is Palindrome : "+checkPalindrome(s2));
	}
	
	public static boolean checkPalindrome(String s) {
		s=s.toLowerCase();
		boolean flag=true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
