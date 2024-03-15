package API4_String;

import java.util.Scanner;

public class T3_charAt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//성별코드가 1,3이면 남자 2,4면 여자로 출력하세요
		System.out.print("주민번호를 입력하세요:");
		String jumin = sc.next(); 
		char gender = ' ';
		String strGender = "";
		
		if((jumin.charAt(7) == '1')||(jumin.charAt(7) == '3'))
		{
			gender = 'm';
		}
		else if((jumin.charAt(7) == '2')||(jumin.charAt(7) == '4'))
			gender = 'w';
		else System.out.println("입력이 잘못되었습니다 다시입력하세요.");
		
		if(gender == 'm') strGender = "남자";
		else if(gender == 'w') strGender ="여자";
		else System.out.println("입력이 잘못되엇습니다");
		
		System.out.println(strGender);
		
		sc.close();
	}
	
	
	
}
