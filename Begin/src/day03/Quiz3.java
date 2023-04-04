package day03;

import java.util.*;

public class Quiz3 {
	public static void main(String[] args) {
		Quiz3.startGame();

	}

	public static void startGame() {
		Scanner sc = new Scanner(System.in);

		// 컴퓨터가 랜덤한 정수값을 1<= r <=100 사이의 임의의 정수를 발생시킨다.
		// 이 값을 맞추는 게임
		// 단 게임시도횟수가 7번을 초과하면 "실패!!" 게임 종료
		int com = (int) (Math.random() * 100 + 1);
		int cnt = 1;
		System.out.println("1~100사이의 정수를 입력하시오");
		while (cnt < 8) {
			int user = sc.nextInt();
			if (com == user) {
				System.out.println("정답입니다. ^^ 시도 횟수 " + cnt);
				return;
			} else if (com > user)
				System.out.println("보다 큰 값입니다.. ^^ 시도 횟수 " + cnt);
			else if (com < user)
				System.out.println("보다 작은 값입니다.. ^^ 시도 횟수 " + cnt);
			cnt++;
		}
		System.out.println("Game Over!! 시도 횟수 초과했어요 ");
		sc.close();

	}

	public static void startGame1() {
		int com = (int) (Math.random() * 100 + 1);
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 9; i++) {
			if (i < 8) {
				System.out.printf("%d번째 시도입니다. \n1~100 사이의 정수를 입력하세요\n", i);
				int user = sc.nextInt();
				if (user <= 0 || user >= 101) {
					System.out.println("실패!!\n");
					return;
				}

				if (user > com)
					System.out.println("보다 작은 값입니다.\n");
				else if (user < com)
					System.out.println("보다 큰 값입니다\n");
				else {
					System.out.printf("정답입니다 computer : %d\n", com);
					break;
				}
			} else
				System.out.println("실패!!\n");
			sc.close();
		}
		
	}
}
