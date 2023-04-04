package day08;

/* 파일을 읽어서 콘솔에 출력하는 프로그램

[1] try ~ catch

[2] throws
 	Exception
 		|
 	IOException
 		+-------FileNotFoundException
* */
//파일을 읽어서 콘솔에 출력하는 프로그램
//[1] try ~ catch
//[2] throws
/*  Exception
* 		|
* 	IOException
* 		+-------FileNotFoundException
* 
* <1> try ~ catch로 예외처리 하세요
* */
import java.io.*; // 입출력 관련 패키지

import javax.swing.JOptionPane;

public class FileIO {

	public static String reading(String fileName) {
		System.out.println("----" + fileName + "----");
		String content = "";
		FileReader fr = null;
		// C:\Web\myJava\Workspace\Begin\src\day05\Cafe.java
		// 상대경로는 Begin을 기준으로 한다. => ./src/day05/Superman.java
		char[] data = new char[1000]; // 파일 데이터를 담을 배열 -1000자

		try {
			fr = new FileReader(fileName); // 파일과 노드 연결
			// FileNotFoundException : 파일 이름에 해당하는 파일이 존재하지 않을 경우

			int n = fr.read(data, 0, 1000); // 파일을 읽어서 배열에 담는다.
			// IOException : 입출력 작업에서 발생하는 에러

			fr.close(); // 파일 리소스를 반환
			// IOException

		} catch (FileNotFoundException e) {
			System.out.println(fileName +"이란 파일은 없어요!!");
		} catch (IOException e) {
			System.out.println("입출력 에러 발생"+e);
		} catch (Exception e) {
			System.out.println("에상치 못한 에러가 발생하였습니다.\n" + e);
		}
		content = new String(data, 0, data.length); // 파일 내용을 문자열로 만든다.
		return content;

	}

	public static void main(String[] args) {
		String fname = JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		if (fname == null)
			return;
		String str = reading(fname);
		System.out.println(str);
	}

}
