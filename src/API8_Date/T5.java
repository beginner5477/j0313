package API8_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//두 날짜간의 차이 구하기
public class T5 {
	public static void main(String[] args) throws ParseException {
		String strDate1 = "2024-03-14";
		String strDate2 = "2024-03-13";
		
//		if(strDate1 > strDate2)  비교불가용~.
//		{
//			
//		}
		
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(strDate1);
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(strDate2);
		System.out.println(date1);
		if(date1.getTime() > date2.getTime()) System.out.println("date1이 더 크다.");
		else System.out.println("date2이 더 크다.");
		System.out.println(date1.getTime());
		long res1 = (date1.getTime() - date2.getTime()) / 1000; //초
		long res2 = (date1.getTime() - date2.getTime()) / 1000 / 60; // 분
		long res3 = (date1.getTime() - date2.getTime()) / 1000 / 60 / 60; // 시
		long res4 = (date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24; // 일
		
		System.out.println("res1: "+res1);
		System.out.println("res2: "+res2);
		System.out.println("res3: "+res3);
		System.out.println("res4: "+res4);
		
	}
}
