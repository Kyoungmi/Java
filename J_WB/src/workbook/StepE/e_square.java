package workbook.StepE;

import java.util.Scanner;

public class e_square {
	
	private int length;
	
	public e_square() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("정사각형의 크기를 입력하시오. ");
		this.length = s.nextInt();
	}
	
	public void printsqu() {
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}
