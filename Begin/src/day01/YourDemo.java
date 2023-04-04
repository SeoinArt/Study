package day01;
// import java.lang.*;
import java.util.Date;
import java.util.*;

/*  [1] 패키지 선언문 : package 패키지 명;  ex) package my.com;
    [2] import 문 : import 패키지 명, 클래스 명;
*/

public class YourDemo {
    public static void main(String[] args){
        System.out.println("---- YourDemo----");
        Date d = new Date();
        System.out.println(d);
        UUID uid = UUID.randomUUID();
        System.out.println(uid);

        // System.out.printf("출력 서식", 출력할 내용);
    /* 출력 서식 %지시자
        * %d : 정수형식으로 출력
        * %f : 소수점 형식으로 출력
        * %s : 문자열 형식으로 출력
        * %b : boolean형식으로 출력
        * %n : 줄바꿈
	*/
    System.out.printf("제 이름은 %s이고, 제 나이는 %d 입니다.\n", "박서인",27);
    System.out.printf("제 평균 성적은 %.2f입니다\n",4.4);

    double avg = 95.33333;
    double avg2 =Math.round(avg*100)/100.0;
    System.out.println(avg2);

    System.out.printf("평균성적 : %.2f\n", (double)95.3333333333333333333333333333333333333333333333333);
    System.out.printf("%d\n",1);

    // 오른쪽 정렬
    System.out.printf("%5d\n",1); // 5자리를 차지하고 1을 출력
    System.out.printf("%5d\n",10); // 5자리를 차지하고 10을 출력
    System.out.printf("%5d\n",100); // 5자리를 차지하고 100을 출력
    // 왼쪽 정렬
    System.out.printf("%-5d\n",1); // 5자리를 차지하고 1을 출력
    System.out.printf("%-5d\n",10); // 5자리를 차지하고 10을 출력
    System.out.printf("%-5d\n",100); // 5자리를 차지하고 100을 출력

    System.out.printf("%05d\n",1); // 5자리를 차지하고 1을 출력
    System.out.printf("%05d\n",10); // 5자리를 차지하고 10을 출력
    System.out.printf("%05d\n",100); // 5자리를 차지하고 100을 출력
    }
}
