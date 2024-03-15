package API6_Math;

public class Test {
	public static void main(String[] args) {
		int su1 = 100;
		int su2 = -100;
		
		// 절댓값:Math.abs()
		System.out.println("su1: "+su1);
		System.out.println("su2: "+su2);
		System.out.println("Math.abs(su1): "+Math.abs(su1));
		System.out.println("Math.abs(su2): "+Math.abs(su2));
		System.out.println();
		
		double d1 = 1234.5678;
		double d2 = -1234.3518;
		
		//반올림: Math.round() - 정수값으로 반환시켜줌(소수점아래 첫째자리에서 실행함)
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		System.out.println("Math.round(d1): "+Math.round(d1));
		System.out.println("Math.round(d2): "+Math.round(d2));
		
		//소수 첫쨰자리에서의 반올림: 1234.567 + 0.5 = 1235.067 에다가 int casting > 1235
		//소수 둘째자리에서 반올림 1234.567 + 0.05 = 1234.617 에다가 10곱하고 int casting > 12346 에다가 10으로 나눔 1234.6
		System.out.println("Math.round(d1): "+Math.round(d2 * 10) / 10.0);
		//소수 셋째자리에서 반올림 1234.567 + 0.005 = 1234.572 에다가 100곱하고 int casting > 123457 에다가 100으로 나눔 1234.57
		System.out.println("Math.round(d1): "+Math.round(d2 * 100) / 100.0);
		System.out.println("Math.round(d1): "+Math.round(d2 * 1000) / 1000.0);
		System.out.println();
		
		//String.format("%.nf", 실수) - 자동으로 반올림해서 보여줌
		System.out.println(String.format("%.0f", d2));
		System.out.println(String.format("%.1f", d2));
		System.out.println(String.format("%.2f", d2));
		System.out.println(String.format("%.3f", d2));
		System.out.println();
		
		//올림함수: Math.ceil() - 올림시켜놓고 실수값으로 반환해줌
		System.out.println(Math.ceil(d1));
		double d3 = 123.45;
		System.out.println(Math.ceil(d3));
		//소수이하 둘쨰자리에서 무조건 올림해라
		System.out.println(Math.ceil(d1 * 10) / 10);
		System.out.println(Math.ceil(d1 * 100) / 100);
		System.out.println();
		
		//내림함수: Math.floor() 
		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d1 * 10) / 10);
		System.out.println(Math.floor(d1 * 100) / 100);
		System.out.println();
		
		//최댓값: max() , 최솟값: min() 2개밖에 비교못해
		System.out.println(Math.max(d2, d3));
		System.out.println(Math.min(d2, d3));
		//자바에는 Math.count()가 없음 자바에서 개수 구할떄는 length()나 size() 등등 써야됨.
		//length는 문자열이나 배열에서 쓰고, size는 객체배열이나 클래스에 씀, sizeof()는 Byte수 계산
		
		//난수: Math.random():0이상 1미만의 실수가 나옴
		System.out.println(Math.random());
		System.out.println(((int)(Math.random()*100) + 1));
		System.out.println(((int)(Math.random()*(10 -5 + 1)) + 5));
	}
}
