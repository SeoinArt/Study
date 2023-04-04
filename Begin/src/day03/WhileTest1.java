package day03;

public class WhileTest1 {

	public static void main(String[] args) {
		/*변수 선언 및 초기화
			while(조건식) {
				실행문;
				증감식;
			}
		*/
		
		int i = 1;
		while(i<5) {
			System.out.println("Hello"+ i);
			i++;
		}
		System.out.println();
		
		// 감소식 Java 7 4 1
		i = 7;
		while (i>0) {
			System.out.printf("Java%d\n",i);
			i-=3;
		}
		System.out.println("The end~~");

		
/*		while(true) {
			System.out.println("무한루프 돕니다@@@");
		}
		
		for(;;){
		System.out.println("무한루프 돕니다###");
		}
*/		
		
	}
}

