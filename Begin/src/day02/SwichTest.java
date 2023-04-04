package day02;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class SwichTest {

	public static void main(String[] args) {
		/*
		 * switch(변수|수식){
		 *   case 값1: 실행문; break;
		 *   case 값2: 실행문; break;
		 *   ...
		 *   default: 실행문;
		 * }
		 * 이 때 변수 또는 수식은 int형 이하의 자료형 이거나 String유형만 가능하다.
		 * 
		 * long a =1; [x]
		 * short a =1; [x] // int 형 이하의 자료형만 사용 가능
		 * String a ="1";
		 * swich(a){
		   case "1": System.out.println("One"); break;
		   }
		*/

		/* 월을 입력하세요 (1 ~ 12) 
		   일수를 알려주는 프로그램
		   1,3,5,7,8,10,12 : 31일
		   2  : 28일 or 29일
		   4,6,9,11  : 30일
		*/
		boolean i = true;
		while (i) {
			String month = JOptionPane.showInputDialog("1~12월 사이의 값을 입력하세요");
			if (month == null)
				continue;
			switch (month) {
			case "1":
			case "3":
			case "5":
			case "7":
			case "8":
			case "10":
			case "12":
				System.out.printf("%s월은 31일까지 있습니다",month);
				i =false;
				break;
			case "2":
				System.out.printf("%s월은 28일 or 29일까지 있습니다",month);
				i =false;
				break;
			case "4":
			case "6":
			case "9":
			case "11":
				System.out.printf("%s월은 30일까지 있습니다",month);
				i =false;
				break;
			default:
				System.out.println("1~12월 사이의 값을 입력하세요");
				break;
			}
		}

	}

}
