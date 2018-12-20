package workbook.StepC;

import java.util.Scanner;

public class c_apartment {

	private double m2_area;
	private double pyung_area;
	
	public c_apartment(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트 분양 면적(제곱미터)을 입력하시오. ");
		this.m2_area = s.nextDouble();
	}	
	
	double getarea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
	
	public void printP_area() {
		if(getarea()<15)
			System.out.printf("아파트의 평형은 %f입니다.\n소형 아파트입니다.", getarea());
		else if(getarea()<30)
			System.out.printf("아파트의 평형은 %f입니다.\n중소형 아파트입니다.", getarea());
		else if(getarea()<50)
			System.out.printf("아파트의 평형은 %f입니다.\n중형 아파트입니다.", getarea());
		else if(getarea()>=50)
			System.out.printf("아파트의 평형은 %f입니다.\n대형 아파트입니다.", getarea());
	}

}
