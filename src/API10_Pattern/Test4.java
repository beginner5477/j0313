package API10_Pattern;

import java.util.regex.Pattern;

//문자열 정규식....(?는 앞의 인자가 0번이나 1번, +는 한번이상 반복, *는 0번이상반복 가능)
public class Test4 {
	public static void main(String[] args) {
		String regEx1 = "^dd*$"; 
		String regEx2 = "^[a-z]*$"; 
		String regEx3 = "^[A-Z]*$"; 
		String regEx4 = "^[a-zA-Z]*$"; 
		String regEx5 = "^[가-힣]*$"; 
		String regEx6 = "^[a-zA-Z가-힣]*$"; 
		String regEx7 = "^[a-zA-Z가-힣 ]*$"; 
		String regEx8 = "^[a-zA-Z가-힣 0-9]*$"; 
		String regEx9 = "^[a-zA-Z가-힣 0-9_]*$"; 
		
		String str1 = "";
		String str2 = "1234xabcoqoq";
		String str3 = "a";
		String str4 = "B";
		String str5 = "abcsdfcabc";
		String str6 = "ADCJAUWRDQE";
		String str7 = "asDf";
		String str8 = "asDf";
		String str9 = "asDf   "; 
		String str10 = "asDf	"; 
		String str11 = "자바클래스";
		String str12 = "자바 클래스";
		String str13 = "자바클 Computer";
		String str14 = "자바클 Computer2";
		
		
		System.out.println("1:1 = "+Pattern.matches(regEx1, str1));
		System.out.println("1:2 = "+Pattern.matches(regEx1, str2));
		System.out.println("1:3 = "+Pattern.matches(regEx1, str3));
		System.out.println("1:4 = "+Pattern.matches(regEx1, str4));
		System.out.println("1:5 = "+Pattern.matches(regEx1, str5));
		System.out.println("1:6 = "+Pattern.matches(regEx1, str6));
		System.out.println("1:7 =  "+Pattern.matches(regEx1, str7));
		System.out.println("1:8 =  "+Pattern.matches(regEx1, str8));
		System.out.println("1:9 =  "+Pattern.matches(regEx1, str9));
		System.out.println("1:10 =  "+Pattern.matches(regEx1, str10));
		System.out.println("1:11 =  "+Pattern.matches(regEx1, str11));
		System.out.println("1:12 =  "+Pattern.matches(regEx1, str12));
		System.out.println("1:13 =  "+Pattern.matches(regEx1, str13));
		System.out.println("1:14 =  "+Pattern.matches(regEx1, str14));
		System.out.println();
		
		System.out.println("2:1 = "+Pattern.matches(regEx2, str1));
		System.out.println("2:2 = "+Pattern.matches(regEx2, str2));
		System.out.println("2:3 = "+Pattern.matches(regEx2, str3));
		System.out.println("2:4 = "+Pattern.matches(regEx2, str4));
		System.out.println("2:5 = "+Pattern.matches(regEx2, str5));
		System.out.println("2:6 = "+Pattern.matches(regEx2, str6));
		System.out.println("2:7 =  "+Pattern.matches(regEx2, str7));
		System.out.println("2:8 =  "+Pattern.matches(regEx2, str8));
		System.out.println("2:9 =  "+Pattern.matches(regEx2, str9));
		System.out.println("2:10 =  "+Pattern.matches(regEx2, str10));
		System.out.println("2:11 =  "+Pattern.matches(regEx2, str11));
		System.out.println("2:12 =  "+Pattern.matches(regEx2, str12));
		System.out.println("2:13 =  "+Pattern.matches(regEx2, str13));
		System.out.println("2:14 =  "+Pattern.matches(regEx2, str14));
		System.out.println();
		
		System.out.println("3:1 = "+Pattern.matches(regEx3, str1));
		System.out.println("3:2 = "+Pattern.matches(regEx3, str2));
		System.out.println("3:3 = "+Pattern.matches(regEx3, str3));
		System.out.println("3:4 = "+Pattern.matches(regEx3, str4));
		System.out.println("3:5 = "+Pattern.matches(regEx3, str5));
		System.out.println("3:6 = "+Pattern.matches(regEx3, str6));
		System.out.println("3:7 =  "+Pattern.matches(regEx3, str7));
		System.out.println("3:8 =  "+Pattern.matches(regEx3, str8));
		System.out.println("3:9 =  "+Pattern.matches(regEx3, str9));
		System.out.println("3:10 =  "+Pattern.matches(regEx3, str10));
		System.out.println("3:11 =  "+Pattern.matches(regEx3, str11));
		System.out.println("3:12 =  "+Pattern.matches(regEx3, str12));
		System.out.println("3:13 =  "+Pattern.matches(regEx3, str13));
		System.out.println("3:14 =  "+Pattern.matches(regEx3, str14));
		System.out.println();
		
		System.out.println("4:1 = "+Pattern.matches(regEx4, str1));
		System.out.println("4:2 = "+Pattern.matches(regEx4, str2));
		System.out.println("4:3 = "+Pattern.matches(regEx4, str3));
		System.out.println("4:4 = "+Pattern.matches(regEx4, str4));
		System.out.println("4:5 = "+Pattern.matches(regEx4, str5));
		System.out.println("4:6 = "+Pattern.matches(regEx4, str6));
		System.out.println("4:7 =  "+Pattern.matches(regEx4, str7));
		System.out.println("4:8 =  "+Pattern.matches(regEx4, str8));
		System.out.println("4:9 =  "+Pattern.matches(regEx4, str9));
		System.out.println("4:10 =  "+Pattern.matches(regEx4, str10));
		System.out.println("4:11 =  "+Pattern.matches(regEx4, str11));
		System.out.println("4:12 =  "+Pattern.matches(regEx4, str12));
		System.out.println("4:13 =  "+Pattern.matches(regEx4, str13));
		System.out.println("4:14 =  "+Pattern.matches(regEx4, str14));
		System.out.println();
		
		System.out.println("5:1 = "+Pattern.matches(regEx5, str1));
		System.out.println("5:2 = "+Pattern.matches(regEx5, str2));
		System.out.println("5:3 = "+Pattern.matches(regEx5, str3));
		System.out.println("5:4 = "+Pattern.matches(regEx5, str4));
		System.out.println("5:5 = "+Pattern.matches(regEx5, str5));
		System.out.println("5:6 = "+Pattern.matches(regEx5, str6));
		System.out.println("5:7 =  "+Pattern.matches(regEx5, str7));
		System.out.println("5:8 =  "+Pattern.matches(regEx5, str8));
		System.out.println("5:9 =  "+Pattern.matches(regEx5, str9));
		System.out.println("5:10 =  "+Pattern.matches(regEx5, str10));
		System.out.println("5:11 =  "+Pattern.matches(regEx5, str11));
		System.out.println("5:12 =  "+Pattern.matches(regEx5, str12));
		System.out.println("5:13 =  "+Pattern.matches(regEx5, str13));
		System.out.println("5:14 =  "+Pattern.matches(regEx5, str14));
		System.out.println();
		
		System.out.println("6:1 = "+Pattern.matches(regEx6, str1));
		System.out.println("6:2 = "+Pattern.matches(regEx6, str2));
		System.out.println("6:3 = "+Pattern.matches(regEx6, str3));
		System.out.println("6:4 = "+Pattern.matches(regEx6, str4));
		System.out.println("6:5 = "+Pattern.matches(regEx6, str5));
		System.out.println("6:6 = "+Pattern.matches(regEx6, str6));
		System.out.println("6:7 =  "+Pattern.matches(regEx6, str7));
		System.out.println("6:8 =  "+Pattern.matches(regEx6, str8));
		System.out.println("6:9 =  "+Pattern.matches(regEx6, str9));
		System.out.println("6:10 =  "+Pattern.matches(regEx6, str10));
		System.out.println("6:11 =  "+Pattern.matches(regEx6, str11));
		System.out.println("6:12 =  "+Pattern.matches(regEx6, str12));
		System.out.println("6:13 =  "+Pattern.matches(regEx6, str13));
		System.out.println("6:14 =  "+Pattern.matches(regEx6, str14));
		System.out.println();
		
		System.out.println("7:1 = "+Pattern.matches(regEx7, str1));
		System.out.println("7:2 = "+Pattern.matches(regEx7, str2));
		System.out.println("7:3 = "+Pattern.matches(regEx7, str3));
		System.out.println("7:4 = "+Pattern.matches(regEx7, str4));
		System.out.println("7:5 = "+Pattern.matches(regEx7, str5));
		System.out.println("7:6 = "+Pattern.matches(regEx7, str6));
		System.out.println("7:7 =  "+Pattern.matches(regEx7, str7));
		System.out.println("7:8 =  "+Pattern.matches(regEx7, str8));
		System.out.println("7:9 =  "+Pattern.matches(regEx7, str9));
		System.out.println("7:10 =  "+Pattern.matches(regEx7, str10));
		System.out.println("7:11 =  "+Pattern.matches(regEx7, str11));
		System.out.println("7:12 =  "+Pattern.matches(regEx7, str12));
		System.out.println("7:13 =  "+Pattern.matches(regEx7, str13));
		System.out.println("7:14 =  "+Pattern.matches(regEx7, str14));
		System.out.println();
		
		System.out.println("8:1 = "+Pattern.matches(regEx8, str1));
		System.out.println("8:2 = "+Pattern.matches(regEx8, str2));
		System.out.println("8:3 = "+Pattern.matches(regEx8, str3));
		System.out.println("8:4 = "+Pattern.matches(regEx8, str4));
		System.out.println("8:5 = "+Pattern.matches(regEx8, str5));
		System.out.println("8:6 = "+Pattern.matches(regEx8, str6));
		System.out.println("8:7 =  "+Pattern.matches(regEx8, str7));
		System.out.println("8:8 =  "+Pattern.matches(regEx8, str8));
		System.out.println("8:9 =  "+Pattern.matches(regEx8, str9));
		System.out.println("8:10 =  "+Pattern.matches(regEx8, str10));
		System.out.println("8:11 =  "+Pattern.matches(regEx8, str11));
		System.out.println("8:12 =  "+Pattern.matches(regEx8, str12));
		System.out.println("8:13 =  "+Pattern.matches(regEx8, str13));
		System.out.println("8:14 =  "+Pattern.matches(regEx8, str14));
		System.out.println();
		
	}
}
