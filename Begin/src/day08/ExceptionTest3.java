package day08;

// for 루프 안에서 예외 처리하기
public class ExceptionTest3 {

	public static void main(String[] args) {
		
//		try {
			for (int i = 1; i <= 5; i++) {
				try {
				int a = 50 / (i - 3);
				System.out.printf("a: %d\n", a);
				System.out.println(i);
				// for --
				}catch(ArithmeticException e) {
					
					System.out.println("0으로 나눌 수 없어요 "+i+"-3");
				}
			}
//		} catch (ArithmeticException e) {
//			System.out.println(i);
//			System.out.println("분모가 맛갔습니다");
//		}
	}// main()
}
