package day03;

public class HomeWork {

	public static void main(String[] args) {

		int x = 2, y = 5;
		char c = 'A';

// [1]
//		[1]-(1)
		System.out.println(1 + x << 33);
		/* int = 4Byte : 00000000 00000000 00000000 00000000 
		 * x = 2 : 00000000 00000000 00000000 00000010 
		 * x + 1 = 3 00000000 00000000 00000000 00000011
		 * 4byte = 32 bit => 33-32 = 1
		 * result = 3<<2^1 : 3*2 = 6 
		 * */

//		[1]-(2)
		System.out.println(y >= 5 || x < 0 && x > 2);
		/* 논리 연산자 &&는 우선순위가 ||보다 높다
		 * 1) x<0 false
		 * 2) x>2 false 
		 * 3) y>=5 true
		 * result = true
		 * */

//		[1]-(3)
		System.out.println(y += 10 - x++);
		/* 1) x++ => 대입 2, x = 3
		 * 2) 10 -2 = 8
		 * 3) y += 8 = 13
		 * result = 13
		 * */

//		[1]-(4)
		System.out.println(x += 2);
		/* 1)  (3)에서 x++ = 3
		 * 2) x+=2 == x=3+2 = 5
		 * result = 5
		 * */

//		[1]-(5)
		System.out.println(!('A' <= c && c <= 'Z'));
		/* 1) 'A' = 65 , c = 65 true
		 * 2) 'z' = 90 => c< 'Z' true
		 * 3) true && true = true
		 * 4) !true = false
		 * */

//		[1]-(6)
		System.out.println('C' - c);
		/* 이항 연산자의 피연산자가 int보다 작은 타입일 경우 int로 변환한 다음 연산 수행
		 * 1) 'C' = 67
		 * 2) c = 65 ='a'
		 * 3) 'C' - c = 67-65 = 2
		 * result = 2
		 * */

//		[1]-(7)
		System.out.println('5' - '0');
		/* 이항 연산자의 피연산자가 int보다 작은 타입일 경우 int로 변환한 다음 연산 수행
		 * 1) '5' = 53
		 * 2) '0' = 48
		 * 3) '5' - '0' = 53-48= 5
		 * result = 5
		 * */

//		[1]-(8)
		System.out.println(c + 1);
		/* 이항 연산자의 피연산자가 int보다 작은 타입일 경우 int로 변환한 다음 연산 수행
		 * 1) c = 65
		 * 2) c+1 = 66 
		 * result = 66
		 * */

//		[1]-(9)
		System.out.println(++c);
		/* 단항 연산자는 형변환이 발생하지 않음
		 * 1) c = 65
		 * 2) ++c = ++(65) = 66 
		 * result = 'B'(66)
		 * */

//		[1]-(10)
		System.out.println(c++);
		/* 단항 연산자는 형변환이 발생하지 않음
		 * 1) c = 66
		 * 2) c++ = (66)++ => c = 67
		 * result = 'B'(66) 
		 * */

//		[1]-(11)
		System.out.println(c);
		// 'C'

// [2]
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니 크기
		// 모든 사과를 담는데 필요한 바구니의 수 numOfBucket
		/* 사과의 개수 % 바구니 크기 == 애매하게 남은 사과의 개수
		 * 1) 애매하게 남은 사과의 개수 존재 = +1
		 * 2) 정확하게 일치 = 0 
		 */
		int numOfBucket = (numOfApples % sizeOfBucket > 0) ? numOfApples / sizeOfBucket + 1 : numOfApples / sizeOfBucket;

// [3]
		int num3 = 10;
		System.out.println(num3 > 0 ? "양수" : num3 == 0 ? "0" : "음수");

// [4]
		int num4 = 456;
		System.out.println(num4 / 100 * 100);

// [5] 
		int num5 = 333;
		System.out.println((num5 / 10 * 10 + 1));
	}
}
