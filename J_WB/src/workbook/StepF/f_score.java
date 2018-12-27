package workbook.StepF;

import java.util.Scanner;

public class f_score {


	private double[] score= new double[10];
	private double maxscore, minscore;
	private double total, average;
	private double newnum;
	
	public f_score() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=1; i<=10; i++) {
		System.out.printf("%d번 심사점수를 입력하시오. ", i);
		newnum = s.nextDouble();
		this.score[i-1] = newnum;
		}
	}
	
	private double getmax() {
		this.maxscore = this.score[0];
		for(int i=1; i<10; i++) {
			if(maxscore<this.score[i]) maxscore = score[i];
		}
		return this.maxscore;
	}
	

	private double getmin() {
		this.minscore = this.score[0];
		for(int i=1; i<10; i++) {
			if(minscore>this.score[i]) minscore = score[i];
		}
		return this.minscore;
	}

	double gettotal() {
		for(int i=0; i<10; i++) {
			if(score[i]!=getmax() && score[i]!=getmin())
			total += score[i];
		}
		return this.total;
	}
	public void printave() {
		System.out.printf("%f, %f\n", getmax(), getmin());
		System.out.printf("가장 큰 수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.2f입니다.\n", gettotal()/8);

		}
	}