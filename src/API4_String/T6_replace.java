package API4_String;

public class T6_replace {
	public static void main(String[] args) {
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 오신것을 환영합니다!!!";
		
		System.out.println("msg1: " + msg1);
		System.out.println("msg2: " + msg2);
		
		//replace(): 대체 - 특정문자(열)을 지정한 문자(열)로 (모두)변경한다. 단, 대소문자는 구별함.
		System.out.println("1.'Korea'를 'USA'로 변경하시오. " + msg1.replace("Korea", "USA"));
		System.out.println("2.'한국'을 '미국'로 변경하시오. " + msg2.replace("한국", "미국"));
		System.out.println("3.'o'을 'O'로 변경하시오. " + msg1.replace("o", "O"));
		//검색어에 정규식을 사용할때에는 replaceAll을 사용함.
		System.out.println("4.'o'을 'O'로 변경하시오. " + msg1.replaceAll("o", "O"));
		System.out.println();
		
		String msg3 = " ! H e l l o ! ";
		System.out.println("msg3: "+msg3);
		System.out.println("msg1 + msg3 + msg2: "+msg1+msg3+msg2);
		System.out.println("msg1 + msg3 + msg2: "+msg1+msg3.trim()+msg2);
		
		//msg3번에 포함된 모든 공백을 삭제후 msg1+msg3+msg2를 출력하시오.
		System.out.println("msg1 + msg3 + msg2: "+msg1+msg3.trim().replace(" ", "") +msg2);
		System.out.println("msg1 + msg3 + msg2: "+msg1+msg3.replace(" ", "") +msg2);
		
		//msg3에는 "hello" 문자를 포함하고있는가?
		String msg4 = "hello";
		System.out.println(msg3.replace(" ", "").toLowerCase().indexOf(msg4));
		System.out.println(msg3.replace(" ", "").toLowerCase().contains(msg4));
		System.out.println(msg3.replace(" ", "").contains(msg4));
		
		//지정한 문자(열)을 반복처리한다. repeat();는 자바9이후부터 등장한 메소드 함수
		System.out.println(msg3.repeat(3));
		System.out.println("=".repeat(30));
	}
}
