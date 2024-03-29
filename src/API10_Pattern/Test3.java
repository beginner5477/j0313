package API10_Pattern;

import java.util.regex.Pattern;

// 공백유무체크 : ^[\\s]*$
public class Test3 {
	public static void main(String[] args) {
		String regEx1 = "^[\\s]*$";
		
		String str1 = "1234";
		String str2 = "12 3 4";
		String str3 = "12!!";
		String str4 = "12	"; 
		String str5 = "     "; 
		
		System.out.println("1. "+ Pattern.matches(regEx1, str1));
		System.out.println("2. "+ Pattern.matches(regEx1, str2));
		System.out.println("3. "+ Pattern.matches(regEx1, str3));
		System.out.println("4. "+ Pattern.matches(regEx1, str4));	
		System.out.println("5. "+ Pattern.matches(regEx1, str5));
	}
}
