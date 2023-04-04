package day02;

public class ForTest1 {

	public static void main(String[] args) {

		/*
		 * for(변수 선언 및 초기화; 조건식; 증감식){
		 * 		실행문;
		 * }
		 * */
		for (int i = 0; i < 4; i++) {
			System.out.println("Hello" + i);
		}

		int j = 5;
		
		for (; j > 0; j -= 2) {
			System.out.println("Java" + j);
		}
		// j의 scope는? main() method 블럭이 끝날 때까지 살아있다.
		System.out.println("j:" + j);

		/*[1] 
		   1~100까지 정수를 다음과 같은 식으로 계산한 수식과 결과값을 출력하세요
		   1 + (-2) + 3+(-4)+5 +(-6) ....+(-100) = 결과값
		  
		*/

		/*	int res = 0;
			for(int i = 1; i < 101; i++){
			    if(i%2==0) res += -1*i;
			    else res += i;
			}
			System.out.println("res : "+res);
		*/
		int sum = 0;
		int d = 1;
		for (int i1 = 1; i1 < 101; i1++, d = -d) {
			sum += i1 * d;
			if (i1 < 100) {
				System.out.print(i1 * d + "+");
			} else
				System.out.print(i1 * d + "=");
		}
		System.out.println(sum);

		// [2] 알파벳 대문자A,B...Z 를 for루프 이용해 출력하기

		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a + " ");
		}

		// [3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
		// 의 총 합계값을 출력하세요
		int sum3 = 0;
		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b < a; b++) {
				sum3 += b;
			}
		}
		System.out.printf("\nsum = %d \n", sum3);
		
		
		sum = 0;
		int total =0;
		for (int i1=1; i1<11; i1++) {
			sum+=i1;
			total +=sum;
			System.out.print(total+" ");
		}
	}
	

}
