package workbook.StepF;

import java.util.Scanner;

public class f_bmi {

	private int bmilist[][] = new int[10][3];
	private double height;
	private int bmi, weight, count=0;
	
	public f_bmi() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++) {
		System.out.printf("%d번 사람의 신장(cm)과 체중(kg)을 입력하시오. ", i+1);
		for(int j=0; j<2; j++) {
			this.bmilist[i][j]=s.nextInt();
		}
		}
	}
	
	int[][] getbmi() {
		for(int i=0; i<10; i++) {
			height = this.bmilist[i][0];
			weight = this.bmilist[i][1];
			height = height * 0.01;
			bmi = (int) (weight / (height * height));
			bmilist[i][2] = bmi;
		}
		return this.bmilist;
	}
	
	void printbmi() {
		for(int i=0; i<10; i++) {
			if(getbmi()[i][2]>=25) {System.out.printf("%d번째 사람은 비만입니다.\n", i+1);
				this.count++; 
				
			}
		}
		System.out.printf("총 %d명의 사람이 비만입니다.\n", this.count);
		
	}
	
}