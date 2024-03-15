package API2_System;

public class Test3 {
	public static void main(String[] args) {
		int i, tot = 0;
		
		for(i = 1; i <= 100000000; i++)
		{
			tot += i;
			if(tot >= 10000)
			{
				System.out.println("합이 10000이 넘을때 i값은 "+i);
				//리턴으로 나가는거보다 엑시트로 끝내주는게 jvm한테 확실해서 더 효율적이고 좋음
				System.exit(0);
			}
		}
		
		System.out.println("작업끝");
	}
}
