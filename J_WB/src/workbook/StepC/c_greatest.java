package workbook.StepC;

import java.util.Scanner;

public class c_greatest {
	
	private int num1, num2, num3;
	private int max_num, min_num;
	
	public c_greatest(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 숫자를 입력하시오. ");
		this.num1 = s.nextInt();
		System.out.printf("두번째 숫자를 입력하시오. ");
		this.num2 = s.nextInt();
		System.out.printf("세번째 숫자를 입력하시오. ");
		this.num3 = s.nextInt();
	}	
	
	int getmax() {
		if(num1>num2) max_num = num1;
		else max_num=num2;
		if(max_num>num3) max_num = max_num;
		else max_num = num3;
		return this.max_num;
	}
	int getmin() {
		if(num1>num2) min_num = num2;
		else min_num=num1;
		if(min_num>num3) min_num = num3;
		else min_num = min_num;
		return this.min_num;
	}

	public void printgreatest() {
		System.out.printf("가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다.", getmax(), getmin());
		
	}

}
