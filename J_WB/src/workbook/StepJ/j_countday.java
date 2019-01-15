package workbook.StepJ;

import java.util.Scanner;

public class j_countday {
	
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month1, day1, count1;
	private int month2, day2, count2;
	
	public j_countday() { input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 날짜를 입력하시오. (월 일) ");
		this.month1 = s.nextInt();
		this.day1 = s.nextInt();
		System.out.print("두번째 날짜를 입력하시오. (월 일) ");
		this.month2 = s.nextInt();
		this.day2 = s.nextInt();
		count1 = CalcDate(month1, day1);
		count2 = CalcDate(month2, day2);
	}

	private int CalcDate(int month, int day) {
		int count=0;
		for(int i = 0; i<month-1; i++) {
			count += this.monthdays[i];
		}
		count += day;
		return count;
	}
	
	public void printday() {
		if(this.month1>12 || this.month2>12 || this.month1<1 || this.month2<1) System.out.println("잘못 입력하셨습니다.");
		else if(this.day1>this.monthdays[this.month1-1] || this.day2>this.monthdays[this.month2-1]) System.out.println("잘못 입력하셨습니다.");
		else System.out.printf("두 날짜의 간격은 %d일 입니다. \n", Math.abs(count1-count2));
	}

}
