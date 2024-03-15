package API4_String;

/*
 	=> mutable(가변) / immutable(불가변)
 	String객체: immutable객체로서 Class로서 한번 크기가 생성된 값을 유지하게 된다.
 	StringBuffer객체: mutable객체로서 크기를 변경할 수 있다. 동기화를 제공, 멀티스레드 제공에 적합함. 가변길이 문자열에 적당
 	StringBuilder객체: mutable객체로서 크기를 변경할 수 있다. 동기화 여부가 불분명, 가변길이 문자열에 적당
 	성능: StringBuilder > StringBuffer >>> String
 */
public class T10_StringBuffer {
	public static void main(String[] args) {
		String str = new String("홍길동");
		System.out.println("1.str: "+str);
		
		str += "/홍길동2";
		System.out.println("2.str: "+str);
		
		//capacity() : 현재 버퍼의 크기를 알아낸다.
//		str.capacity(); 불변이므로 크기 안달라진다??
		
		//StringBuffer()객체 : 가변길이클래스로서 기본크기는 ___, 자료가 넘치면 상황에 따라서 크기를 변경한다.
//		값추가하려면 그냥넣으면 안되고 append:값을추가, insert:값을 특정위치에 삽입 원래 값은 그대로 두고, delete: 특정위치에서 특정위치까지의 값을 지정한 개수만큼 삭제
//		replace: 대체해줌
		StringBuffer str2 = new StringBuffer();
		System.out.println("3.str2버퍼크기:" + str2.capacity());
//		Str2 = "asdf";
		str2.append("atom");
		System.out.println("4.str2:" + str2);
		System.out.println("5.str2버퍼크기:" + str2.capacity());
		str2.append("0123456789012345");
		System.out.println("6.str2:" + str2);
		System.out.println("7.str2버퍼크기:" + str2.capacity());
		str2.insert(2, "abcdefg");
		System.out.println("8.str2:" + str2);
		System.out.println("9.str2버퍼크기:" + str2.capacity());
		str2.delete(5, 20);
		System.out.println("10.str2:" + str2);
		System.out.println("11.str2버퍼크기:" + str2.capacity());
		
		
		

		
	}
}
