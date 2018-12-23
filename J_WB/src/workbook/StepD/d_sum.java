package workbook.StepD;

import java.util.Scanner;

public class d_sum {
	private int number;
	private int totalsum;
	private int i;
	
	public d_sum() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 ");
		this.number = s.nextInt();
		
	}
	
	int getSum(int number) {
		number = this.number;
		for(int i =1; i<= number ; i++)
		totalsum += i;
		return this.totalsum;
	}
	
	public void printsum() {
		System.out.printf("1부텨 입력한 숫자까지의 모든 정수를 더한 값은 %d 입니다", getSum(i));
	}
}
