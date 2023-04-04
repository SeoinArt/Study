package day08;

interface Inter1{
	void a(); // public abstract가 붙는다.
	int b();
}

////////////

interface Inter2{
	double PI=3.14; // public static final이 붙는다.
	
}
////////////

//인터페이스가 인터페이스를 상속받을 때는 extends로 받으며, 여러 개 상속 받을 수 있다.
interface Inter3 extends Inter1, Inter2{
	void c();
}

// 추상클래스
abstract class AbsClass{
	abstract void d(); // 생략형 접근 지정자
}
////////////

// [1] MyDemo 클래스가 AbsClass, Inter3을 상속받은 뒤 에러 없도록 조치하세요 
class MyDemo extends AbsClass implements Inter3{

	@Override
	public void a() {
		System.out.println("a()");
	}

	@Override
	public int b() {
		return 1;
	}

	@Override
	public void c() {
		System.out.println("c()");
	}

	@Override
	void d() {
		System.out.println("d()");
	}
	
}


public class InterfaceTest2 {

	public static void main(String[] args) {
		MyDemo md = new MyDemo();
		md.a();
		System.out.println(md.b());
		md.c();
		md.d();
		System.out.println(MyDemo.PI);
		System.out.println(Inter2.PI);
		
		Inter1 im = new MyDemo();
		Inter2 im2= new MyDemo();
		Inter3 im3= new MyDemo();
		AbsClass ac =new MyDemo();
		im.a();
		System.out.println(im.b()); 
		// im.c() [x]
		
		im3.a();
		im3.b();
		im3.c();
		
		//im2.a(); [x]
		
		ac.d();
		// ac.a() [x]
		((MyDemo)ac).a();
		((Inter1)ac).a();
		
	}

}
