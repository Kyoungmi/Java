package workbook.StepB;

import java.util.Scanner;

public class b_Score {
	
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	private String s;
	
	public b_Score(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("국어 점수 입력하시오. ");
		this.kor = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.printf("영어 점수 입력하시오. ");
		this.eng = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.printf("수학 점수 입력하시오. ");
		this.math = s2.nextInt();
	}	
	int gettotal() {
		total = kor + eng + math;
		return this.total;
	}	
	double getave() {
		average = total / 3.0;
		return this.average;
	}

	public void printscore() {
		System.out.printf("입력하신 점수의 총점은 %d이고,\n", gettotal());
		System.out.printf("평균은 %f 입니다.\n", getave());
		if(kor>90)
			System.out.println("국어점수가 우수합니다.");
		if(eng>90)
			System.out.println("영어점수가 우수합니다.");
		if(math>90)
			System.out.println("수학점수가 우수합니다.");
	}

}
