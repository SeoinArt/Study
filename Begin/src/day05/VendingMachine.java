package day05;

/* 메소드 오버로딩(다중정의)
 * [1] 메서드 이름은 같게 구성한다
 * [2] 매개변수는 자료형이 다르거나, 갯수가 다르거나, 순서가 달라야 한다
 * [3] 반환타입은 같아도 되고 달라도 된다. (반환타입은 신경쓰지 않음)
 * */


public class VendingMachine {
	private int coffee, sugar, cream;

	public void makeTea(int coffee, int sugar, int cram) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cram;
		System.out.println("밀크 커피 나가요 ~~ 농도 : " + (this.coffee + this.sugar + this.cream));
	}

	public void makeTea(int c, int s) {
		coffee = c;
		sugar = s;
		System.out.println("설탕 커피 나가요~~ 농도: " + (coffee + sugar));
	}

	// 오버로딩 : 같은 이름의 다른 결과

	public String makeTea(int coffee) {
		this.coffee = coffee;
		return ("블랙 커피 나가요~~ 농도 : " + this.coffee);

	}

	// 크림커피

	public void makeTea(int coffee, short cream) {
		this.coffee = coffee;
		this.cream = cream;
		System.out.println("크림 커피 나가요~~ 농도 : " + (this.coffee + this.cream));
	}
	
	public void makeTea(short cream, int coffee) {
		this.coffee = coffee;
		this.cream = cream;
		System.out.println("크림 커피 나가요~~ 농도 : " + (this.coffee + this.cream));
	}
	
	// 유자차
	public void makeTea(Yuja yuja) {
		System.out.println("유자 농도 : "+yuja.getYuja());
		System.out.println("설탕 농도 : "+yuja.getSugar());
		System.out.println("유자차 나가요~ 농도 : "+(yuja.getYuja()+yuja.getSugar()));
	}
}
