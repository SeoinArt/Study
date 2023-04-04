package day11;
// 1만원씩 저축하는 스레드
public class Userin extends Thread {
	
	private Account account;
	public Userin(Account ac, String name) {
		this.account = ac;
		setName(name);
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			account.save(1);// 1만원씩 저축
		}
	}
}
