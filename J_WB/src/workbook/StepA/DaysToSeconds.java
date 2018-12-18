package workbook.StepA;

import java.util.Scanner;

public class DaysToSeconds {

	private int days;
	private int seconds;
	
	public DaysToSeconds(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수 입력하시오. ");
		this.days= s.nextInt();
	}	
	int getseconds() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}
	public void printSeconds() {
		System.out.printf("날 수에 해당하는 시간은 모두 %d입니다.\n", getseconds());
		
	}	
}
