package API1_Object;

public class T1_Hashcode1 {
	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "김말숙";
		String s4 = new String("홍길동");
		String s5 = new String("홍길동");
		
		
		if(s1 == s2) System.out.println("s1과 s2가 가리키는 주소는 같습니다.");
		else System.out.println("s1과s2는 다릅니다.");
		if(s1 == s3) System.out.println("s1과 s3가 가리키는 주소는 같습니다.");
		else System.out.println("s1과s3는 다릅니다.");
		if(s1 == s4) System.out.println("s1과 s4가 가리키는 주소는 같습니다.");
		else System.out.println("s1과s4는 다릅니다.");
		if(s4 == s5) System.out.println("s4과 s5가 가리키는 주소는 같습니다.");
		else System.out.println("s4과s5는 다릅니다.");
		if(s1.equals(s4)) System.out.println("s1과 s4의 값은 같습니다.");
		else System.out.println("s1과s4는 다릅니다.");
		
		System.out.println("11.(hashCode) => s1: " + s1.hashCode() + " s2: "+ s2.hashCode());
		System.out.println("12.(hashCode) => s1: " + s1.hashCode() + " s3: "+ s3.hashCode());
		System.out.println("13.(hashCode) => s1: " + s1.hashCode() + " s4: "+ s4.hashCode());
		System.out.println("14.(hashCode) => s4: " + s4.hashCode() + " s5: "+ s5.hashCode());
		
	}
}
