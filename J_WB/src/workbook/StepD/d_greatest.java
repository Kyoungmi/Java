package workbook.StepD;

import java.util.Scanner;

public class d_greatest {
	private int number;
	private int max_num, min_num;
	
	public d_greatest() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("0부터 100 사이의 숫자를 입력하세요 ");
		this.number = s.nextInt();
		this.max_num = number;
		System.out.print("0부터 100 사이의 숫자를 입력하세요 ");
		this.number=s.nextInt();
		this.min_num = number;
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요 ");
			this.number=s.nextInt();
			if(number<0 || number >100) break;
			if(max_num<number) this.max_num= number;
			if(min_num>number) this.min_num= number;
		}
	}
	int min() {
		return this.min_num;
	}
	int max() {
		return this.max_num;
	}
	
	
	public void printmax() {
		System.out.printf("입력된 숫자들 중 가장 큰 수는 %d이고, 가장 작은 수는 %d 입니다.", max(), min());
	}
}
