package workbook.StepE;

import java.util.Scanner;

public class e_googoo {
	private int mode;

	public e_googoo() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1: 홀수단, 2:짝수단)를 입력하시오. ");
		this.mode = s.nextInt();
		if(mode==1) printdan1();
		else printdan2();
	}
	
	public void printdan1() {
		
		for(int i=3; i<=9; i=i+2) {
			for(int j =1; j<10; j++) {
				System.out.printf("%d x %d = %-5d   ", i, j, i*j);
				if(j%3==0) System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
	
	public void printdan2() {
		
		for(int i=2; i<9; i=i+2) {
			for(int j =1; j<10; j++) {
				System.out.printf("%d x %d = %-5d   ", i, j, i*j);
				if(j%3==0) System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}
