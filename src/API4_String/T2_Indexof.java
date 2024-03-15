package API4_String;

public class T2_Indexof {
	public static void main(String[] args) {
		//             0         1
		//			   0123456789012345678
		String msg1 = "Welcome to Korea~";
		String msg2 = "한국 방문하신 것을 환영합니다~";
		
		//indexOf(): 찾고자 하는 문자(열)이 있는가를 표시, 있으면 위치값(인덱스값)을 반환, 없으면 -1을 반환
		System.out.println("msg1에 'O'가 있니?" + msg1.indexOf("O"));
		System.out.println("msg1에 'o'가 있니?" + msg1.indexOf("o"));
		System.out.println("msg1에 'korea'가 있니?" + msg1.indexOf("korea"));
		System.out.println("msg1에 'Korea'가 있니?" + msg1.indexOf("Korea"));
		System.out.println("msg2에 '환영'가 있니?" + msg2.indexOf("환영"));
		
		System.out.println("msg1에 'o'가 있니?" + msg1.lastIndexOf("o"));
	}
}
