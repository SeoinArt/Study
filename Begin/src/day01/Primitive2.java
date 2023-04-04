package day01;

public class Primitive2 {
	// main() 메서드 구성하기
	public static void main(String[] args) {
		System.out.println("2. 실수형 -------------------");
		// float < double
		// float : 단정밀도, 소수점 이하 7자리
		// double : 배정밀도, 소수점 이하 15 ~ 16 [디폴트]
		float ft1 = 10.1234f;
		// float형은 부동 소수점일 경우 반드시 접미사 f,F를 붙인다. 그렇지 않으면 double로 인식한다.
		float ft2 = 800;

		System.out.printf("ft1 = %f\n", ft1);
		System.out.printf("ft2 = %f\n", ft2);

		float ft3 = .789f;
		System.out.printf("ft3 = %f\n", ft3);

		double db1 = 123.456789;
		double db2 = 789.123456d;
		System.out.println("db1 = " + db1);
		System.out.println("db2 = " + db2);

		// 과학적 지수 표기 방법 : E
		double db3 = 3e-2; // 3^10^-2
		double db4 = 3e+2; // 3^10^2

		// syso => Ctrl + 스페이스바
		System.out.println("db3 = " + db3);
		System.out.println("db4 = " + db4);

		// float 타입 변수 선언하고, 900E7 값을 할당한 후 출력하세요
		float ft4 = 900e+7f; 
		System.out.println("ft4 = " + ft4);

		// promotion : byte < short < int < long < float < double
		byte b = 50;
		float c = 1.2f;
		// 변수를 선언해서 b*c의 값을 저장하세요
		float result = b * c;
		double result2 = b * c;

		System.out.println("b*c = " + result);
		System.out.println("b*c = " + result2);
	}

}
