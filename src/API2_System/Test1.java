package API2_System;

public class Test1 {
	public static void main(String[] args) {
		int i, tot = 0;
		
		for(i = 1; i <= 100000000; i++)
		{
			tot += i;
			if(tot >= 10000)
			{
				System.out.println("합이 10000이 넘을때 i값은 "+i);
				return;
			}
		}
		
		System.out.println("작업끝");
	}
}
