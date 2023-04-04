package day05;

public class Staff {
	private int no;
	private String name;
	private String dept;
	private String []total = new String[2];
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.total[0] = this.name = name;
	}
	public void setDept(String dept) {
		this.total[1] = this.dept = dept;
	}

	
	public void setTotal(String[] total) {
		this.total = total;
	}

	public void showInfo() {
		System.out.println("---- Staff 정보 -----");
		System.out.printf("직번 %d , 이름 : %s, 파트 : %s\n",no,name,dept);
	}
}
