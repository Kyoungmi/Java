package workbook.StepF;

import java.util.Scanner;

public class f_score2 {

	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double average[] = new double[3];
	private int kor, eng, mat;
	
	public f_score2() {input();}

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
		for(int j=0; j<3; j++) {
		for(int i=0; i<5; i++) {
			sum[j] += jumsu[i][j] ;
			}
		}
		return this.sum;
	}
	
	
	double[] getave() {
		for(int i=0; i<3; i++) 
			this.average[i] = this.sum[i] / 5.0;
		return this.average;
	}
	
	public void printall() {
		this.sum = getsum();
		this.average = getave();
		System.out.printf("국어의 총점은 %d 이고, 평균은 %f 입니다.\n", this.sum[0], average[0]);
		System.out.printf("영어의 총점은 %d 이고, 평균은 %f 입니다.\n", this.sum[1], average[1]);
		System.out.printf("수학의 총점은 %d 이고, 평균은 %f 입니다.\n", this.sum[2], average[2]);
	}
}
