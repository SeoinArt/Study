package day02;

public class Operator5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("9. 조건 연산자 (삼항 연산자)------------");
		/* 변수 선언문 = (조건식)? 값1: 값2;
		 * 조건식이 true이면 값 1을 변수에 대입하고, false면 값2를 대입한다.
		 */

		int a = 5, b = 6;
		int result = (a > b) ? a : b;
		System.out.println("result: " + result);

		String str = (a < b) ? a + "" : String.valueOf(b);
		System.out.println("str: " + str);

		System.out.println("10. 연산 후 대입 연산자(할당 연산자");
		// +=, -=, *=, /=, %=, >>=, <<=, >>>=, &=, |=, ^=

		int i = 3;
		i += 5; // i=i+5;
		System.out.println("i= " + i); // 8

		i *= 3;
		System.out.println("i= " + i); // 24

		i %= 7;
		System.out.println("i= " + i); // 3

	}
}
