package day03;

public class DoWhileTest {
	public static void main(String[] args) {
		/* 변수 선언문
		 * do {
			실행문;
			증감식;
		   }while(조건식)
		*/
		int a =5;
		do {System.out.println("Hello" +a);a++;}while(a<10);
		System.out.println("The End~~~");
	}
}
