package Assignment;

import java.util.Scanner;

import API4_String.T3_charAt;

public class A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			boolean stop = false;
			System.out.print("파일명을 입력하세요:");
			String fileName = sc.nextLine();
			String[] menu = {"jpg", "text", "zip", "xlsx", "hwp", "gif", "xls"};
			String[] selection = {"그림파일", "텍스트파일", "압축파일", "엑셀파일", "한글파일", "그림파일"}; 
			
			//뒤에서부터 .인덱스번지 찾아내기(확장자에는 '.'못들어감) 그후 그다음 인덱스번지 저장
			int i = fileName.lastIndexOf(".") + 1;
			//jud에 .앞 확장자명 첫번째 글자를 저장
			String jud = fileName.substring(i);
			for(int j = 0; j < menu.length; j++)
			{
				//.이후 확장자이름이 저장된 배열에 있는 확장자와 비교해서 같으면
				if(jud.equals(menu[j])) 
				{
					//출력하고 반복문 종료
					System.out.println(fileName+" ==> "+selection[j]);
					stop = true;
					break;
				}
			}
			if(!stop) System.out.println("확장자를 잘못 입력하셨습니다.");
			System.out.print("계속할까요?(Y/N) ");
			String ans = sc.nextLine();
			if(ans.toUpperCase().equals("N")) break;
			else if(ans.toUpperCase().equals("Y")) continue;
			else System.out.println("입력이 잘못되었습니다 제대로 입력해주세요 다시시작합니다.");
		}
		
		System.out.println("수고하셨습니다.");
		sc.close();
	}

}
