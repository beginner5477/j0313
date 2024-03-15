package API5_Wrapper;

//Wrapper클래스 : 기본타입을 참조타입으로(Boxing), 참조타입을 기본타입으로(Unboxing) 형변환할때 씀.
public class Test1 {
	public static void main(String[] args) {
		int intsu1 = 100, intsu2 = 200;
		System.out.println("1.intsu1 + 100 = "+(intsu1+100));
		
		//정수형 박싱처리(Integer) - 기본타입(int)가 참조타입(객체)로 타입변환
		Integer objSu1 = new Integer(intsu1);
		System.out.println("1.objSu1 + 100 = "+(objSu1+100));
		
		//자동 박싱 처리됨.
		//자신의 성질을 그대로 가지고 있으므로 초기값 선언안하고 계산이나 출력시키지 못함
		Integer objSu2;
		objSu2 = intsu2;
		System.out.println("2.objSu2 + 100: " + (objSu2 + 100));
		
		//언박싱 처리
		String strIntSu1 = "100";
		System.out.println("strIntSu1 + 100 = " + (strIntSu1 + 100));
		System.out.println("strIntSu1 + 100 = " + (Integer.parseInt(strIntSu1) + 100));
		
		//double <-> Double
		double dblSu = 3.141592;
		Double objDblSu = new Double(dblSu);
		System.out.println(objDblSu + 100.4);
		
		//Boxing
		int su3 = 100;
		Integer objSu3= Integer.valueOf(su3);
		System.out.println( objSu2 + 100);
		
		//Unboxing
		int su4 = Integer.valueOf(objSu3);
		System.out.println(su4 + 100);
	}
}
