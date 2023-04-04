package day04;

import java.lang.ProcessHandle.Info;

public class Company {

	String name; // 회사명
	int year; // 설립년도
	int employees; // 사원수

	// default 생성자를 기본적으로 제공한다.
//	멤버 변수의 default 값들로 초기화 한다
//	public Company() {
//		// 인스턴스 변수들의 초기화
//		name = "일반회사";
//		year = 1900;
//		employees = 2;
//	}
//	
	public void info() {
		System.out.println("회사명 : " +name);
		System.out.println("설립년도 : " +year+"년");
		System.out.println("총 사원수 : " +employees+"명");
	}
	
	
	
}





