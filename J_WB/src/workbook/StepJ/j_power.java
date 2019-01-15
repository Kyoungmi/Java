package workbook.StepJ;

import java.util.Scanner;

public class j_power {
	private int num;
	
	public j_power() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("숫자를 입력하시오. (0.종료) : ");
		num = s.nextInt();
		if(num ==0) break;
		System.out.printf("2의 %d승은 : %d \n", num, poweroftwo(num));
		}
	}

	private int poweroftwo(int n) {
		int result=0;
		if(n==0) return 1;
		else return 2*poweroftwo(n-1);
	}

}
