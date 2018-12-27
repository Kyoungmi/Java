package workbook.StepF;

import java.util.Scanner;

public class f_year {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month, day, day_count;
	
	public f_year() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("월을 입력하시오.");
		this.month = s.nextInt();
		System.out.print("일을 입력하시오.");
		this.day = s.nextInt();
	}
	
	int getday() {
		
		for(int i = 0; i<month-1; i++) {
			day_count += this.monthdays[i];
		}
		day_count += this.day;
			
		return this.day_count;
	}
	
	public void printday() {
		if(this.month>12 || this.month<1) System.out.println("잘못 입력하셨습니다.");
		else if(this.day>this.monthdays[this.month-1]) System.out.println("잘못 입력하셨습니다.");
		else System.out.printf("이 날짜는 1년 중 %d번째 날에 해당됩니다. \n", getday());
	}
}
