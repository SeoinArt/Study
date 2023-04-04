package day03;

public class MathTest {

	public static void main(String[] args) {
	/*java.lang.Math클래스의 주요 메서드
	 * 
	 *   static final double	PI :원주율 (상수)  "클래스명.변수"
	 *   
	 *   static int	abs(int a): 절대값을 반환
	 *   static double	floor(double a): 내림값을 반환
	 *   static double	ceil(double a): 올림값을 반환
	 *   
	 *   //round() : 반올림
		 * static long	round(double a)
		 * static int	round(float a)
		 * 
	 * 	 //random() : 0.0<= r <1.0 사이의 임의의 실수를 발생시켜 반환한다
	 * 		static double	random()
	 * */
		
		System.out.println(Math.PI);
		
		// -153의 절대값을 구하세요
		System.out.println(Math.abs(-153));
		
		//12.456의 반올림값을 구해 출력하세요
		System.out.println("--------------------------------------------");
		double num = 12.456;
		System.out.println(Math.round(12.456)); // 12
		System.out.println(Math.round(12.567f)); // 13
		double k =Math.round(num*100)/100.0;
		System.out.println(k);
		System.out.println("--------------------------------------------");
		// 103.0001의 올림값과 내림값을 각각 출력하세요
		System.out.printf("올림값 : %f\n내림 값 : %f\n",Math.ceil(103.0001),Math.floor(103.0001));
		System.out.printf("올림값 : %d\n내림 값 : %d\n",(int)Math.ceil(103.0001),(int)Math.floor(103.0001));
		
		for (int i =0; i<3; i++) {
			double r = Math.random();
			System.out.println("r : "+r);
		}
		
//		[문제1] 0<= v2 <10 사이의 임의의 정수를 발생시키세요.		
		System.out.println((int)(Math.random()*10));				
		
//		[문제2] 5<= v3 <15 사이의 임의의 정수를 발생시키세요.
		System.out.println((int)(Math.random()*10+5));	
		
			
		
		
		System.out.println();
		//[1] 75<= r2 <123 사이의 임의의 정수를 출력하세요
		System.out.println((int)(Math.random()*48+75));
		
		//[2] 랜덤한 알파벳 대문자 한자를 출력하세요
		System.out.println((char)(Math.random()*26+65));
				
		//[3] 아래와 같은 형태로 랜덤한 알파벳을 출력하세요
				/*		E W Q R P
						U I Z W X
						M O G H A

						중첩 반복문 활용
				 * */
		for (int i=0; i<3; i++) {
			for (int j =0; j<5; j++) {
				System.out.print(((char)(Math.random()*26+65)+" "));
			}
			System.out.println();
		}
	}

}
