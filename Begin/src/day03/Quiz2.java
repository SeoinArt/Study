package day03;

import java.util.*;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력한 값이 숫자가 맞는지 여부 체크해서 아니면 "숫자가 아니에요 다시 입력하세요"
		outer: while (true) {
			int a = 0;
			System.out.println("숫자입력하세요");
			String str = sc.nextLine();// 엔터전까지
			for (int i = 0; i < str.length(); i++) {
				if (!Character.isDigit(str.charAt(i))) {
					System.out.println("숫자가 아니에요 다시입력하세요");
					continue outer;
				}
			}
			a++;
			int num = Integer.valueOf(str, 10);
			System.out.println("num = " + num);
			System.out.println((str + "의 2진수 : " + Integer.toBinaryString(num)));
			System.out.printf("%s의 8진수 : 0%s%n", str, Integer.toOctalString(num));
			System.out.printf("%s의 16진수 : 0%s%n", str, Integer.toHexString(num));
			if (a > 0)
				sc.close();
				break;
			
		}
		// 맞으면 해당숫자의 2진수값을 출력하세요
		// hint) java.lang.Integer클래스의 toBinaryString()메서드를 이용
	}
}
