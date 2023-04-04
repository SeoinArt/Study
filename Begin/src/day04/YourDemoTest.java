package day04;
/* static 메서드 안에서 접근 가능한 변수
	static [0]
	instance [x] => 객체를 먼저 생상해서 접근
	

*/
public class YourDemoTest {
	boolean z =true;
	static boolean r =false;
	public static void main(String[] args) {
		
		
		YourDemo d1 = new YourDemo();
		System.out.printf("%s, %f\n",d1.str,d1.pi);
		
		System.out.println(YourDemo.CMD);
		
		System.out.println(d1.CMD);
		
		YourDemoTest t1 = new YourDemoTest();
		// r 값 출력하기
		System.out.println(t1.z);
		// z 값 출력하기
		System.out.println(YourDemoTest.r);
	}	
}
