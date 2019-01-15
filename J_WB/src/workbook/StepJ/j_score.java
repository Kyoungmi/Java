package workbook.StepJ;

import java.util.Scanner;

public class j_score {
	private double[] score= new double[10];
	private double total, average;
	private double newnum;
	private double getmax, getmin;
	
	public j_score() {input();}

	private void input() {
		
		Scanner s = new Scanner(System.in);
		for(int i =0; i<10; i++){
			System.out.printf("%d번 심사점수를 입력하시오. ", i+1);
			newnum = s.nextDouble();
			this.score[i] = newnum;
		}
		getmax = Max(score);
		getmin = Min(score);
		for(int i=0; i<10; i++) {
			if(score[i]!=getmax && score[i]!=getmin)
			total += score[i];
		}
		System.out.printf("가장 큰 수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.2f입니다.\n", total/8);
	}
	
	private double Max(double num[]) {
		double max;
		max = num[0];
		for(int i =1; i<10; i++) {
		if(max<num[i]) max = num[i];
		}
		return max;
	}
	private double Min(double num[]) {
		double min;
		min = num[0];
		for(int i =1; i<10; i++) {
		if(min>num[i]) min = num[i];
		}
		return min;
	}
}
