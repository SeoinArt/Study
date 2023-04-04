package day01;

public class Operator1 {

	public static void print(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("1. 단항 연산자 (부호, 증감, 비트별 not(~), 논리 부정(!)");
		
		byte a = 5;
		byte b = 7;
		print("+a: "+ (+a));
		print("-b: "+ (-b));
		
		print("증감연산자(++, -- ) ----------");
		int c = 8;
		long d = 6;
		c++; // c = c+1
		d--; // d= d-1
		print("c : "+ c); // 9
		print("d : "+ d); // 5
		
		++c; 
		--d; 
		print("c : "+ c); // 0
		print("d : "+ d); // 4
		
		float e = 5.6f;
		double f = 8.4;
		print("e : "+ ++e); // 6.6
		print("f : "+ --f); // 7.4
		print("-------");
		print("e : "+ e++); // 6.6
		print("f : "+ f--); // 7.4
		print("-------");
		print("e: "+e); 
		print("f: "+f); 
		
		print("비트별 not연산자(~)---------------");
		int m =42;
		print("m :"+ m); // 42
		print("~m :"+(~m)); // -43
		
/*		42를 비트로 바꾸어서 연산해야함 
		~ : 0은 1로, 1은 0으로 비트 반전을 한다.
		
		42
		21 ...0
		10 ...1
		5 ... 0
		2 ... 1
		1 ... 0
  		42  : 00000000 00000000 00000000 00101010
        ~42 : 11111111 11111111 11111111 11010101 
		==> 이 값을 10진수로 바꾸어야함
		-1*2^31 + -1*2^30 + -1*2^29 ...
		[1]앞에서부터 1반복이 끝나는 지점부터 뽑아낸다 = 1010101
		[2] 맨 앞의 1은 부호 비트 => 010101
*/		
		int x = 0xfffffff1; 
		// 1111 1111 1111 1111 1111 1111 1111 0001
		print("x: "+ x); // -15
		print("~x: "+ (~x)); // 1110 = 14
	}

}
