package day02;
import javax.swing.JOptionPane;
public class IfTest4 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("0~9, 또는 알파벳 또는 기타 문자 1개를 입력하세요");
		// let str = prompt("0~9, 또는 알파벳 또는 기타 문자 1개를 입력하세요");
		// System.out.println("str : "+str);
		
		//public char charAt(int index) : 특정 index 위치의 문자를 1개 추출하여 반환하는 method
		// "Hello" 0 1 2 3 4 
		
		// System.out.println("Hello".charAt(1));
		
		//입력한 값의 첫 번째 문자 1개 0 ~ 9 사이의 값이면 숫자입니다.
		// "A~Z" or "a-z" 이면 알파벳입니다"
		// 그 외 문자이면 " 기타문자입니다.
		
		char i = str.charAt(0);  
		if ((i-'0'>=0)&&(i-'0'<10)) System.out.println("숫자입니다");
		else if((i>='a' && i <='z')|| (i>=65 && i<=90)) System.out.println("알파벳 입니다");
		// A = 65 , Z = 90
		else System.out.println("기타 문자입니다.");	
		
		
		
//		if (Character.getNumericValue(i)>=0 && Character.getNumericValue(i)<10) System.out.println("숫자입니다");
		if(Character.isDigit(i)) System.out.println("숫자입니다");
		else if (Character.isLowerCase(i)|| Character.isUpperCase(i)) System.out.println("알파벳 입니다");
		else System.out.println("기타 문자입니다.");
		
		
		/*
		 java.lang.Character 클래스의 메서드를 이용해서 이 문제를 풀어봅시다.
		 
		 기본 자료형     Wrapper클래스
		 -------------------------------
		 byte        Byte
		 short       Short
		 char        Character
		 int         Integer
		 long        Long
		 float       Float
		 double      Double
		 boolean     Boolean
		 -------------------------------
		 
		 */
		
		/*
		 * java.lang.Character 클래스의 method를 이용해서 이 문제를 풀어봅시다.
		 * static boolean isAlphabetic(int codePoint)
		 * static boolean isDigit(char ch): 숫자 여부 판별
		 * static boolean isLowerCase(char ch) : 알파벳 소문자면 ture
		 * static boolean isUpperCase(char ch) : 알파벳 대문자면 true
		 * static int getNumericValue(char ch) : 문자를 숫자로 변환
		 * */
	}
}
