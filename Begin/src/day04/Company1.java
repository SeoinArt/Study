package day04;

public class Company1 {
	private String sector;
	private int comNum;
	private String homePage;
	private String career;

	public void setSector(String a) {
		this.sector = a;
	}

	public void setcomNum(int i) {
		this.comNum = i;
	}

	public void setHomepage(String a) {
		this.homePage = a;
	}

	public void setcareer(String a) {
		this.career = a;
	}
	public String totalPrint() {
		String str="";
		str += "업종 : "+sector+"\n";
		str += "사원수 : "+comNum+"\n";
		str += "홈페이지 : "+homePage+"\n";
		str += "원하는 경력일수 : "+career+"\n";
		return str;
	}
}
