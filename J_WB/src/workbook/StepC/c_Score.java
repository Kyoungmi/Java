package workbook.StepC;

import java.util.Scanner;

public class c_Score {

	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public c_Score(){input();}
	
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
		if(getave()>=90)
			System.out.println("수 입니다.");
		else if(getave()>=80 && getave()<90)
			System.out.println("우 입니다.");
		else if(getave()>=70 && getave()<80)
			System.out.println("미 입니다.");
		else if(getave()>=60 && getave()<70)
			System.out.println("양 입니다.");
		else if(getave()<60)
			System.out.println("가 입니다.");
	}
}
