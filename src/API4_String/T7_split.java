package API4_String;

public class T7_split {
	public static void main(String[] args) {
		//split(): 문자열을 특정문자(열)로 분리시킨후~ 분리된 각각의 항목을 배열로 저장해준다.
		// or연산자를 쓸 수 있는데 여기서는 |로 쓴다~
		String tel = "010-5531-3313";
		
		//앞의 전화번호를 '-'로 분리시킨후 배열로 저장해준다.
		String[] telArr = tel.split("-");
		
		String telTemp = "";
		for(String t : telArr)
		{
			telTemp += t + "/";
		}
		System.out.println(telTemp);
		System.out.println(telTemp.substring(0, telTemp.length() - 1));
		
		String[] title = {"지역번호", "국번호", "전화번호"};
		for(int i = 0; i < telArr.length; i++)
		{
			
			System.out.println(title[i]+ ":"+ telArr[i]);
		}
		System.out.println();
		
		//각이름의 구분자를 "/"로 통일하세요.
		String names = "홍길동/이기자&김말숙:이하늘;푸른솔 고인돌";
		System.out.println(names);
		
		//방법1
		String[] nameArr = names.split("/|&|:|;| ");
		String nameTemp = "";
		for(String name : nameArr)
		{
			nameTemp += name + "/";
		}
		System.out.println("성명: "+nameTemp.substring(0, nameTemp.length()-1));
		
		//방법2: join() 배열에 분리저장되어있는 항목들을 지정해준 특정배열을 사이에 넣어서 결합하여 만들어준다.
		String nameJoin = String.join("//", nameArr);
		System.out.println(nameJoin);
		
	}
}
