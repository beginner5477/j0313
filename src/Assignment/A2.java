package Assignment;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char temp = ' ';
		int sw = 0;
		int cnt = 0;	//3번 기회 카운트
		int cnt2 = 0;	//입력받은 ID의 한글자씩 뽑아서 같은게 있으면 카운트해서 ID길이크기랑 같으면 통과시켜줌
		String[] lowerCase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "_"};
		String[] upperCase = new String[lowerCase.length];
		
		//소문자 알파벳 배열 대문자로 변환해서 저장시키기
		for(int i = 0; i < lowerCase.length; i++)
		{
			upperCase[i] = lowerCase[i].toUpperCase();
		}
		while(true)
		{
			System.out.print("아이디를 입력하세요: ");
			String ID = sc.nextLine();
			
			//ID길이 크기만큼 반복시켜서 유효성검사하기
			for(int i = 0; i < ID.length(); i++)
			{
				//ID허용길이 범위 검사
				if(i == 0 && (ID.length() > 20 || ID.length() < 4))
				{
					break;
				}
				//ID 숫자로 유효성검사 sw는 숫자중에 찾으면 알파벳 검사 안하게 하기
				for(int j = 1; j <= 9; j++)
				{
					temp = Integer.toString(j).charAt(0);
					if(ID.charAt(i) == temp)
					{
						cnt2++;
						sw = 1;
						break;
					}
				}
				//ID 소문자, 대문자 알파벳에서 유효성검사 + 배열마지막에 허용되는 특문'_'까지 검사
				if(sw == 0)
				{
					for(int j = 0; j < lowerCase.length; j++)
					{
						temp = lowerCase[j].charAt(0);
						if(ID.charAt(i) == temp)
						{
							cnt2++;
							sw = 1;
							break;
						}
						temp = upperCase[j].charAt(0);
						if(ID.charAt(i) == temp)
						{
							cnt2++;
							sw = 1;
							break;
						}
					}
				}
				sw = 0;
			}
			//cnt2가 ID크기만큼 됬으면 모든 문자가 통과한것으로 유효아이디고 아니면 잘못된 아이디임
			if(cnt2 != ID.length())
			{
				System.out.println("==> 입력된 아이디 "+ ID+"는 사용불가입니다.");
				cnt2 = 0;
			}
			else 
			{
				System.out.println("==> 입력된 아이디 "+ ID+"는 사용가능합니다.");
				System.out.println(ID+" 로그인 되었습니다.");
				break;
			}
			//3번기회 카운트하기
			cnt++;
			if(cnt == 3)
			{
				System.out.println("지금부터 사용이 20초 제한됩니다.");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				for(int i = 0; i < 20; i++)
				{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print("~");
				}
				System.out.println();
				cnt = 0;
				cnt2 = 0;
				continue;
			}
			
			System.out.print("계속하시겠습니까?(Y/N) ");
			String ans = sc.nextLine();
			if(ans.toUpperCase().equals("N")) break;
			else if(ans.toUpperCase().equals("Y")) continue;
			else System.out.println("입력이 잘못되었습니다 제대로 입력해주세요 다시시작합니다.");
			
		}
		sc.close();
	}

}
