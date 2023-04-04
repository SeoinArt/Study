package day02;

import java.util.*;

public class Iftest {

	public static void main(String[] args) {
		/*[2]
		가격과 나이를 입력받아 20세 미만이면 10%를 할인하여 가격을 알려주세요
		
		price=10000
		age=18
		가격은 9000원 입니다
		*/
		
		Scanner sc = new Scanner(System.in);

//		System.out.print("가격을 입력하세요 = ");
//		int price = sc.nextInt();
//		System.out.print("나이를 입력하세요 = ");
//		int age = sc.nextInt();
//		if(age<20) {
//			System.out.printf("가격은 %d원 입니다",(int)(price*0.9));
//		}
//		else System.out.printf("가격은 %d원 입니다",price);
//		System.out.println();
		
		
		/*[3]
		 * 0~9999 사이의 정수를 입력받아서 입력받은 정수가 몇 자리인지 알려주세요.
			 15 --->2  
			 123--->3  
			 7777-->4
		 * */
		
		int num;
		while(true) {
			System.out.print("0~9999 사이의 정수를 입력받아서 입력받은 정수가 몇 자리인지 알려주세요 --> ");
			num = sc.nextInt();
			if (num>=0 && num<10000) break;
		}
		int i = 1;	
		for(i=1; i<4; i++) {
			num/=10;
			if(num == 0) break;
		}
		System.out.println(" 입력받은 정수는 " + i + "자리입니다.");
		
/*		int n = sc.nextInt();
		System.out.println(num+"->"+String.valueOf(n).length());*/

		/*		while(true) {
		num/=10;
		if(num == 0) break;
		else i++;
*/
	}
}
