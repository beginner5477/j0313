package API5_Wrapper;

public class Test2 {
	public static void main(String[] args) {
		//객체에 정수값 대입하면 1Byte의 저장범위인 -128 ~ 127범위인 값만 해당 번지에 저장시키기에
		//"=="으로 비교하면 같은값으로 봄.
		//결론: 객체 비교시에는 equals로 비교하는게 좋아요.
		Integer objInt1 = 300;
		Integer objInt2 = 300;
		System.out.println("==: " +(objInt1 == objInt2));
		System.out.println("equals: " +objInt1.equals(objInt2));
		
		Integer objInt3 = 10;
		Integer objInt4 = 10;
		System.out.println("equals: " +objInt3.equals(objInt4));
	}
}
