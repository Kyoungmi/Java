package workbook.StepF;

import java.util.Scanner;

public class f_apartment2 {

	private int number[][] = new int[5][3];
	private int total=0, ho=0;
	private int floor_total[] = new int[5];
	private int line_total[] = new int[3];
	
	public f_apartment2() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++) {
		for(int j=0; j<3; j++) {
			System.out.printf("%d호에 살고 있는 사람의 숫자를 입력하시오. ", (i+1)*100+j+1);
			this.number[i][j]=s.nextInt();
		}
		}
	}
	
	int[] getfloor() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
			floor_total[i] += this.number[i][j] ;
			}
		}
		return this.floor_total;
	}
	
	int[] getline() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				line_total[i] += this.number[j][i] ; 
			}
		}
		return this.line_total;
	}
	

	
	public void printapt() {
		int total=0;
		this.floor_total = getfloor();
		this.line_total = getline();
		for(int i=0; i<5; i++)
			System.out.printf("%d층에 사는 거주자는 모두 %d명 입니다.\n", i+1, floor_total[i]);
		System.out.print("\n");
		for(int j=0; j<3; j++) {
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명 입니다.\n", j+1, line_total[j]);
			total += line_total[j];
		}
		System.out.print("\n");
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.\n", total);

	}
}