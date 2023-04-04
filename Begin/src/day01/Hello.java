package day01;
// 원시 코드 ==> 컴파일 (Hello.class => 바이트코드) ==> 인터프리터가 해석 실행 => output(.class)
public class Hello
{
    //  [1] 단문 주석
    /*  [2] 복문 주석 */
    /** [3] 문서화 주석 : javadoc를 이용하여 api문서를 만들 때 사용 */
	 public static void main(String[] args){
        System.out.println("Hello world ~~");
        System.out.println("안녕하세요~ 반갑습니다");
    }
}