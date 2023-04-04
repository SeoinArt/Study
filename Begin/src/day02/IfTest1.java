package day02;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// System.in : 키보드 입력을 받을 수 있는 입력 장치와 연결된 객체

		System.out.print("정수를 입력하시오 ");
		int num = sc.nextInt(); // 사용자가 입력한 정수값을 반환한다.
		/* 
		 * float = nextFloat()
		 * double = nextDouble()
		 */
		System.out.println("num = " + num);

		// 입력받은 값이 짝수면 "Even", 홀수면 "Odd"를 출력하세요
		System.out.print("결과 = " + ((num % 2 == 0) ? "Even " : "Odd "));
		System.out.println(((num % 2 == 0) ? "(짝수)" : "(홀수)"));

	}

}
