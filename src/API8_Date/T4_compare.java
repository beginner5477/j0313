package API8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class T4_compare {
	public static void main(String[] args) {
		//날짜시간비교(주의: 시간비교시에는 ns까지 비교된다.)
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("오늘(현재) 날짜/시간: "+startDateTime);
		System.out.println();
		
		String tempToday = startDateTime.toString();
		String strToday = tempToday.substring(0,tempToday.indexOf("."));
		System.out.println("오늘(현재) 날짜/시간: "+strToday);
		
		//날짜와 시간 구분하기(T를 기준으로 앞뒤 split메소드로 짜르기)
		String strDate = strToday.split("T")[0];
		String strTime = strToday.split("T")[1];
		System.out.println("현재 날짜: "+strDate);
		System.out.println("현재 시간: "+strTime);
		System.out.println("=============================================");
		
		//비교할 날짜/시간
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 1, 14, 14, 30, 20);
		System.out.println("타겟(비교) 날짜/시간: "+targetDateTime);
		System.out.println();
		
		String strTarget = targetDateTime.toString();
//		String bigyoToday = strTempToday.substring(0,strTempToday.indexOf("."));
		System.out.println("타겟(비교) 날짜/시간: "+strTarget);
		
		//날짜와 시간 구분하기(T를 기준으로 앞뒤 split메소드로 짜르기)
		String bigyoDate = strTarget.split("T")[0];
		String bigyoTime = strTarget.split("T")[1];
		System.out.println("비교 날짜: "+strDate);
		System.out.println("비교 시간: "+strTime);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		if(strDate.equals(bigyoDate)) System.out.println("같은날");
		else System.out.println("다른날");
		
		//날짜를 날짜형식으로 비교하고자 한다면? isEqual(): 동일날짜비교, 이전날짜비교 : isBefore(), 이후날짜비교: isAfter()
		
		System.out.println("isEqual(): "+startDateTime.isEqual(targetDateTime));
		System.out.println("isBefore(): "+startDateTime.isBefore(targetDateTime));
		System.out.println("isAfter(): "+startDateTime.isAfter(targetDateTime));
		
		//날짜차이계산(Period 클래스)
		LocalDate startDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2024, 1, 14);
		Period period = Period.between(startDate, targetDate);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println();
		
		//해당월의 마지막일을 찾아주는 메소드 => (__.atEndOfMonth())
		String lastDay = "2024-02-14";
		LocalDate bigyoDate2 = LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(lastDay.substring(0,7)+"달의 마지막 일자?"+ YearMonth.from(bigyoDate2).atEndOfMonth());
		
		//데이트타임포맷터는 yyyy-dd로는 못뽑는다?
		String lastDay1 = "2024-03-02";
		LocalDate bigyoDate21 = LocalDate.parse(lastDay1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(lastDay1.substring(0,7)+"달의 마지막 일자?"+ YearMonth.from(bigyoDate21).atEndOfMonth());
		
		
		
		
	}
}
