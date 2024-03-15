package API1_Object;

import java.util.Objects;

public class T3_isNull {
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		System.out.println("vo: " + vo);
		
		if(vo == null) System.out.println("1.vo는 null입니다~");
		else System.out.println("1.vo는 null이 아닙니다.");
		
		if(vo.getName() == null) System.out.println("2.vo.name은 null입니다.");
		else System.out.println("2.vo.name은 null이 아니다.");
		
		if(Objects.isNull(vo)) System.out.println("3.vo는 null입니다.");
		else System.out.println("3.vo는 null이 아니다.");
		
		if(Objects.nonNull(vo)) System.out.println("4.vo는 null아니다.");
		else System.out.println("4.vo는 null입니다.");
		
		vo.setName("홍길동");
		if(Objects.nonNull(vo.getName())) 
		{
			System.out.println("5.vo.name는 "+vo.getName()+"이다.");
			if(vo.getName().equals("홍길동")) System.out.println("관리자");
			else System.out.println("방문객");
		}
		else System.out.println("5.vo.name은 null입니다.");
		
		if(vo.getName().equals("홍길동")) 
		{
			System.out.println("6.vo.name는 "+Objects.requireNonNull(vo.getName())+"이다.");
//			if(vo.getName().equals("홍길동")) System.out.println("관리자");
//			else System.out.println("방문객");
		}
		else System.out.println("6.vo.name은 null입니다.");
		
		vo.setName(null);
		//널은 연산(붙이기) 같은거 하면 바로 에러임 비교도 불가임 그래서 널 연산자 따로 써줘야댐
//		System.out.println("7.vo.name는 "+vo.getName() +"이다.");
		System.out.println("8.vo.name는 "+Objects.requireNonNull(vo.getName())+"이다.");
		
	}
}
