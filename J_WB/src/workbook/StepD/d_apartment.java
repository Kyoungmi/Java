package workbook.StepD;

import java.util.Scanner;

public class d_apartment {
	String title[] = {"소형", "중소형", "중형", "대형"};
	private double m2_area, pyung_area;
	private int[] count = new int[4];
	
	public d_apartment() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++){
		System.out.print("아파트 분양 면적(제곱미터)을 입력하시오. ");
		this.m2_area = s.nextDouble();
		this.pyung_area = m2_area / 3.305;
		System.out.printf("--> 이 아파트의 평형은 %f 입니다.\n", pyung_area);
		if(pyung_area<15) this.count[0]++;
		else if(pyung_area<30) this.count[1]++;
		else if(pyung_area<50) this.count[2]++;
		else if(pyung_area>=50) this.count[3]++;
		}
	
	}
	
	public void printapt() {
		for(int i=0; i<4; i++)
		System.out.printf("\"%s 아파트\"의 개수는 %d 입니다.\n", title[i], this.count[i]);
	}
}