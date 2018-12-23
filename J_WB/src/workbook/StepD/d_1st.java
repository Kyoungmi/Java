package workbook.StepD;

import java.util.Scanner;

public class d_1st {
	private int a, b;
	private int x_begin, x_end;
	private int x, y;
	private int i;
	
	public d_1st() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("1차 함수 y=ax+b의 계수 a와 b를 입력하시오. ");
		this.a = s.nextInt();
		this.b = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝값을 입력하시오. ");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	
	}
	
	public void print1st() {

		for(i=x_begin; i<=x_end; i++){
		y = i*a + b;
		System.out.printf("좌표 (%d, %d)\n", i, y);

		}
	}
}