package API8_Date;

import java.util.Calendar;

public class T2_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("년도: " +cal.get(Calendar.YEAR));
		System.out.println("월: " +(cal.get(Calendar.MONTH)+1));
		System.out.println("일: "+cal.get(Calendar.DATE));
		System.out.println("시: "+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분: "+cal.get(Calendar.MINUTE));
		System.out.println("초: "+cal.get(Calendar.SECOND));
		System.out.println("오늘이 몇번째주: "+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("오늘이 몇번째일: "+cal.get(Calendar.DAY_OF_WEEK)); //자바에서는 일요일부터 시작해서 센다
		System.out.println("분: "+cal.get(Calendar.AM_PM)); // 현재 오전이면 0리턴 오후면 1리턴
		System.out.println(cal.get(Calendar.MONDAY));
		
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = "";
		switch(week)
		{
			case 1: strWeek = "일"; break;
			case 2: strWeek = "월"; break;
			case 3: strWeek = "화"; break;
			case 4: strWeek = "수"; break;
			case 5: strWeek = "목"; break;
			case 6: strWeek = "금"; break;
			case 7: strWeek = "토"; break;
		}
		System.out.println("오늘은 "+strWeek+"요일");
				
		System.out.println(cal.get(Calendar.MINUTE));
	}
}
