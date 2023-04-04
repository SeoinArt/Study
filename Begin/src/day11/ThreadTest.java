package day11;

// [2] java.lang.Runnable 인터페이스를 상속받는 
class Snail implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("달팽이가 기어갑니다.");
			int sec = (int) (Math.random() * 2000);
			try {
				Thread.sleep(sec);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // for --
	};// run() --
}

public class ThreadTest {

	public static void main(String[] args) {
		// 1. Runnable 객체 생성
		Snail r = new Snail();
		// 2. Thread 객체 생성 - runnable 객체를 생성자에 매개변수로 전달한다.
		Thread td = new Thread(r);
		// 3. Thread star() 호출
		td.start();

		final String name = "똘똘이";
		Runnable r2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(name + "달팽이가 기어갑니다.");
					try {
						Thread.sleep(2500);
					} catch (Exception e) {
					}
				} // -- for
			}// -- run()
		};// Anonymous class, 생성자 끝
		Thread tr2 = new Thread(r2);
		tr2.start();

		// Lambda식을 이용한 스레드 구현
		final String name2 = "이쁜이";
		Thread tr3 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(name2 + "달팽이가 기어갑니다.");
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
			}
		});
		tr3.start();
	}

}
