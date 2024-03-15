package API10_Pattern;

import java.util.regex.Pattern;

// 영문자와 숫자 포함 유무? ^[\\w]*$ , ^[\\W]*$
public class Test2 {
	public static void main(String[] args) {
		String regEx1 = "^[\\w]*$";
		
		String str1 = "hello";
		String str2 = "he132llo";
		String str3 = "he132ll#!o";
		String str4 = "he13   ";
		String str5 = "헬로";
		if(Pattern.matches(regEx1, str1)) System.out.println("영문자와 숫자만으로 구성되어있습니다.");
		else System.out.println("영문자와 숫자가 아닌 것이 포함되어있습니다.");
		
		System.out.println("2: "+Pattern.matches(regEx1, str2));
		System.out.println("3: "+Pattern.matches(regEx1, str3));
		System.out.println("4: "+Pattern.matches(regEx1, str4));
		System.out.println("5: "+Pattern.matches(regEx1, str5));
		System.out.println();
		
		String regEx2 = "^[\\W]*$";
		if(Pattern.matches(regEx2, str1)) System.out.println("영문자와 숫자가 아닌 문자로만 구성되어있습니다.");
		else System.out.println("영문자와 숫자로만 구성되어있습니다.");
		System.out.println("12: "+Pattern.matches(regEx2, str2));
		System.out.println("13: "+Pattern.matches(regEx2, str3));
		System.out.println("14: "+Pattern.matches(regEx2, str4));
		System.out.println("15: "+Pattern.matches(regEx2, str5));
	}
}
