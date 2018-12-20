package workbook.StepC;

import java.util.Scanner;

public class c_tax {
	private int income;
	private int tax;
	
	public c_tax(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("연봉(원 단위)을 숫자로 입력하세요. ");
		this.income = s.nextInt();
	}	
	
	int gettax() {
		if(income<10000000) tax = (int) (income * 9.5 / 100);
		else if(income<40000000) tax = income * 19 / 100;
		else if(income<80000000) tax = income * 28 / 100;
		else if(income>=80000000) tax = income * 37 / 100;
		return this.tax;
	}

	public void printtax() {
		System.out.printf("연봉 금액에 대한 소득세는 %d원 입니다.", gettax());
		
	}
}
