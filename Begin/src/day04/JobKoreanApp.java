package day04;

//[1] 구직자 클래스 구성해보기
//속성은 3개 이상
//method 2개 이상
//[2] 회사 클래스 구성해보기
//속성은 3개 이상
//method 2개 이상
public class JobKoreanApp {

	public static void main(String[] args) {
		// 구직자 2개 생성해서 속성값 주고 메서드 호출
		// 회사 2개 생성해서 속성값 주고 메서드 호출

		JobSeeker a[] = new JobSeeker[2];
		Company1 b[] = new Company1[2];
		for(int i = 0; i<2; i++) {
			a[i]=new JobSeeker();
			b[i]=new Company1();
		}
		
		a[0].setName("홍길동");
		a[0].setAge(43);

		a[0].setCareer("");
		a[0].setCondition("숙식제공");
		System.out.println(a[0].totalPrint());
		
		a[1].setName("김진새");
		a[1].setAge(23);
		a[1].setCareer("");
		a[1].setCondition("연봉 3600");
		System.out.println(a[1].totalPrint());
		
		b[0].setSector("서비스");
		b[0].setcomNum(500);
		b[0].setHomepage("http://www.naver.com");
		b[0].setcareer("7년");
		System.out.println(b[0].totalPrint());
		
		b[1].setSector("서비스");
		b[1].setcomNum(1500);
		b[1].setHomepage("http://google.com");
		b[1].setcareer("5년");
		System.out.println(b[1].totalPrint());
	
		/*// 구직자 객체 2개 생성해서 속성값 주고 메서드 호출하기 introduce(), projects() 호출해서 출력하기
		 * JobSeeker js1 = new JobSeeker();
		 * js1.name = "김시현";
		 * js1.age = 25;
		 * js1.field = "웹개발자";
		 * js1.salary = 5000;
		 * String intro = js1.introduce();
		 * System.out.println(intro);
		 * String[] profiles ={"학사관리 프로젝트 2년,"금융 프로젝트 3년"}; 
		 * String str = js1.projects(profiles);
		 * System.out.println(str);
		 * 
		 * JobSeeker js2 = new JobSeeker();
		 * js1.name = "이길동";
		 * js1.age = 26;
		 * js1.field = "퍼블리셔";
		 * js1.salary = 4000;
		 * System.out.println(js2.introduce());
		 * 
		 * System.out.println(js2.introduce());
		 * String[] profukes2 = {new String("공공부문 프로젝트 1년")};
		 
		 * 
		 * */
		
		
	}

}
