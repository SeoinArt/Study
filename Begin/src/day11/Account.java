package day11;

public class Account {
	private int money = 10;
	private boolean flag = false;

	public void save(int value) {
		synchronized (this) {
			if (flag) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			// 동기화 블럭 == > 객체의 lock을 쥐어야만 해당블럭을 수행할수있음
			this.money += value;
			System.out.printf("입금액: %d, 입금 후 잔액: %d\n", value, money);
			notify(); // wait pool에 대기 중인 스레드 하나를 꺠워서 runnable 상태로 전환시킨다.
			flag = true;
			// notifyAll() => wait pool에 대기 중인 모든 스레드를 꺠운다
		}
	}

	
	synchronized public void get(int value) {
		if (!flag) {
			try {
				wait();
				// wait() 호출되면 스레드는 수행 권한을 포기하고 wait pool에 가서 대기한다
				// 이 때 락을 반납하고 대기상태로 들어간다.
			} catch (InterruptedException e) {
			}
		}
		if (money - value < 0) {
			System.out.printf("현금 부족!!! 현재 잔액: %d, 요청한 금액: %d\n", money, value);
			flag = false;
			notify();
			return;
		}

		this.money -= value;
		System.out.printf("출금액: %d, 출금 후 잔액: %d\n", value, money);
		flag = false;
		notify();
	}

}

// -----------------------------------------------
