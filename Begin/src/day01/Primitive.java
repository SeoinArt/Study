package day01;

public class Primitive {

// main()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 문자형(char) ------------");
		/*
		 * character(문자형) : char = 1byte = 16bit = 0~2^16-4
		 */
// Java는 유니코드 체계를 사용한다 : 모든 국가의 언어를 표현할 수 있다.

		char ch1 = '가';
//		char ch2 = '가나다'; [x]
		String str = "가나다";
		char ch2 = 'w';
		char a = 'a';
		System.out.println((int)(a));

		print("ch1 = " + ch1);
		print("ch2 = " + ch2);
		print("str : "+ str);
		char ch3 = '\uff57'; // w
		print("ch3 = " + ch3);

		char c = 'A'; // 아스키 코드 : A(65), B(66)
		print("c+1 = " + (c + 1)); // 66, char + int => 큰 자료 유형으로 promotion

// 66 을 문자로 출력하려면?
/*
		  ====> 자동 형변환 (promotion) 
byte < short, char < int < long < float < double 강제
		  형변환 (casting) <========
*/
		
		int n = c + 1;
		print("n= " + n);



/*
강제 형변환(casting) = 큰 자료유형에서 작은 자료 유형으로 변환하고자 할 때 사용한다. = 형변환 연산자 ()를 사용해야 한다.
		  			 = 자료형 변수 = (자료형) 큰 값
*/
		char c2 = (char) n;
		print("c2: "+c2);

		byte b1 =10;
		byte b2 =20;
//		byte b3 = (byte)b1+b2;  int 보다 작은 유형의 데이터가 연산에 사용될 경우 자동으로 int 유형으로 형변환된다. 
		int b3 = b1+b2;
		print("b3 = "+b3);
		
		char d1 = 'G';
		char d2 = 'P';
		char d3 = 'X';
		System.out.println((d1+d2+d3)); //GPX == 239 
		// char + char => int
		
		byte b4 = (byte)(b1 + b2);
		print("b4="+b4);
		
		print("4. 논리형(boolean)--------");
		boolean bool1 =true;
		boolean bool2 =false;
		boolean bool3 = 7>3;
		print("bool1 = "+bool1);
		print("bool2 = "+bool2);
		print("bool3 = "+bool3);
		

		
	}

	public static void print(String str) {
		System.out.println(str);
	}
}
