package API4_String;

import java.util.StringTokenizer;

public class T12_StringTokenizer {
	public static void main(String[] args) {
		//StringTokenizer: 문자열을 특정 문자(열)로 분리시킨후 분리된 각각의 항목(토큰)을 내부반복자(이터레이터)로 호출시켜준다.
		String tel = "010-5531-3313";
		
		StringTokenizer telArr = new StringTokenizer(tel, "-");
		
		System.out.println("telArr토큰의 갯수? "+ telArr.countTokens());
		
		String str = "";
		//이터레이터방식
		while(telArr.hasMoreElements())
		{
			str += telArr.nextToken();
		}
		System.out.println("str: " +str);
	}
}
