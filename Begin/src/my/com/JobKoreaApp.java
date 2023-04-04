package my.com;

import java.util.*;

// 기본적이 application의 기능 : CRUD create read update delete
public class JobKoreaApp {
	
	static JobKoreaApp ap = new JobKoreaApp();;
	JobSeeker[] arr = new JobSeeker[3];
	Company[] avv = new Company[3];
	
	int k,k_1;
	Scanner sc = new Scanner(System.in);
	

	/* 구직자 정보를 입력받아 배열에 저장하는 메서드 */
	/* 회사 정보를 입력받아 배열에 저장하는 메서드 */
	public void registerA(int i) {
		if (i == 1) {
			JobSeeker js1 = new JobSeeker();
			js1.input();

			System.out.println(js1.introduce());
			System.out.println(">>위 정보를 등록할까요?[1. yes 2. no]");

			int no = sc.nextInt();
			if (no == 1 && k < arr.length) {
				arr[k++] = js1;
				System.out.println("등록 완료!! 현재 등록 인원: " + k + "명\n");
			} 
			else if (no == 1 && k >= arr.length ) {
				System.out.println("구직자 버퍼가 가득 찼습니다.");
				System.out.println("마지막을 덮어씁니다..");
			  	arr[--k] = js1;
			  	k++;
			  	System.out.println("등록 완료!! 현재 등록 인원: " + arr.length + "명\n");
			}
			else
				System.out.println("등록을 취소하였습니다.\n");
		}

		else {
			Company cm = new Company();
			cm.input();
			System.out.println(cm.introduce());
			System.out.println(">>위 정보를 등록할까요?[1. yes 2. no]");
			int no = sc.nextInt();
			if (no == 1 && k_1 <arr.length) {
				avv[k_1++] = cm;
				System.out.println("등록 완료!! 현재 등록 인원: " + k_1 + "명\n");
			} 
			else if (no == 1 && k_1 >= avv.length) {
				System.out.println("회사 버퍼가 가득 찼습니다.");
				System.out.println("마지막을 덮어씁니다..");
				avv[--k_1] = cm;
				k_1++;
			  	System.out.println("등록 완료!! 현재 등록 인원: " + avv.length + "명\n");
			}
			else
				System.out.println("등록을 취소하였습니다.\n");
		}
	}

	// 등록된 모든 구직자 정보를 배열에서 꺼내서 추출하는 메서드
	// 등록된 모든 회사 정보를 배열에서 꺼내서 추출하는 메서드
	public void printA(int i) {
		switch (i) {
		case 1:
			for (int i1 = 0; i1 < k; i1++) {
				System.out.println(arr[i1].introduce());
				System.out.println();
			}
			break;
		case 2:
			for (int i2 = 0; i2 < k_1; i2++) {
				System.out.println(avv[i2].introduce());
				System.out.println();
			}
			break;
		}

	}

	public void menu() {
		System.out.println("---JobKoreaApp v1.1------");
		System.out.println("1. 구직자 등록");
		System.out.println("2. 회 사 등록");
		System.out.println("3. 구직자 정보 출력");
		System.out.println("4. 회사 정보 출력");
		System.out.println("9. 종      료");
		System.out.println("-------------------------");
		System.out.print("메뉴 번호를 클릭하세요 => ");
		System.out.println();
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		// 반복문 돌면서 menu 보여주고 입력받기

		for (;;) {
			ap.menu();
			int num = ap.sc.nextInt();

			if (num == 9) {
				System.out.println("Bye Bye");
				System.exit(0);
			} else if (num < 1 || num > 4) {
				System.out.println("메뉴에 없는 번호에요. 다시 입력하세요\n");
				continue;
			}
			switch (num) {
			case 1: // 구직자 등록
				ap.registerA(1);
				break;
			case 2: // 회사 등록
				ap.registerA(2);
				break;
			case 3: // 등록한 모든 구직자 정보 출력
				ap.printA(1);
				break;
			case 4: // 모든 회사 정보 출력
				ap.printA(2);
				break;

			}
		}
	}
}
