package day09;

public class Local {
	// 멤버변수
	String str = "@@@";

	// ---------------- sub() -------------------------
	void sub(final String args) {

		// 지역변수 
		final String lstr = "###";
		// 로컬변수 => 로컬 이너 클래스에서 사용하려면 final 변수이어야 한다.
		// 값을 수정할 수 없게 해야한다.

		System.out.println("str: " + str);
		System.out.println("lstr: " + lstr);

		// Local Inner Class - [1] 이름 없는 로컬 이너 클래스
		class LocalInner extends javax.swing.JFrame{
			int no = 90;

			// --------------- local bar()----------------
			void bar() {
				System.out.println("---LocalInner's bar()---");
				System.out.println("no: " + no);
				System.out.println("str: " + str);
				System.out.println("lstr: " + lstr);
				
				// lstr = "값을 변경할께요"; [x]
				System.out.println("args: "+ args);
			}
		}
		// LocalInner 클래스는 소속된 메서드 내에서만 객체 생성 가능함
		// class를 구성한 후에 객체 생성 가능함
		LocalInner li = new LocalInner();
		li.setSize(200,200);
		li.setVisible(true);
		li.bar();
	}

	// ---------------- demo() -------------------------
	void demo() {
		class LocalInner {

		}
	}
	public static void main(String[] args) {
		// sub() 호출하기
		Local lc = new Local();
		lc.sub("Hello");
		
		
	}

}
