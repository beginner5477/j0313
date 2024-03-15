package API4_String;

//트림은 바깥쪽 공백을 없애줌~
public class T1_Trim {
	public static void main(String[] args) {
		String str1 = "  안  녕  ";
		String res;
		res = "1234" + str1 + "헤헿";
		System.out.println("res: " + res);
		
		res = "1234" + str1.trim() + "헤헿";
		System.out.println("res: " + res);
	}
}
