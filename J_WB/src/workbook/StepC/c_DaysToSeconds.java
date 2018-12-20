package workbook.StepC;

import java.util.Scanner;

public class c_DaysToSeconds {

	private int day;
	private int month;
	private int day_count;
	
	public c_DaysToSeconds(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("월을 입력하시오. ");
		this.month= s.nextInt();
		System.out.printf("일을 입력하시오. ");
		this.day= s.nextInt();
	}	
	
	int getdays() {
		if(month==1)
			day_count = day;
		else if(month==2)
			day_count = 31 + day;
		else if(month==3)
			day_count = 31 + 28 + day;
		else if(month==4)
			day_count = 31 + 28 + 31 + day;
		else if(month==5)
			day_count = 31 + 28 + 31 + 30 + day;
		else if(month==6)
			day_count = 31 + 28 + 31 + 30 + 31 + day;
		else if(month==7)
			day_count = 31 + 28 + 31 + 30 + 31+ 30 + day;
		else if(month==8)
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
		else if(month==9)
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		else if(month==10)
			day_count = 31 + 28 + 31 + 30 + 31+ 30 + 31 + 31 + 30 + day;
		else if(month==11)
			day_count = 31 + 28 + 31 + 30 + 31+ 30 + 31 + 31 + 30 + 31 + day;
		else if(month==12)
			day_count = 31 + 28 + 31 + 30 + 31+ 30 + 31 + 31 + 30 + 31 + 30 + day;
		return this.day_count;
	}

	public void printdays() {
		if(getdays()==0)
			System.out.println("잘못입력하셨습니다.");
		else
			System.out.printf("이 날짜는 1년 중 %d 번째 날에 해당됩니다.\n", getdays());
	}

}
