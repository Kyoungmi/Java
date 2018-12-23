package workbook.StepD;

import java.util.Scanner;
import java.util.Arrays;

public class d_notcommon {
	private int num1, num2;
	private int i;
	
	public d_notcommon() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("2개의 숫자를 입력하시오. ");
		this.num1 = s.nextInt();
		this.num2 = s.nextInt();
	}
	
	public void printnotcom() {
		for(int i=1; i<=100; i++) {
			if((i%num1==0&&i%num2!=0)||(i%num2==0&&i%num1!=0)) {
				System.out.printf("%d,",i);
		}
	}
}
}