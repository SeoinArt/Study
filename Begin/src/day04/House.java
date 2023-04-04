package day04;
// 객체 = 속성 (number variable) + 행동양식 (method)
public class House {
//	1. 속성 - has a 관계가 성립해야 한다.
	int room; // House has a room
	String owner;
	String addr;
	
	
//	2. 행동양식(기능)
	public void printInfo() {
		System.out.println("----House 정보 ----");
		System.out.printf("소 유 주 : %s\n",owner);
		System.out.printf("방   수 : %d개\n",room);
		System.out.printf("주   소 : %s\n",addr);
	}
	public String existAt(int bunji) {
		String str ="----"+owner+"의 집 상세 주소----\n";
		str+=addr+" "+bunji+"번지에 위치해요\n";
		return str;
	}
	
	// rent() method 구성하기 (집의 거래 유형 - 매매, 전세, 월세  가격 : 만원단위)
	public String reSult(String a, int b) {
		String c=owner+ "의 집 => ";
		c += (a.equals("매매"))?a+"\n가격은 "+b + "만원":(a.equals("전세"))? a+"\n가격은 "+b+"만원" :(a.equals("월세"))? a+"\n가격은 "+b+"만원" : "error";
		c +="\n";
		return c;
	}
}
/////////////////////////////////////////
