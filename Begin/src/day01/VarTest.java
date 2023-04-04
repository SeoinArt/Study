package day01;
public class VarTest {
    int global = 100; // 인스턴스 변수 
    static int global2 = 200; // 클래스 변수 (전역 변수)
    public static void main(String[] args){
        // 변수(variable, field, property)
        // 변수 선언 : 자료형 변수형;

        int num1; // 변수 선언
        
        num1 = 10; // 변수 초기화
        
        int num2 = 8; //선언과 동시에 초기화 
        // num1 과 num2 는 지역변수
        System.out.printf("num 1 = %d, num2 = %d\n",num1,num2);

        // global2를 출력하세요.
        System.out.printf("global2 = %d\n", global2);
        System.out.printf("VarTest.global2 = %d\n", VarTest.global2);

        // 정수형 변수 a, b 2개를 선언하고 각자 값을 할당한 뒤에 printf() method를 사용하여 덧셈식과 곱셈식을 각각 출력하세요

        int a=13, b=5;
        System.out.printf("a + b = %d, a - b = %d, a * b = %d, a / b = %d", a+b, a-b, a*b, a/b);
    }
    
}
