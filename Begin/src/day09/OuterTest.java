package day09;

public class OuterTest {
	public static void main(String[] args) {
//		[1] Outer 클래스의 변수 a,b 값을 출력하세요
		Outer ot = new Outer();
		System.out.println(ot.a);
		System.out.println(Outer.b);
		
//		[2] Outer.Inner 클래스의 변수 c,sub() 값을 출력하세요
		Outer.Inner oi = new Outer().new Inner();
		/// Outer.Inner oi = ot.new Inner();
		System.out.println(oi.c);
		oi.sub();
		
		Outer.SInner os = new Outer.SInner();
		System.out.println(os.d);
		System.out.println(Outer.SInner.e);
		os.foo();
		Outer.SInner.bar();
		
		ot.test();
		
	}

}
