package day08;

/* 파일을 읽어서 콘솔에 출력하는 프로그램
[1] try ~ catch

[2] throws
 	Exception
 		|
 	IOException
 		+-------FileNotFoundException
* */

import java.io.*; // 입출력 관련 패키지

import javax.swing.JOptionPane;

public class FileIO2 {

	public static String reading(String fileName) throws FileNotFoundException, IOException
	{
		System.out.println("----"+fileName+"----");
		String content="";
		FileReader fr = null; 
		
		char[] data =new char[1000]; // 파일 데이터를 담을 배열 -1000자	
		
		fr = new FileReader(fileName); //파일과 노드 연결
		// FileNotFoundException : 파일 이름에 해당하는 파일이 존재하지 않을 경우
		
		int n =  fr.read(data,0,1000); // 파일을 읽어서 배열에 담는다.
		// IOException : 입출력 작업에서 발생하는 에러
		
		fr.close(); // 파일 리소스를 반환
		// IOException
		
		content = new String(data,0,data.length); // 파일 내용을 문자열로 만든다.
	
		return content;
		
	}
	
	public static void main(String[] args) {
		String fname = JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		if(fname == null) return;
		String str="";
		try {
			str = reading(fname);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			
		} catch(Exception e) {}
		
		System.out.println(str.trim());
	}

}
