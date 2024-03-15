package API7_Random;

import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt()); // int 범위 내의 난수 생성해줌
		System.out.println(random.nextLong()); // long 범위 내의 난수 생성해줌
		System.out.println(random.nextDouble()); // double 범위 내의 난수 생성해줌
		System.out.println(random.nextFloat()); // float 범위 내의 난수 생성해줌
		System.out.println(random.nextBoolean()); // boolean 범위 내의 난수 생성해줌
		System.out.println();
		
		System.out.println(random.nextInt(10)); // 0이상 10미만의 int가 나옴
		System.out.println((random.nextInt(10) + 1)); // 1이상 10이하 int 랜덤출력
		System.out.println((random.nextInt(10-5+1) + 5)); // 5이상 10이하 int 랜덤출력
		System.out.println((random.nextInt(30-20+1) + 20)); // 20이상 30이하 int 랜덤출력
		System.out.println();
		
		//클래스안의 매개값으로 난수를 고정시킬수있다.
		Random random1 = new Random(5);
		for(int i = 1; i <= 6; i++)
		{
			System.out.print((random1.nextInt(45)+1) + "/");
		}
		System.out.println();
		
		Random random2 = new Random(10);
		for(int i = 1; i <= 6; i++)
		{
			System.out.print((random2.nextInt(45)+1) + "/");
		}
		
	}
}
