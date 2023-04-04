package day04;

public class OurDemo {
	
	int a = 1; // instance 변수
	int b;
	static int c; // class 변수 (static 블럭에서 초기화)
	static int d;
	
	static {
		/* static initializer : main 메서드보다도 먼저 메모리에 올라간다.
		 * static 변수 초기;화는 여기서 한다.
		 * */
		d =4;
		System.out.println("static bolck");
	}

	
	public OurDemo() {
		b = 2;
	}
	
	public static void main(String[] args) {
		System.out.println("main()");
		System.out.println(OurDemo.d);

	}

}
