package workbook.StepD;

import java.util.Scanner;

public class d_total {
	private int number;
	private int count=0;
	private int totalsum;
	private double average;
	
	public d_total() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요 ");
			this.number=s.nextInt();
			if(number<0 || number >100) break;
			totalsum = totalsum+number;
			count++;
		}
	}
	int gettotal() {
		return this.totalsum;
	}
	double getave() {
		average = totalsum/(double)count;
		return this.average;
	}
	
	
	public void printtotal() {
		System.out.printf("입력된 %d 개의 숫자들 중 가장 총합계는 %d이고, 평균 값은 %f 입니다.", count, gettotal(), getave());
	}
}