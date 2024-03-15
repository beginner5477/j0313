package API4_String;

public class T5_getChars {
	public static void main(String[] args) {
		String str1 = "Hello~";
		
		char[] chrArr = new char[str1.length()];
		str1.getChars(0, str1.length(), chrArr, 0);	//스트링을 배열복사한것.
		System.out.println("chrArr: "+ chrArr);
		System.out.println();
		
		String temp = "";
		
		for(char chr : chrArr) 
		{
			temp += chr + "/";
		}
		System.out.println(temp.substring(0, temp.length()-1));
	}
}
