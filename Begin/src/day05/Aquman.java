package day05;

public class Aquman {
	String name;
	int height;
	double speed;
	// 생성자 오버로딩 2개 이상 만들기
	// 생성자를 구성하지 않으면 컴파일러가 디폴트 생성자를 제공한다.
	
	public Aquman() // 매개변수가 없는 기본 생성자 (default constructor)
	{
		name = "아쿠아맨";
		height = 10;
		speed = 200.0;
	}

	public Aquman(String name, int height) {
		this.name = name;
		this.height = height;
		speed = 56.12;
	}

	public Aquman(String name, double speed) {
		this.name = name;
		height = 180;
		this.speed = speed;
	}

	public Aquman(String name, int height, double speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;
	}

	public String showInfo() {
		String str = "---아쿠아맨 정보---\n";
		str += "이 름 : " + name + "\n키: : " + height + "\n초능력: " + speed+"\n";
		return str;
	}
}
