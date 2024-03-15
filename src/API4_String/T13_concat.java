package API4_String;

//concat() : 문자열과 문자열의 결합( + 연산자와비슷하지만 다름)
//contains() : 문자열의 포함유무(있으면 true, 없으면 false를 반환시킴)
public class T13_concat {
	public static void main(String[] args) {
		String str1 = "서울";
		String gubun = "@";
		String str2 = "부산";
		String res = "";
		
		res = str1 + gubun + str2;
		System.out.println(res);
		
		res = str1.concat(gubun).concat(str2);
		System.out.println(res);
		
		System.out.println(gubun.concat(str1).concat(gubun));
	}
}
