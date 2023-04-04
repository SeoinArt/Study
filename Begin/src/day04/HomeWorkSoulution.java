package day04;

import java.util.Scanner;

public class HomeWorkSoulution {
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

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			HomeWorkSoulution.showMenu();
			int num = sc.nextInt();
			if (num == 9) {
				System.out.println("Bye Bye~~");;
				sc.close();
				//break;
				System.exit(0);
				// 시스템 종료. 정상 종료 : 0 . 에러 발생시 종료 : -1
			}
			// 유효성 체크
			if(num<1||num>3) {
				System.out.println("메뉴에 없는 번호에요. 다시 입력하세요");
				continue;
			}
			System.out.println("수도 요금 계산 예정 ...");
			int use = sc.nextInt();
			
			String str = "";
			int price = 1;
			
			switch(num) {
			case 1:
				price = 50;
				str = "가정용";
				break;
						
			case 2:
				price = 45;
				str = "상업용";
				break;
				
			case 3:
				price = 30;
				str = "공업용";
				break;
			}
			
			int fee =use*price;
			int tax=(int)(fee*0.05);
			str +=" 단가 : "+price +"원";
			System.out.println("------------------------------");
			System.out.println("메뉴번호: "+num + "("+str+")");
			System.out.println("사용량: "+use);
			System.out.println("수도요금: "+fee);
			System.out.println("세금: "+tax);
			System.out.println("총 수도요금: "+(fee+tax));
			System.out.println("------------------------------");
			System.out.println();
		}
	}

}
