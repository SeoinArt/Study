package day05;

public class CoffeeShop {

	public static void main(String[] args) {

		// 1. 밀크 커피 2. 설탕커피 3. 블랙 커피 4. 크림커피

		VendingMachine vm = new VendingMachine();
		Yuja yj = new Yuja();
		yj.setYuja(10);
		yj.setSugar(10);
		vm.makeTea(yj);
		
		vm.makeTea(1, 2, 3); // 밀크
		vm.makeTea(2, 3); // 설탕
		System.out.println(vm.makeTea(1)); // 블랙
		vm.makeTea(3, (short)5); // 크림
		vm.makeTea((short)3,3 ); // 크림
	}
}
