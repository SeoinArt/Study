package day05;

public class Superman {
	String name;
	int height;
	int power;

	// 생성자 오버로딩
		public Superman() {
			this("아무개", 160, 100);
			// this()는 생성자 안에서만 호출이 가능하며, 첫번째 줄에 위치해야 한다.
			// super와 함께 사용할 수 없다.
		}
		public Superman(String name) {
			this(name,165,200);
		}
	
		public Superman(String name, int height) {
			this(name, height, 300);
		}
	
	// 최종 목적지 == 생성자 method를 이용하여 초기화를 진행한다
	public Superman(String name, int height, int power) {
		this.name = name;
		this.height = height;
		this.power = power;
	}

	public String showInfo() {
		String str = "---슈퍼맨 정보---\n";
		str += "이 름 : " + name + "\n키: : " + height + "\n초능력: " + power+"\n";
		return str;
	}
}
