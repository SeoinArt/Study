package day01;

public class Demo {
	// Deom.java(파일명) ==  클래스명이 같아야 함 (대소문자)
    // main() method : Program의 시작점을 알림
    public static void main(String[] args){
        System.out.println("Hi Java");
        System.out.println("안녕 자바");
        System.out.print("반갑습니다");
        System.out.println("저는 백엔드 개발자 과정의\n 홍길동입니다.");
        /* 
            escape 문자 
            \n : 개행문자 (줄바꿈)
            \t : 탭 키만큼 띄어쓰기
            \" : 쌍따옴표 출력
            \' : 홀따옴표 출력
            \\ : 역슬래시 출력
            \r : 캐리지 리턴 (커서를 맨 앞으로 이동)
            
        */

        System.out.println("--------------------");
        System.out.println("국어\t영어\t수학");
        System.out.println("--------------------");
        System.out.println("99\t88\t75");
        System.out.println("--------------------");
         
        //김소월 님의 '진달래 꽃'
        
        System.out.println("김소월 님의 \'진달래 꽃\'");
        System.out.println("\"나보기가 역겨워 가실 떄에는 말없이 고이 보내 드리오리다\"");
        System.out.println("역슬래시 (\\)");
        System.out.println("Hello World\rA");
        // Hello World 출력 후 커서가 index 0 으로 이동하고, A를 출력한다 => Aello World
    }
    
}
/*
 Deom.java(원시코드
 [1] 컴파일 (문법 체크) : c:\myjava>javac Demo.java -encoding UTF-8
    => Demo.class (Byte Code) : JVM이 이해할 수 있는 코드
 [2] 실행 (인터프리터) : java Demo 
    => Output
 */
