package day02;

public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("8. 논리 연산자 (&, &&, |, ||)");
		/* 1) &
		   2) | : 앞의 연산으로 결과를 알 수 있어도 뒤의 문장까지 비교한다.
     	   3) &&
		   4) || : &&의 경우 앞의 연산 결과가 false라면 뒤의 연산을 생략한다.
			 	 : ||의 경우는 앞의 연산결과가 true라면 뒤의 연산을 생략한다.
		*/
		int i = 1; //
		int j = i++; // i = 2 , j = 1
		
		if ((i>++j) && (i++ ==j)){
			// i(2)>j(2) false => break;
			i=i+j;
			
		}
		System.out.println("i= "+ i); // i =2
		
		// [2]
		int k =0;
		int p =1;
		if ((k++ ==0) | (p++ == 2)) {
			k =42;
		}
		System.out.println("k = "+ k +", p="+p);
	}

}
