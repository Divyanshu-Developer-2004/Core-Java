package Conditional_Statement;

public class Assign_13_b_Reminder {
	public static void main(String[] args) {
		String day="Wed";
		switch(day) {
		case "Mon","Thru","Wed":System.out.println("Take English Book");
		break;
		case "Tue","Sat":System.out.println("Take Java book");
		break;
		default:System.out.println("DO assignment");
		}
	}
}
