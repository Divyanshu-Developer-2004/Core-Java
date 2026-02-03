package Day1_Assignment.SectionB;

public class Check_Binary_String {
	public static void main(String[] args) {
		String s1="0100100111110";
		String s2="0011928200011";
		System.out.println("S1 is Binary String : "+binaryString(s1));
		System.out.println("S2 is Binary String : "+binaryString(s2));
	}
	
	public static boolean binaryString(String s) {
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='0' && s.charAt(i)!='1') {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
