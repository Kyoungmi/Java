package workbook.StepA;

import java.util.Scanner;

public class apartment {

	private double m2_area;
	private double pyung_area;
	
	public apartment(){input();}
	public void printP_area() {
		System.out.printf("아파트의 평형은 %f입니다.\n", getarea());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트 분양 면적 입력하시오. ");
		this.m2_area = s.nextDouble();
	}	
	double getarea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}	
}
