package day02;

public class ForTest2 {

	public static void main(String[] args) {
		// 중첩 for루프를 이용해서 아래와 같이 출력하세요

		/*[1]
		 *   *****
		 *   *****
		 *   *****
		 *   *****
		 *   
		 *   4행5열
		 * 
		 *
		*/
		System.out.println("[1]");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/* [2]
		 * 
		 *  *
		 *  **
		 *  ***
		 *  ****
		 * 
	    */
		System.out.println("[2]");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/*[3]
		 * 
		 *    *
		 *   **
		 *  ***
		 * ****     
		*/
		
		System.out.println("[3]");
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j < 4; j++) {
				System.out.print((i>j)? ' ': '*');
			}
			System.out.println();
		}
		System.out.println();

		/* [4]
		 *    *
		 *   ***
		 *  *****  
		*/

		// [4]-2 => [4]-1 패턴 분석
		System.out.println("[4]-2");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j > i + 2 || j + i < 2)? ' ': '*');
			}
			System.out.println();
		}
		System.out.println();
		// i = 0 => 0 1 3 4 j = 2
		// i = 1 -> 0 4 j= 1 2 3
		// i = 2 -> j = 0 1 2 3 4

		/* [5]
		 * 
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  ***
		 *  **
		 *  *
		*/
		/*		 
		 i = 4  j = 0 1 2
		 i = 5  j = 0 1
		 i = 6  j = 0
		*/
		System.out.println("[5]");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((i <= 3 && i >= j)? '*':(i > 3 && i + j <= 6)? "*":' ' );				
			}
			System.out.println();
		}
	}
}
