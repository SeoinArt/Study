package day05;

public class Student {
	private int no;  // instance variable
	private String name;
	private String className;
	private String[] total = new String[2];
	
	public void setNo(int no) {
		/* local variable
		 if instanceName ==  localName일 경우 localVariable이 우선된다.
		 따라서 instance Variable 은 this. 사용해야한다.
		 */
		
		this.no = no;
	}
	public void setName(String name) {
		this.total[0] = this.name = name;
	}
	public void setClassName(String className) {
		this.total[1] =this.className = className;
	}

	public int showNo() {
		return no;
	}
	
	public String[] showArray() {
		return total;
	}
	
	public void showInfo() {
		System.out.println("---- 학생 정보 -----");
		System.out.printf("학번 %d , 이름 : %s, 과목 : %s\n",no,name,className);
	}
}
