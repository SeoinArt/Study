package day02;
/*
 * 변수가 선언된 위치에 따른 변수 유형
 * [1] 멤버 변수 : 초기화하지 않으면 default 값이 할당된다.
 * 	- non-static 변수 : 인스턴스 변수, "객체명.변수" 식으로 접근한다.
 * 	- static 변수 : 클래스 변수, "클래스명.변수" 식으로 접근한다.
  
 * [2] 지역 변수 : 초기화하지 않으면 error 발생
 * 
 * */

public class DataType {
	byte b; // 멤버변수 위치 (member variable)
	static byte c = 9; // 클래스 변수 
	int in; // 인스턴스 변수
	short s; // 0
	char ch; // '\u0000'
	int i; // 0
	long l; // 0l
	static float f; // 0.0f
	double d; // 0.0
	boolean bool; // false
	static String str; // null

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 'k'; // 지역 변수 위치(local variable) : 초기화한 뒤 사용해야 한다.
		DataType dt = new DataType(); // <dt>: 객체명

		System.out.println("DayaType.c : " + DataType.c);
		System.out.println("c : " + c);
		System.out.println("k : " + k);
		System.out.println("dt : " + dt.b);

		System.out.println();
		System.out.println("in : " + dt.in);
		System.out.println("s : " + dt.s);
		System.out.println("ch : " + dt.ch);
		System.out.println("i : " + dt.i);
		System.out.println("l : " + dt.l);
		System.out.println("f : " + DataType.f);
		System.out.println("d : " + dt.d);
		System.out.println("bool : " + dt.bool);
		System.out.println("str : " + DataType.str);

	}

}
