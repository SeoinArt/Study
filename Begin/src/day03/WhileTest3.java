package day03;

import javax.swing.JOptionPane;

public class WhileTest3 {

	public static void main(String[] args) {
//[1] JOptionPane으로 "구구단 몇단을 출력할까요?"	
		int i = Integer.parseInt(JOptionPane.showInputDialog("구구단 몇단을 출력할까요?"));
		int j = 1;
		while (j < 10) {
			System.out.printf("%d * %d = %d\n", i, j, i * j);
			j++;
			if (j > 9)
				break;
		}
		System.out.println();
		i = 1;
		j = 2;

//[2] 구구단 전체를 아래와 같은 형태로 출력하세요 =>중첩 while or do~while
		/*
			 * 2x1=2	3x1=3	....		9x1=9
			 * 2x2=4	3x2=6				9x2=18
			 * ...
			 * 2x9=18
			 * */

		while (i < 10) {
			while (j < 10) {
				System.out.printf("%d*%d = %d \t", j, i, i * j);
				j++;
			}
			System.out.println();
			i++;
			j = 2;
		}
	}
}
