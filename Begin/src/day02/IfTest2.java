package day02;

import java.util.*;

public class IfTest2 {
	// main() method : JVM이 호출
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("2자리의 정수를 입력하세요 => ");
		int num = sc.nextInt();

		/* 2자리 정수를 입력받으세요 ==> 
		            "OK 10의 자리와 1의 자리가 같아요"
		            "No 10의 자리와 1의 자리가 달라요"
		*/

		while (num < 10 || num > 100) {
			System.out.println("2자리 정수를 입력해야 해요");
			num = sc.nextInt();
		}

		/*
		if (num<10 || num>100) {
			System.out.println("2자리 정수를 입력해야 해요");
			return; 
			// return문을 가지고 있는 메서드를 호출한 쪽으로 되돌아간다.
		}
		*/

		// [1]
		if ((num / 10 == num % 10))
			System.out.println("OK 10의 자리와 1의 자리가 같아요");
		else
			System.out.println("No 10의 자리와 1의 자리가 달라요");

		// [2]
		System.out.println((num / 10 == num % 10) ? "OK 10의 자리와 1의 자리가 같아요" : "No 10의 자리와 1의 자리가 달라요");
		// num% 11 == 0

		// [3]

	}

}
