package workbook.StepE;

import java.util.Scanner;

public class e_2nd {
	private int rows;
	private int columns;
	private int number;

	public e_2nd() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("출력하려는 행의 크기와 열의 크기를 입력하시오. ");
		this.rows = s.nextInt();
		this.columns = s.nextInt();
	}
	
	public void printrowcol() {
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=columns; j++) {
				System.out.printf("%5d", i*j);
			}
			System.out.print("\n");
		}
	}
}
