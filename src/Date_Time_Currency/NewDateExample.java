package Date_Time_Currency;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class NewDateExample {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		LocalDateTime dateTime=LocalDateTime.now();
		
		System.out.println("Date: "+date);
		System.out.println("Time: "+time);//hrs:min:second:millisecond
		System.out.println("Date Time: "+dateTime);
		System.out.println();
		
		//Formatting
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");//all are case sensitive
		String formatted=dateTime.format(format);
		System.out.println("Formatted DateTime : "+formatted);
	}
}
