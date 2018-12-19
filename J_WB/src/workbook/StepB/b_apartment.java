package workbook.StepB;

import java.util.Scanner;

public class b_apartment {

	private double m2_area;
	private double pyung_area;
	
	public b_apartment(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트 분양 면적 입력하시오. ");
		this.m2_area = s.nextDouble();
	}	
	
	double getarea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
	
	public void printP_area() {
		if(getarea()<30)
			System.out.printf("아파트의 평형은 %f이고,\n30평 미만이므로 작은 아파트입니다.", getarea());
		else
			System.out.printf("아파트의 평형은 %f이고,\n30평 이상이므로 큰 아파트입니다.", getarea());
		
	}

}
