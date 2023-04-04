package day02;

public class Operator3 {
	public static void main(String[] args) {
	
		System.out.println("다항 연산자 -----------");
		System.out.println("5. 산술 연산자(+, -, *, /, %");
		int x = 10;
		int y = 3;

		System.out.printf("%d + %d = %d\n", x, y, (x + y));
		System.out.printf("%d - %d = %d\n", x, y, (x - y));
		System.out.printf("%d * %d = %d\n", x, y, (x * y));
		System.out.printf("%d / %d = %d\n", x, y, (x / y));
		System.out.printf("%d mod %d = %d\n", x, y, (x % y));
		System.out.println(2 / 3);
		
		
		
		/*Shift연산자
		1) << : 왼쪽으로 비트수만큼 이동.
				오른쪽에 남은 빈칸은 0으로 채움
		2) >> : 오른쪽으로 비트수만큼 이동.
				앞에 남은 빈칸은 부호비트로 채움
		3) >>>: 오른쪽으로 비트수만큼 이동.
				앞에 남은 빈칸은 무조건 0으로 채움		
		*/
		System.out.println("6. Shift 연산자 (<<, >>, >>>)"); 
		//양수 : 23 = 00000000 00000000 00000000 00010111
		System.out.println(23<<3); // 0 - 10111000 = 128+32+16+8 = 184 
		System.out.println(23>>3); // 0 - 00000010 = 2
		System.out.println(23>>>3); // 0 - 00000010 = 2
		
		// 음수 : -23 = 11111111 11111111 11111111 11101001
		/* 음수 : 2의 보수
		   1의 보수 + 1 = 2의 보수
		   양수값을 비트로 바꾼 뒤 1의 보수를 구한다 => +1 을 수행한다
		*/
		System.out.println(-23<<3); // 11111111 11111111 11111111 01001000 ==  -23 * 2^3 = -184 
		System.out.println(-23>>3); // 11111111 11111111 11111111 11111101 == -3 
		System.out.println(-23>>>3); // 00011111 11111111 11111111 11111101 == 536870909
		
		/*	음수값을 비트로 표현하는 방법의 팁
		 	양수값을 먼저 비트로 표현한다. 그런 뒤 하위에서 첫번째 1을 만날때까지는 
		    양수의 비트와 동일하게 작성하고, 첫번째 1을 만난뒤부터는 비트 반전을 한다
	    */
		
		// 8 = 00000000 0000000 00000000 00001000
		// -8 : 11111111 11111111 11111111 11111000
		
		System.out.println(-23<<3);
		System.out.println(-23>>3);
		System.out.println(-23>>>3);
		
		System.out.println("7. 비트 연산자 (&, | , ^");
		// 정수값에만 사용되는 연산자 : 정수를 비트로 바꾸어 연산을 한다.
//		int a = 3;
//		int b = 5;
//		System.out.printf("%d & %d = %d\n",a,b,a&b);
//		System.out.printf("%d | %d = %d\n",a,b,a|b);
//		System.out.printf("%d ^ %d = %d\n",a,b,a^b);
	}	
}
