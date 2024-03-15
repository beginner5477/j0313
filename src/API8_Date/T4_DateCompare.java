package API8_Date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class T4_DateCompare {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2024, 12, 31, 0, 0, 0);
		
		System.out.println(startDateTime);
		System.out.println("남은 연도는 "+startDateTime.until(endDateTime, ChronoUnit.YEARS));
		System.out.println("남은 월은 "+startDateTime.until(endDateTime, ChronoUnit.MONTHS));
		System.out.println("남은 일자는 "+startDateTime.until(endDateTime, ChronoUnit.DAYS));
		System.out.println("남은 시는 "+startDateTime.until(endDateTime, ChronoUnit.HOURS));
		System.out.println("남은 분은 "+startDateTime.until(endDateTime, ChronoUnit.MINUTES));
		System.out.println("남은 초는 "+startDateTime.until(endDateTime, ChronoUnit.SECONDS));
	}
}
