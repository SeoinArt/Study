package day11;

@FunctionalInterface
interface MyFunc{
	// 매개변수 없고 반환값도 없는 람다식
	void foo();  
}
// ----------------------

@FunctionalInterface
interface YourFunc{
	// 매개변수 있는 람다식
	void bar(int a);
}

@FunctionalInterface
interface HerFunc{
	// 매개변수 있고 반환값 있는 람다식
	int barz(int x, int y);
}

public class LambdaTest2 {
	public static void main(String[] args) {
		// [1] @을 찍는 람다식
		MyFunc mf = ()->System.out.println("@@@@");;
		mf.foo();
		
		// [2] 매개변수의 5배를 반환하라
		YourFunc yf = a-> System.out.println(a*5);
		yf.bar(8);
		
		YourFunc yf2 = a-> System.out.println(a-3);;
		yf2.bar(8);
		
		// x의 y승 값을 반환하는 함수를 람다식으로 구현해보기
		HerFunc hf = (a,b) -> (int)Math.pow(a, b);
		int z = hf.barz(2, 6);
		System.out.printf("2의 6승은? %d",z);
		
		
	}
}
