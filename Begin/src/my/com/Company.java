package my.com;

import java.util.*;

public class Company {

	String name,homePage;
	int year,employees;
	
	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.print("회사명 : ");
		name = sc.nextLine();
		System.out.println("설립년도 : ");
		year = sc.nextInt();
		 
		System.out.print("사원수: ");
		employees = sc.nextInt();
		sc.skip("\r\n");
		System.out.print("홈페이지: ");
		homePage = sc.nextLine();
		System.out.println();
	}

	public String introduce() {
		String intro="\n---회사 소개----\n";
		intro+="회사 명: "+name+"\n";
		intro+="설립년도: "+year+"\n";
		intro+="사원 수: "+employees+"\n";
		intro+="홈페이지: "+homePage+"\n";
		return intro;

	}

}