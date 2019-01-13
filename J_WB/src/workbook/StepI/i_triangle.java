package workbook.StepI;

import java.util.Scanner;

public class i_triangle {
	private char c;
	private int height, blank;

	public i_triangle() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직각 삼각형을 그리는데 사용할 문자를 입력하시오. ");
		this.c = s.next().charAt(0);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. ");
		this.height = s.nextInt();
		this.blank = s.nextInt();
		PrintCharWithBlank(blank, height, c);
	}

	private void PrintCharWithBlank(int blanks, int size, char ch) {
		for(int i=0; i<size; i++) {
			for(int j=0; j<blanks+size; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			System.out.print(ch);
			System.out.print("\n");
			blanks--;
		}
		
	}
	
}
