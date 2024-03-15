package API8_Date;

import java.util.Calendar;
import java.util.TimeZone;

public class T6 {
	public static void main(String[] args) {
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar cal = Calendar.getInstance(timezone);
		
		int amPm = cal.get(Calendar.AM_PM);
		String stramPm = "";
		if(amPm == Calendar.AM) stramPm = "오전";
		else stramPm = "오후";
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("미국 로스엔젤레스의 현재 시각: "+stramPm+hour+" "+minute+" "+second);
	}
}
