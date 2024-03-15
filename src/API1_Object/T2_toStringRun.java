package API1_Object;

public class T2_toStringRun {
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		
		String name = "김말숙";
		int age = 30;
		boolean gender = false;
		String job = "";
		String address = "청주";
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAddress(address);
		
		System.out.println("성명 : "+vo.getName());
		System.out.println("나이 : "+vo.getAge());
		System.out.println("성별 : "+vo.isGender());
		System.out.println("직업 : "+vo.getJob());
		System.out.println("주소 : "+vo.getAddress());
		System.out.println();
		
		System.out.println("성명 : "+vo.getName().toString());
		
		//투스트링은 원래 기본이 주솟값출력시 쓰는거라 안붙여도 객체명(주솟값) 출력하라하면 
		//저절로 붙여짐.(안보여도 ㅇㅋ?)		
		System.out.println("vo : "+ vo.toString());
		System.out.println("vo : "+ vo);
	}
}
