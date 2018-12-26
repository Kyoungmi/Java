package workbook.StepE;

import java.util.Scanner;

public class e_triangle1 {
private int height;
private int blank;
	
	public e_triangle1() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. ");
		this.height = s.nextInt();
		this.blank = s.nextInt();
	}
	
	public void printtri() {
		for(int i=0; i<height; i++) {
			for(int j=0; j<blank+height; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			System.out.print("*");
			System.out.print("\n");
			blank--;
		}
	}
}
