package day02;

public class Operator2 {

	public static void main(String[] args) {
		System.out.println("논리부정 연산자(!)--------------"); 
/*
		 논리식, 논리값에만 사용한다. 
		 true => false, false => true
*/		
		boolean b1 = false;
		print("b1 = "+b1);
		print("!b1 = " + (!b1));
		print("!(2<4) = "+ !(2<4));
		
/*		= : 대입 연산자 
		== : 비교 연산자
		=== : 자바에는 없음 [x]
		
		[1] 비교 연산자(==)
			- 기본 자료형 : 값이 같은지를 비교한다.
			- 참조형 : 주소값이 같은지를 비교한다.
			
		[2] !=
			- 기본 자료형 : 값이 다른가? 다르면 ture, 같으면 false
			- 참조형 : 주소값이 다른가?
*/
		int x = 5;
		float y = 5.1f;
		print("x==y = "+(x==y)); // 값을 비교
		print("x!=y = "+(x!=y));
		System.out.println();
		
		String s1 = "Hello"; // literal pool
		String s2 = new String("Hello"); // heap 
		
		print("s1==s2 = "+ (s1 == s2)); // 주소값을 비교한다
		print("s1!=s2 = "+ (s1 != s2));
		
		

		String[] str = new String[5];
		
		
		str[0] = s1;
/*		String
		  public boolean equals(object o)
		  문자열 내용이 같으면 true를 반환하고, 내용이 다르면 false를 반환한다.
*/
		boolean bool = s1.equals(s2);
		print("s1.squals(s2) = "+ bool); // 문자열 내용 비교
		
	}
	
	
	
	
	public static void print(String str) {
		System.out.println(str);
	}
}
