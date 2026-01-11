package Methods;

import java.util.Scanner;

public class Assign_26_Check_Xylem_Phloem_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		String s = (Xylem_Phloem(n)) ? "Xylem Number" : "Phloem Number";
		System.out.println(s);
	}

	// to check xylem or phloem number
	public static boolean Xylem_Phloem(int n) {
		int l = n % 10, f = 0, mid = 0, sum_f_l;
		n /= 10;
		while (n != 0) {
			if (n < 10) {
				f = n;
			} else {
				mid += n % 10;
			}
			n /= 10;
		}
		sum_f_l = l + f;
		if (sum_f_l == mid) {
			return true;
		} else {
			return false;
		}
	}
}
