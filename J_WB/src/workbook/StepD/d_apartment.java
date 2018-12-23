package workbook.StepD;

import java.util.Scanner;

public class d_apartment {
	private double m2_area, pyung_area;
	private int count1=0, count2=0, count3=0, count4=0;
	private int i;
	
	public d_apartment() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		for(i=0; i<10; i++){
		System.out.print("아파트 분양 면적(제곱미터)을 입력하시오. ");
		this.m2_area = s.nextDouble();
		this.pyung_area = m2_area / 3.305;
		System.out.printf("--> 이 아파트의 평형은 %f 입니다.\n", pyung_area);
		if(pyung_area<15) this.count1++;
		else if(pyung_area<30) this.count2++;
		else if(pyung_area<50) this.count3++;
		else if(pyung_area>=50) this.count4++;
		}
	
	}
	
	public void printapt() {
		System.out.printf("\"소형 아파트\"의 개수는 %d 입니다.\n", count1);
		System.out.printf("\"중소형 아파트\"의 개수는 %d 입니다.\n", count2);
		System.out.printf("\"중형 아파트\"의 개수는 %d 입니다.\n", count3);
		System.out.printf("\"대형 아파트\"의 개수는 %d 입니다.\n", count4);
	}
}