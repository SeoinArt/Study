package day02;

public class HomeWork_1 {
	public static void main(String[] args) {

		/* 
		 [1]
		 
		 * 논리형 : boolean (1byte) 
		 * 문자형 : char (2byte) 
		 * 정수형 : byte (1byte) short (2byte) int(4byte) long(8byte) 
		 * 실수형 : float(4byte) double(8byte)
		 */
		
		
		/* 
		 [2]
		 
		 * long regNO = 9512231852230;
		 * String regNO = "951223-1852230";
		*/
		long regNO = 9512231852230l;
		System.out.println(regNO);
		
		
		/*
		 [3]
		 
		 * 리터널 : 100, 100ㅣ, 3.14f
		 * 변수 : i, l
		 * 상수 : PI
		 * 키워드 : int , long, final, float
		*/
		 
		
		/* 
		 [4] 다음 중 기본형이 아닌 것은?
		 
		 * b. Byte
		*/
		 
		
//		/*
//		 [5]. 다음 문장들의 출력 결과를 적으세요
//		 
		 System.out.println("1" + "2"); // 12
		 System.out.println(true + ""); // ture
		 System.out.println('A'+'B'); // 65+66 = 131
		 System.out.println('1'+'2'); // 49+50 = 99
		 System.out.println('J'+"ava"); // Java
//		 System.out.println(true+null);
		 
		
		
		/*
		 [6] 다음 중 키워드가 아닌 것은?
		 
		 * True, NULL, Class, System
		*/
		
		
		/*
		 [7] 다음 중 변수의 이름으로 사용할 수 있는 것은?
		 
		 * $ystem
		 * If
		 * 자바
		 * $MAX_NUM
		*/
		  
		
		/*
		 [8] 참조형 변수와 같은 크기의 기본형은? // 참조형은 4Byte
		 
		 * int, float
		*/
		
		
		/*
		 [9] 다음 중 형변환을 생략할 수 있는 것은?
		 
		 byte b = 10;
		 char ch = 'A';
		 int i = 100;
		 long l = 1000:;
		 
		 * b = (byte)i; // 생략 x
		 * ch = (char)b // 생략 x byte = 음수 포함, char = 양수만
		 * short s = (short)ch // 생략 x
		 * float f = (float)l  
		 * i = (int)ch
		 */
		
		
		/*
		 [10] char 타입의 변수에 저장될 수 있는 범위 0~65535
		 
		 2 byte 
		 1byte = 8bit = 2^8 (경우의 수)
		 	  
 		 
  		*/
		 
		
		/*
		 [11] 다음 중 변수를 잘못 초기화한 것은?
		 
		 * byte b = 256 // -128~127
		 * char c = '' // ' ' 은 되지만 ''은 안된다.
		 * char answor = 'no' // char 은 문자 1개만 가능
		 * floar f = 3.14 // 3.14f
		 * double d = 1.4e3f // 가능하다 
		*/
		
		/*
		 [12] 다음 중 main method 선언으로 옳은 것은?
		 
		 * public static void main(String[] args)
		 * public static void main(String args[])
		 * public static void main(String[] arv)
		 * public void static main(String[] arv) // x
		 * static public void main(String[] arv) 
		*/
		
		 
		 
		/*
		 [13] 다음 중 타입과 기본값이 잘못 연결된 것은
		 
		  * boolean - false
		  * char = '\u0000'
		  * float - 0.0f
		  * int - 0
		  * long - 0l
		  * String = null
		 */
	}
}
