package API4_String;

import java.util.Objects;

public class T9_compareTo {
	public static void main(String[] args) {
		String str = "Seoul";
		str += "/Busan";
		str += "/CheongJu";
		
		System.out.println("str: "+str);
		String a = "Seoul";
		String b = "seoul";
		String c = a + b;
		System.out.println("c: "+c);
		System.out.println();
		
//		compareTo() : 유니코드값으로 앞문자에서 뒤문자 하나씩 빼서 그 숫자 반환?
//					  문자열 비교 메소드(0:동일자료, 음수:앞의 문자열이 뒤의 문자열보다 작다, 양수: 앞의 문자열이 뒤의 문자열보다 크다.
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		
		//빈값비교: equals(), isBlank(), isEmpty()
		String d = "";
		System.out.println("1.d가 빈값이냐? "+d.equals(""));
		System.out.println("2.d가 공백이냐? "+d.equals(" "));
		System.out.println("3.d가 빈값이냐? "+d.isBlank());
		System.out.println("4.d가 빈값이냐? "+d.isEmpty());
		System.out.println("4.d가 null값이냐? "+Objects.isNull(d));
	}
}
