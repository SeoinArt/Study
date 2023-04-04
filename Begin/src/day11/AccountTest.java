package day11;

public class AccountTest {
	Thread th;

	public static void main(String[] args) {
		Account ac = new Account();

		Userin user1 = new Userin(ac, "개미");
		Userout user2 = new Userout(ac, "베짱이");
		
		user1.start();
		user2.start();
	}
}
