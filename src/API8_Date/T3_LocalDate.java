package API8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class T3_LocalDate {
	public static void main(String[] args) {
		//LocalDate객체??
		LocalDate currDate = LocalDate.now();
		System.out.println("오늘날짜: "+currDate);
		
		currDate = LocalDate.of(2022, 3, 14);
		System.out.println("지정날짜: "+currDate);
		
		//시스템의 현재 시간정보 가져오기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재시간: " + currTime);
		System.out.println("현재시간: "+LocalTime.now().toString().substring(0,8));
		
		//시간 지정 세팅
		LocalTime targetTime = LocalTime.of(12, 50, 30);
		System.out.println(targetTime);
		
		//날짜 시간 split으로 T기준으로 양쪽쪼개기 연습하세용
		LocalDateTime currentTime2 = LocalDateTime.now();
		System.out.println(currentTime2);
		
		//날짜 시간 지정 세팅
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 03, 11, 13, 35, 10);
		System.out.println(targetDateTime);
		
		//날짜 연산하기
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("현재 날짜/시간: "+now.format(dtf));
		
		LocalDateTime res = now.plusYears(1);
		System.out.println("1년더하기:"+res.toString().substring(0,4));
		
		res = now.minusYears(1);
		System.out.println("1년빼기:"+res.toString().substring(0,4));
		
		res = now.plusMonths(2);
		System.out.println("2월더하기:"+res.toString().substring(5,7));
		
		res = now.minusMonths(2);
		System.out.println("2월빼기:"+res.toString().substring(5,7));
		
		res = now.plusDays(7);
		System.out.println("7일더하기:"+res.toString().substring(8,10));
		
		res = now.minusDays(7);
		System.out.println("7일빼기:"+res.toString().substring(8,10));
		System.out.println();
		
	}
}
