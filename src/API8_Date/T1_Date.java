package API8_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class T1_Date {
	public static void main(String[] args) {
		//Date 객체 거의 다  자바 유틸에 있는거 가져와라
		Date now = new Date();
		System.out.println("1.오늘의 날짜(기본형식) "+now);
		
		//날짜객체를 문자화: toString()
		String strNow = now.toString();
		System.out.println("2.오늘의 날짜(문자형식) "+strNow);
		System.out.println();
		
		//날짜 형식을 사용자 지정에 따라 변경: SimpleDateFormat()
		//매개변수 : 년도(yy, yyyy), 월(M), 일(d), 시간(h,H), 분(m), 초(s)
		//시간 대소문자 차이는 24시간제랑 12시간제 차이
		SimpleDateFormat sdf = new SimpleDateFormat();
		String strNow1 = sdf.format(now);
		System.out.println("기본 날짜 시간 포멧"+strNow1);
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		strNow1 = sdf.format(now);
		System.out.println("사용자지정 포멧"+strNow1);
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		strNow1 = sdf.format(now);
		System.out.println("사용자지정 포멧"+strNow1);
		sdf = new SimpleDateFormat("yy년 M월 d일");
		strNow1 = sdf.format(now);
		System.out.println("사용자지정 포멧"+strNow1);
		
		sdf = new SimpleDateFormat("h:m:s");
		strNow1 = sdf.format(now);
		System.out.println("사용자지정 포멧"+strNow1);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("사용자지정 포멧"+strNow1);
		System.out.println();
		
		sdf = new SimpleDateFormat("오늘은E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("EEE, d yyyy-MM-dd HH:mm:ss", Locale.JAPANESE);
		strNow1 = sdf.format(now);
		System.out.println("사용자지정 포멧"+strNow1);
		
	}
}
