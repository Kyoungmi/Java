package workbook.StepF;

import java.util.Scanner;

public class f_score3 {

	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[5];
	private double average[] = new double[5];
	private int kor, eng, mat;
	
	public f_score3() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++) {
		System.out.printf("%d번 학생 국어, 영어, 수학 점수를 입력하시오. ", i+1);
		for(int j=0; j<3; j++) {
			this.jumsu[i][j]=s.nextInt();
		}
		}
	}
	
	int[] getsum() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
			sum[i] += jumsu[i][j] ;
			}
		}
		return this.sum;
	}
	
	
	double[] getave() {
		for(int i=0; i<5; i++) 
			this.average[i] = this.sum[i] / 3.0;
		return this.average;
	}
	
	public void printall() {
		this.sum = getsum();
		this.average = getave();
		for(int i=0; i<5; i++) 
		System.out.printf("%d번 학생의 총점은 %d이고, 평균은 %f 입니다.\n", i+1, this.sum[i], average[i]);

	}
}

