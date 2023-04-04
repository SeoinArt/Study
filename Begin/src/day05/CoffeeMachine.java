package day05;

/* access modifier
 * [1] private : 같은 클래스 내에서만 접근 가능
 * [2] 생략형 : 같은 패키지 내에 있는 클래스들끼리는 접근 가능
 * [3] protected : 같은 패키지와 상속관계 접근 가능
 * [4] public : 어디서든 접근 가능
 * 
 * private < 생략 < protected < public
 * 
 * */
public class CoffeeMachine {
	private int coffee;
	private int sugar;
	private short cream;

	/* setXXX() : setter => void, 매개변수(0)
	 * setCoffee(), set_coffee() */
	public void setCoffee(int c) {
		this.coffee = c;
	}
	public void set_sugar(int s) {
		this.sugar = s;
	}
	
	public void setCream(short i) {
		this.cream = i;
	}
	
	
	public int getCoffee() {
		return coffee;
	}
	
	public int getSugar() {
		return sugar;
	}
	
	public short getCream() {
		return cream;
	}
	/* getXXX() : getter => 반환타입(0), 매개변수(x)*/

}
