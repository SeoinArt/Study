package day04;

public class JobSeeker {
	private String name;
	private int age;
	private String career;
	private String condition;
	
	public void setName(String a) {
		this.name = a;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public void setCareer(String a) {
		this.career = a;
	}
	public void setCondition(String a) {
		this.condition = a;
	}
	
	public String totalPrint() {
		String str="";
		str += "이름 : "+name+"\n";
		str += "나이 : "+age+"\n";
		str += "경력 : "+career+"\n";
		str += "조건 : "+condition+"\n";
		return str;
	}
	
	
	/* 구직자 객체 2개를 생성해서 속성값 주고 메서드 호출하기 introduce(), profiles() 호출해서 출력하기
	 * JobSeeker js1 = new JobSeeker();
	 * JobSeeker js2 = new JobSeeker();
	 * 
	 * js1.introduce()
	 * js2.introduce()
	 * 
	 * 
	 * */
	
}
