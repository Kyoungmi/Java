package workbook.StepB;

import java.util.Scanner;

public class b_DaysToSeconds {

	private int days;
	private int seconds;
	private int m_count;
	
	public b_DaysToSeconds(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수 입력하시오. ");
		this.days= s.nextInt();
	}	
	
	int getseconds() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}
	int getcount() {
		if(getseconds()>1000000)
			m_count = getseconds() / 1000000 ;
		return this.m_count;
	}
	public void printSeconds() {
		if(getseconds()>1000000) {
			System.out.printf("날 수에 해당하는 시간은 모두 %d입니다.\n", getseconds());
		    System.out.printf("100만 초가 모두 %d번이나 포함됩니다.\n", getcount());
		}
		else
			System.out.printf("날 수에 해당하는 시간은 모두 %d입니다.\n", getseconds());
	}

}
