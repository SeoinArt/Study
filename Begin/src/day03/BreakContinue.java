package day03;

public class BreakContinue {

	public static void main(String[] args) {
		/* 보조제어문: break, continue
		 *  break;   가까운 반복문을 벗어난다
		 *  continue; 가까운 반복문을 계속 수행한다
		 * 	break 레이블명; 레이블명과 가까운 반복문을 벗어난다
		 *  continue 레이블명; 레이블명과 가까운 반복문을 계속 수행한다
		 * */
		System.out.println("1----------------------------");
		for (int i = 0; i < 3; i++) {
			if (i == 1)
				break;
			System.out.println("i :" + i);
			// 0
		}

		System.out.println("2----------------------------");
		for (int i = 0; i < 3; i++) {
			if (i == 1)
				continue;
			System.out.println("i :" + i);
			/* 0 
			 * 2
			*/ }

		System.out.println("3----------------------------");
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				if (k == 1)
					break;
				System.out.println("i : " + i + ", k : " + k);
				/* 0 0 
				 * 1 0 
				 * 2 0
				*/ }
		}
		System.out.println("4----------------------------");
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				if (k == 1)
					continue;
				System.out.println("i : " + i + ", k : " + k);
				/* 0 0 
				 * 0 2 
				 * 1 0 
				 * 1 2  
				 * 2 0 
				 * 2 2
				*/ }
		}

		System.out.println("5----------------------------");
		outer: // label 지정 => 반복문 앞에 붙일 수 있다.
		for (int i = 0; i < 3; i++) {
			inner: 
				for (int k = 0; k < 3; k++) {
				if (k == 1)
					break outer; //
				System.out.println("i : " + i + ", k : " + k);
			}
		}

		System.out.println("6----------------------------");
		outer: // label 지정 => 반복문 앞에 붙일 수 있다.
		for (int i = 0; i < 3; i++) {
			inner: for (int k = 0; k < 3; k++) {
				if (k == 1)
					continue outer; //
				System.out.println("i : " + i + ", k : " + k); // i = 0 1 2 k = 0
			}
		}
	}
}
