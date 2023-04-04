package day05;

/*학생: 학번, 이름, 학급명
강사: 교번, 이름, 과목
직원: 사번, 이름, 부서*/

//문제1]학생 객체를 2개 더 생성하고...
// 각각 이름,학번,학급 값을 넣어준뒤...
// 3명의 학생을 배열에 저장하자.
// for루프 돌리면서 저장된 학생 객체들의
// 정보를 출력해보자.

public class SchoolApp {

	public static void main(String[] args) {

		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		Student s1 = new Student();
		Staff f1 = new Staff();

		Student[] sA = new Student[3];
		Teacher[] tA = {t1,t2};
		
		
		
		t1.setNo(1);
		t1.setName("홍길동");
		t1.setSubject("수학");
		
		t2.setNo(101);
		t2.setName("홍교사");
		t2.setSubject("HTML");
		
		s1.setNo(1);
		s1.setName("김정원");
		s1.setClassName("영어");
		
		f1.setNo(1);
		f1.setName("김하빈");
		f1.setDept("유지보수");
		
		
		for (Teacher ta : tA) ta.showInfo();
		System.out.println();
		
		
		for (int i = 0; i<sA.length; i++) {
			sA[i] = (i==0)? sA[i] = s1 : new Student();
		}
		// 전부 새롭게 생성하기보다는 이미 기존에 생성한 바이럴들을 재사용하는 것도 좋을 것 같다.
		
		sA[1].setNo(2);
		sA[1].setName("김하빈");
		sA[1].setClassName("수학");
		
		sA[2].setNo(3);
		sA[2].setName("박수지");
		sA[2].setClassName("프랑스어");
		
		for(int i =0; i< sA.length; i++) {
			sA[i].showInfo();
			System.out.println();
		}
		System.out.println("--------------------------------");
		for (Student i : sA) {
			i.showInfo();
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		
		
		
	}

}
