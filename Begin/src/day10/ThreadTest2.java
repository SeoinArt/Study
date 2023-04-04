package day10;

/* Thread 구현 방법
 * [1] java.lang.Thread 클래스 상속
 * [2] java.lang.Runnable 인터페이스 상속
 * 
 */
class SnailThread extends Thread {
	public SnailThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.getName() + "스레드가 기어갑니다");
			
			// [1]
			
			try {
				Thread.sleep(1000); // 1/1000초 단위
				// Block 상태 ( sleep(), I/O 작업시 )
			}catch(InterruptedException e) { // 스레드에 interrupt()가 호출될 때 예외가 발생함
				e.printStackTrace();
				break;
			} 
				

		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		SnailThread tr1 = new SnailThread("1 똘똘한 달팽이");
		SnailThread tr2 = new SnailThread("2 홀쭉이 달팽이");
		SnailThread tr3 = new SnailThread("3 이쁜이 달팽이");
		// 스레드 동작시키려면 run()[x]이 아니라 start()를 호출해야함

		// 우선순위: 1(제일 낮음) ~ 5(main) ~ 10(제일 높음)
		tr1.setPriority(Thread.MIN_PRIORITY);
		tr2.setPriority(Thread.NORM_PRIORITY);
		tr3.setPriority(Thread.MAX_PRIORITY);
		tr1.start();
		tr2.start();
		tr3.start();
		
//		tr2.interrupt(); // InterruptedException이 발생
		try {
			tr2.join(); // tr2 스레드가 작업을 다 마칠때까지 
			// tr2.join()호출한 스레드(여기는 main스레드)가 block 상태가 된다.
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello World~~");
	}
}
