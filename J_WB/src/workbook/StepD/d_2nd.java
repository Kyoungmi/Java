package workbook.StepD;

import java.util.Scanner;

public class d_2nd {
	private int a, b, c;
	private int x_begin, x_end;
	private int x, y;
	private int i;
	
	public d_2nd() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("2차 함수 y=ax^2+bx+c의 계수 a와 b, c를 입력하시오. ");
		this.a = s.nextInt();
		this.b = s.nextInt();
		this.c = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝값을 입력하시오. ");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	
	}
	
	public void print2nd() {

		for(i=x_begin; i<=x_end; i++){
		y = i*i*a + i*b +c;
		System.out.printf("좌표 (%d, %d)\n", i, y);

		}
	}
}
