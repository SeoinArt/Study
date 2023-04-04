package day05;

public class Teacher {
	private int no;
	private String name;
	private String subject;
	private String[] total = new String[2];
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.total[0] = this.name = name;
		 
	}
	public void setSubject(String subject) {
		this.total[1] = this.subject = subject;
	}
	
	public int showNo() {
		return no;
	}
	
	public String[] showArray() {
		return total;
	}
	public void showInfo() {
		System.out.println("---- 선생님 정보 -----");
		System.out.printf("교번 %d , 이름 : %s, 과목 : %s\n",no,name,subject);
	}
}
