package workbook.StepC;

import java.util.Scanner;

public class c_yoon_year {
	private int year;
	private boolean yoon;
	
	public c_yoon_year(){input();}
	public void printyoon() {
	    if(getyoon()==true)
		    System.out.printf("입력하신 년도는 윤년입니다.");
	    else
	    System.out.printf("입력하신 년도는 윤년이 아닙니다.");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("년도를 입력하세요. ");
		this.year = s.nextInt();
	}	
	boolean getyoon() {
		if((year%4) == 0) yoon = true;
		if((year%4) == 0 && (year)%100 == 0) yoon = false;
		if((year)%100 == 0 && (year)%400 == 0) yoon = true;
		return this.yoon;
	}
}
