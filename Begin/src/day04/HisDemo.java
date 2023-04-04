package day04;

public class HisDemo {
	static int a,x;
	public void foo() {
		System.out.println("-----------fo()-------");
	}
	public static void bar() {
		System.out.println("-----------bar()-------");
	}

	
	public String men(char i, int j) {
		String str="";
		for(int k =0; k<j; k++) {
			str+=i;
		}
		return str;
	}
	
	public static int men1(int i, int z) {
		a=i+z;
		return a;
		
		
	}
	
	
	
	public static void main(String[] args) {
		HisDemo.bar();
		HisDemo hd = new HisDemo();
		hd.foo();
		
		System.out.println(hd.men('5', 5));
		System.out.println(HisDemo.men1(1, 4));
		}
		
	}


