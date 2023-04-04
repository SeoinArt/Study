package day03;

public class HomeWorkSolution {

	public static void main(String[] args) {

// [1]
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 6; i++) {
				System.out.printf("%c", '*');
			}
			System.out.println();
		}
		System.out.println();
// [3]

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i + j < 3)
					System.out.print(' ');
				else
					System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();

// [4] 
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j > i + 2 || j + i < 2) ? ' ' : '*');
			}
			System.out.println();
		}
		System.out.println();

// [4] - (sol)
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i + j >= 2) && (j - i <= 2))
					System.out.print('*');
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		/* [5] - sol
					i	1	1
						2	2
						3	3
						4	4
						5	3
						6	2
						7	1
		*/
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		for (int i = 0; i < 7; i++) {
			int star = (i <= num / 2 + 1) ? i : (num + 1 - i);
			for (int j = 1; j <= star; j++) {
				System.out.println("*");
			}
			System.out.println();

		}
		sc.close();

	}
}
