package API4_String;

public class T2_SubString {
	public static void main(String[] args) {
		//             0         1
		//			   0123456789012345678
		String msg1 = "Welcome to Korea~";
		
		//substring(): 지정된 위치(인덱스번지)부터 그뒤의 값을 출력                       
		//substring(n): 지정된 위치(n번인덱스)부터 그뒤의 값을 출력                       
		//substring(n, m): 지정된 위치(n번인덱스)부터 (m번인덱스) 앞까지의 값을 출력                       
		System.out.println("msg1의 3번 인덱스위치부터 출력하시오" + msg1.substring(3));
		System.out.println("msg1의 3번 인덱스위치부터 12번인덱스앞까지 출력하시오" + msg1.substring(3, 12));
		
		//Ko~단어를 출력하시오
		System.out.println("Ko~"+msg1.indexOf("Ko"));
		System.out.println("~"+msg1.indexOf("~"));
		System.out.println("~"+msg1.substring(msg1.indexOf("Ko"), msg1.indexOf("~")));
	}
}
