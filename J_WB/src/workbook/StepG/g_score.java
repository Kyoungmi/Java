package workbook.StepG;

import java.util.Scanner;

public class g_score {
	private int jumsu[][] = new int [5][3];
	private int sum1[] = new int[3];
	private int sum2[] = new int[5];
	private double c_average[] = new double[3];
	private String[] class_name = {"국어", "영어", "수학"};
	private char grade;

	public g_score(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i =0; i<5; i++) {
		System.out.printf("%d번 학생의 국어, 영어, 수학 점수는? ", i+1);
		this.jumsu[i][0] = s.nextInt();
		this.jumsu[i][1] = s.nextInt();
		this.jumsu[i][2] = s.nextInt();
		}
	}
	int[] getsum() {
		for(int i=0; i<3; i++) {
		for(int j =0; j<5; j++)
			sum1[i] += jumsu[j][i];
	}
		return this.sum1;
	}
	double[] getave(int[] sum) {
		for(int i=0; i<3; i++)
			c_average[i] = sum[i] / 5.0;
		
		return this.c_average;
	}
	char getgrade(double ave) {
		if(ave>=90) grade = 'A';
		else if(ave>=80 && ave<90) grade = 'B';
		else if(ave>=70 && ave<80) grade = 'C';
		else if(ave>=60 && ave<70) grade = 'D';
		else if(ave<60) grade = 'F';
		return this.grade;
	}
	
	public void printscore1() {
		sum1 = getsum();
		c_average = getave(sum1);
		System.out.println("1) 각 과목별 총점과 평균 점수");
		for(int i=0; i<3; i++)
			System.out.printf("%s 과목 총점은 %d 평균은 %f 입니다.\n", class_name[i], sum1[i], c_average[i]);
	}

	public void printscore2() {
		System.out.println("2) 각 학생별 총점과 평균 점수");
		for(int i=0; i<5; i++) {
			for(int j =0; j<3; j++) {
				this.sum2[i] += jumsu[i][j];}
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %f 등급 %c\n", i+1, sum2[i], sum2[i]/3.0, getgrade(sum2[i]/3.0));
		}
		}
}
