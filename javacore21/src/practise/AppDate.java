package practise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AppDate {
public static void main(String[] args) {
	LocalDate localDate = LocalDate.now();
	System.out.println(localDate);
	System.out.println(localDate.plusDays(5).plusMonths(1).plusWeeks(1).plusYears(1));
	System.out.println(localDate.getEra());
	System.out.println(localDate.isLeapYear());
	System.out.println(localDate.atStartOfDay());
	System.out.println(localDate.ofEpochDay(1));
	
	LocalTime localTime = LocalTime.now();
	System.out.println(localTime);
	System.out.println(localTime.plusHours(1).plusMinutes(35).plusSeconds(1333));
	System.out.println(localTime.truncatedTo(ChronoUnit.HOURS));
	
	LocalDateTime cdt = LocalDateTime.now();
	System.out.println(cdt);
	System.out.println(cdt.plusDays(2).plusMonths(1).plusWeeks(2).plusYears(1));
	System.out.println(cdt.plusHours(2).plusMinutes(5).plusNanos(564).plusSeconds(32));
}
}
