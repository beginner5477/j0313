package API10_Pattern;

import java.util.regex.Pattern;

//이메일 형식 연습

public class Test5 {
	public static void main(String[] args) {
		String regEx1 = "^www\\.[a-zA-Zㄱ-ㅎㅏ-ㅣ가-힣]{1,20}(\\.[a-z]{2,}){1,2}$";
		
		String str1 = "www.asdfsdASDSDQ.co.kr";
		
		System.out.println("1."+Pattern.matches(regEx1, str1));
		System.out.println();
	}
}

