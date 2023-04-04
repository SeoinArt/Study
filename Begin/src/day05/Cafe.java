package day05;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
//		cm.coffee = 2;
		cm.setCoffee(2);
//		cm.sugar =1;
		cm.set_sugar(1);
//		cm.cream = 3;
		cm.setCream((short)3);
		
//		System.out.println("cm.coffee : " + cm.coffee);
		System.out.println("cm.coffee : " + cm.getCoffee());
		
//		System.out.println("cm.sugar : " + cm.sugar);
		System.out.println("cm.sugar : " + cm.getSugar());
		
//		System.out.println("cm.cream : " + cm.cream);
		System.out.println("cm.sugar : " + cm.getCream());	
	}

}
