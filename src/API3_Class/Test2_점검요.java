package API3_Class;

public class Test2_점검요 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("클래스파일이 존재합니다.");
			
//			.class는 .앞의 클래스 파일에서부터 경로 추적하는 객체 생성 해주는 것?
//			객체의 정보(Test1.Class) 알아내어 출력하기
			Class clazz = Test1.class;
			System.out.println("전체 이름: " + clazz.getName());
			System.out.println("패키지명: " +clazz.getPackage());
			System.out.println("타입: " +clazz.getTypeName());
			System.out.println("simple name: " +clazz.getSimpleName());
			
			Class imgPath = Test2_점검요.class;
//			루트란 자기가 속한 영역으 최상위 폴더? 같음 헤헤
//			./면 자기가 있는 곳 상대 경로로 출발?
			System.out.println("그림파일의 경로명: " + imgPath.getResource("./images/Image20240313113651.jpg").getPath());
			System.out.println("Test2.class의 경로명: "+ imgPath.getResource("./Test2_점검요.class").getPath());
			System.out.println("Test2.class의 경로명: "+ imgPath.getResource("Test2_점검요.class").getPath());
			System.out.println("Test2.class의 경로명: "+ clazz.getResource("Test2_점검요.class").getPath());
			System.out.println("현재작업 경로의 루트(/)명: "+ clazz.getResource("/").getPath());
			System.out.println("1.그림파일의 경로명: " + imgPath.getResource("/api3_Class/images/Image20240313113659.jpg").getPath());
			System.out.println("2.그림파일의 경로명: " + imgPath.getResource("/api3_Class/images/Image20240313113659.jpg").getPath());
			System.out.println("API2_System패키지의 Test1클래스의 경로명: " + imgPath.getResource("/API2_System/Test1.class").getPath());
			System.out.println("T1_Hashcode1클래스의 경로는: " + imgPath.getResource("../API1_Object/T1_Hashcode1.class").getPath());
			System.out.println("이미지 파일 경로는: " + imgPath.getResource("./images/Image20240313113651.jpg"));
		} catch (ClassNotFoundException e) {
			System.out.println("클래스파일이 존재하지않습니다." +e.getMessage());
		} finally {
			System.out.println("작업 끝.");
		}
	}
}
