package day03;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);

//		String s1 = String.valueOf(sc.next());
//		
//		int num1 = 0;
//		for (int i = s1.length() - 1; i >= 0; i--) {
//			System.out.printf("%c  ", s1.charAt(i));
//			num1 += Character.getNumericValue(s1.charAt(i));
//		}
//		System.out.printf("\nnum = %d", num1);

		// 입력받은 값을 뒤집어서 출력하세요 그리고 각각의 숫자값들의 합계를 구해 출력하세요 123456789
		
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
			int n = num % 10;
			System.out.println(n+ " ");
			num/=10;
			sum+=n;
		}
		//while ------ 
		System.out.println("\nsum " +sum);
		System.out.println("***************************** ");
		sc.close();

	}

}
