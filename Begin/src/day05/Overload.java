package day05;

public class Overload {

	public static void main(String[] args) {
		// 슈퍼맨 객체 3개 생성 후 showInfo()로 출력하기
		Superman[] sm = new Superman[3];
		for (int i=0; i<sm.length; i++) { 
			if( i==0) sm[i] = new Superman();
//			System.out.println(sm[i].showInfo());
		}
		sm[1] = new Superman("최슈퍼");
//		System.out.println(sm[1].showInfo());
		
		sm[2] = new Superman("장슈퍼",177,500);
//		System.out.println(sm[2].showInfo());
		
		//슈퍼맨을 저장할 배열을 생성하고 저장한 뒤 반복문돌려 정보 출력하기
//		System.out.println("******************************");
//		for(Superman i : sm) System.out.println(i.showInfo());
//		System.out.println("******************************");
		
		Aquman[] am = new Aquman[2];
		
		for (int i=0; i<am.length; i++) {
			am[i] = new Aquman();
//			System.out.println(am[i].showInfo());
		}
		am[1] = new Aquman("고등어",150,78.12);
//		System.out.println(am[1].showInfo());
		
		am[0] = new Aquman("갈치",170);
//		System.out.println(am[0].showInfo());
		
		// 슈퍼맨과 아쿠아맨을 모두 저장할 배열을 생성하고 반복문 돌려서 showInfo() 호출하기
		// 부모타입[] 변수 = {자식 객체들...}
		
		// 참조변수 instanceof 클래스명 : 변수가 클래스의 객체면 true를 반환, 그렇지 않으면 false를 반환한다.
		
		Object[] ob = new Object[5];
		for (int i = 0; i<ob.length; i++) {
			ob[i] = (i<sm.length)? sm[i] : am[ob.length-1 - i];
			System.out.println((ob[i]  instanceof Superman)? ((Superman)(ob[i])).showInfo():((Aquman)(ob[i])).showInfo());   
		}
		// 자식 -작은자료형 = (자식유형) Object유형(부모 - 큰자료형)
	}
}
