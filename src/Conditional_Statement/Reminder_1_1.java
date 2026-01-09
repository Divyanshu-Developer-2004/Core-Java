package Conditional_Statement;

public class Reminder_1_1 {
	public static void main(String[] args) {
		String day="Tue";
		switch(day) {
		case "Mon":
		case "Thru":
		case "Wed":System.out.println("Take English Book");
		break;
		case "Tue":
		case "Sat":System.out.println("Take Java book");
		break;
		default:System.out.println("DO assignment");
		}
	}
}
