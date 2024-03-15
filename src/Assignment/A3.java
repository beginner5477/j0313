package Assignment;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class A3 {
	public static void main(String[] args) throws ParseException {
		String[][] dateData =
			{
					{"홍길동", "2000-1-1"},
					{"김말숙", "2020-12-31"},
					{"이기자", "2019-5-20"},
					{"소나무", "2024-3-14"},
					{"아톰맨", "2022-11-22"},
					{"에이맨", "2023-12-11"},
					{"오하늘", "2024-3-14"},
					{"최고봉", "2021-3-14"},
					{"으뜸맨", "2023-5-2"},
					{"사랑이", "2024-3-13"},
					{"감나무", "2022-10-10"},
					{"행복맨", "2000-12-12"},
					{"가나다", "2024-2-28"},
					{"오솔길", "2024-3-14"}
			};
		int n1 = 0, n2 = 0, n3 = 0;
		LocalDateTime startDateTime = LocalDateTime.now();
		
		System.out.println("1년이상된 사람 명단:");
		for(int i = 0; i < dateData.length; i++)
		{
			String[] arr = dateData[i][1].split("-");
			n1 = Integer.parseInt(arr[0]);
			n2 = Integer.parseInt(arr[1]);
			n3= Integer.parseInt(arr[2]);
			LocalDateTime compareDateTime = LocalDateTime.of(n1, n2, n3, 0, 0, 0);
			if(compareDateTime.until(startDateTime, ChronoUnit.DAYS) >= 365)
			{
				System.out.print(dateData[i][0]+" ");
				System.out.println(compareDateTime.until(startDateTime, ChronoUnit.MONTHS) + "개월 경과됨.");
			}
		}
		
		System.out.println("=========================================================");
		System.out.println("최근 한달안에 등록한 사람 명단:");
		
		for(int i = 0; i < dateData.length; i++)
		{
			String[] arr = dateData[i][1].split("-");
			n1 = Integer.parseInt(arr[0]);
			n2 = Integer.parseInt(arr[1]);
			n3= Integer.parseInt(arr[2]);
			LocalDateTime compareDateTime = LocalDateTime.of(n1, n2, n3, 0, 0, 0);
			if(compareDateTime.until(startDateTime, ChronoUnit.DAYS) < 30)
			{
				System.out.print(dateData[i][0]+" ");
				System.out.println(compareDateTime.until(startDateTime, ChronoUnit.DAYS)+"일 경과됨.");
			}
		}
		
		System.out.println("=========================================================");
		System.out.println("오늘 등록한 회원 명단:");
		
		for(int i = 0; i < dateData.length; i++)
		{
			String[] arr = dateData[i][1].split("-");
			n1 = Integer.parseInt(arr[0]);
			n2 = Integer.parseInt(arr[1]);
			n3= Integer.parseInt(arr[2]);
			LocalDateTime compareDateTime = LocalDateTime.of(n1, n2, n3, 0, 0);
			if(compareDateTime.until(startDateTime, ChronoUnit.DAYS) < 1)
			{
				System.out.print(dateData[i][0]+" ");
				System.out.println(compareDateTime.until(startDateTime, ChronoUnit.HOURS)+"시간 경과됨.");
			}
		}
	}
}