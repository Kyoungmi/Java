package workbook.StepF;

import java.util.Scanner;

public class f_apartment {

	private int number[][] = new int[5][3];
	private int newnum, total=0, ho;
	
	public f_apartment() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++) {
		for(int j=0; j<3; j++) {
			System.out.printf("%d호에 살고 있는 사람의 숫자를 입력하시오. ", (i+1)*100+j+1);
			this.number[i][j]=s.nextInt();
		}
		}
	}
	
	int gettotal() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
			total += number[i][j] ;
			}
		}
		return this.total;
	}
	

	
	public void printapt() {
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.\n", gettotal());

	}
}

