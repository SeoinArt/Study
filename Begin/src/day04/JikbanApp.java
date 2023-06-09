package day04;
// 애플리케이션
/* 직방 프로그램에 필요한 객체
 * - 집
 * - 매도자, 매수자, 중개인, 임대인. 임차인
 * 객체를 프로그램 세계로 끌어들이는 것 ==> 추상화 (필요한 특징만 부각시켜서 클래스로 옮긴다)
 * */
public class JikbanApp {
	public static void main(String[] args) {
		// 단위 테스트(unit test)
		// 클래스 : 객체를 만들어내는 틀
		// 객체 : 클래스를 통해 만들어지는 구현물
		// 현실세계에 존재하는 객체(Objectm Instance) == > 프로그램에서 객체를 생성해서 메모리에 올림(object, instance)
		
		House h1 = new House(); // object, instance
		House h2 = new House(); // object, instance
		h1.owner = "홍길동";
		h1.room=3;
		h1.addr="강남구 삼성동";
		
		h2.owner = "김철수";
		h2.room=2;
		h2.addr="마포구 서교동";
		
		h1.printInfo();
		// non-static method : 객체명.method()
		h2.printInfo();
		
		House h3 = h1;
		h3.printInfo();
		
		// House 객체를 새로 생성하고, 이름, 방, 소유주 속성값 할당하기
		// printInfo() 호출하기, existAt() method 호출하기
		
		House h4 = new House();
		h4.owner = "최유미";
		h4.room = 4;
		h4.addr = "동작구 사당동";
		
		h4.printInfo();
		
		String info = h4.existAt(100);
		System.out.println(info);
		System.out.println(h4.existAt(200));
		
		System.out.println(h1.reSult("매매", 153200));
		System.out.println(h2.reSult("전세", 7500));
		System.out.println(h3.reSult("월세", 2500));
		System.out.println(h4.reSult("월수", 4500));
	}

}
