package Day1_Assignment.SectionB;

public class Pattern_Search_In_String {
	public static void main(String[] args) {
		String s="Jai Shree Ram";
		String p1="shree";
		String p2="jaie";
		System.out.println(searchPattern(s, p1));
		System.out.println(searchPattern(s, p2));
	}
	
	public static boolean searchPattern(String s,String p) {
		s=s.toLowerCase();
		p=p.toLowerCase();
		return s.contains(p);
	}
}
