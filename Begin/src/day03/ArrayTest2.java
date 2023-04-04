package day03;

public class ArrayTest2 {
	public static void main(String[] args) {
		int x[] = {1,2,3,4};
		int [] y;
		
		y = x; // x가 참조하는 배열을 y도 같이 참조하는 형태
		
		
		for (int i: y) System.out.print(i+", ");
			
		y[2]=300;
		
		System.out.println("y[2] = "+y[2]);
		System.out.println("x[2] = "+x[2]);
		
		System.out.println("--------------------------------------------------------------------");
		
//		[1] m과 n의 배열을 서로 바꿔서 참조해보세요
		int[] m = {10,20};
		int n[] = {3,4,5,6};
		
		int l[] = m;
		m = n;
		n = l;
		for(int i:m)System.out.print(i+" ");
		System.out.println();
		for(int i:n)System.out.print(i+" ");
		
		
		
	}
}
