package day03;

import java.util.*;

public class Quiz4 {

	public static void showMenu() {
		String str = "----- 수도 요금 계산기 v1.1 -------\n";
		str += "1. 가정용 (liter 당 50원)\n";
		str += "2. 상업용 (liter 당 45원)\n";
		str += "3. 공업용 (liter 당 30원)\n";
		str += "9. 종               료\n";
		str += "------------------------------\n";
		str += ">>메뉴 번호를 입력하세요 =>";
		System.out.println(str);
	}

	public static int[] calc(int i, int j) {
		int a[] = new int[4];
		switch (i) {
		case 1: {
			a[0] = i * j * 50;
			a[1] = (int) (a[0] * 0.05);
			a[2] = a[0] + a[1];
			break;
		}
		case 2: {
			a[0] = i * j * 45;
			a[1] = (int) (a[0] * 0.05);
			a[2] = a[0] + a[1];
			break;

		}
		case 3: {
			a[0] = i * j * 30;
			a[1] = (int) (a[0] * 0.05);
			a[2] = a[0] + a[1];
			break;
		}
		default: System.out.println("잘못된 메뉴 번호입니다.");
		}
		return a;
	}

	public static void main(String[] args) {

		// 무한반복 돌면서 수도요금을 계산하는 프로그램을 구성하세요
		// switch ~case문 활용해서 수도요금 계산하기
		// output
		// 1. 선택한 메뉴번호
		// 2. 사용한 수도량
		// 3. 수도요금
		// 4. 세 금 (수도요금의 5%)
		// 5. 총수도요금(수도요금+세금)

		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {
			int use = 0;
			int a[];
			String name ="";
			Quiz4.showMenu();
			num = sc.nextInt();
			if (num > 0 && num < 4) {
				System.out.println("사용량을 입력하세요 =>");
				use = sc.nextInt();
				a=Quiz4.calc(num, use);
				switch(num) {
				case 1: name ="가정용"; break;
				case 2: name ="상업용"; break;
				case 3: name ="공업용"; break;
				}
				System.out.println("메뉴번호 : "+num+" ("+name+")");
				System.out.println("사 용 량: "+use +" liter");
				System.out.println("수도요금 : "+a[0]+"원");
				System.out.println("세  금 : "+a[1]+"원");
				System.out.println("총수도요금: "+a[2]+"원");
				System.out.println( "------------------------------\n"); 
			}
			
			else if( num !=9) {
				System.out.println( "다시 입력하세요\n");
				continue;
			}
		} while (num != 9);
		System.out.println( "----------종료----------\n");
		sc.close();
	}
}
