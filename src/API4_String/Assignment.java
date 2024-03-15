package API4_String;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = "Welc\\ome to .Koreao We\\lco toaoaoaaa!!!\\";
		System.out.println(sentence);
		String temp = "";
		System.out.print("찾을 문자를 입력하세요:");
		String word = sc.nextLine();
		
		for(int i = 0; i < sentence.length(); i++)
		{
			if(i == 0) 
			{
				if(sentence.indexOf(word) == -1)
				{
					System.out.println("해당문자는 없습니다.");
					break;
				}
				else
				{	if(word.length() == 1) System.out.println(word+"는 "+sentence.indexOf(word)+"번 인덱스번지에 있습니다.");
					else System.out.println(word+"는 "+sentence.indexOf(word)+"번 인덱스번지~ "+(sentence.indexOf(word)+(word.length()-1))+"인덱스번지에 있습니다.");
					for(int j = 0; j <= sentence.indexOf(word); j++)
					{
						if(word.equals("\\")) temp += ".";
						else temp += "\\";
					}
					for(int j = sentence.indexOf(word) + 1; j < sentence.length(); j++)
					{
						temp += sentence.charAt(j);
					}
				}
			}
			else
			{
				if(temp.indexOf(word) == -1) break;
				else
				{
					if(word.length() == 1) System.out.println(word+"는 "+temp.indexOf(word)+"번 인덱스번지에 있습니다.");
					else System.out.println(word+"는 "+temp.indexOf(word)+"번 인덱스번지~ "+(temp.indexOf(word)+(word.length()-1))+"인덱스번지에 있습니다.");
					int temp2 = temp.indexOf(word);
					temp = "";
					for(int j = 0; j <= temp2; j++)
					{
						if(word.equals("\\")) temp += ".";
						else temp += "\\";
					}
					for(int j = temp2 + 1; j < sentence.length(); j++)
					{
						temp += sentence.charAt(j);
					}
				}
			}
		}
		
		sc.close();
	}
}
