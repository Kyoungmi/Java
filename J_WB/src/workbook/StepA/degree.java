package workbook.StepA;

import java.util.Scanner;

public class degree {
	
	private double c_degree;
	private double f_degree;
	
	public degree(){input();}
	public void printdegree() {
		System.out.printf("화씨 온도는 %f입니다.\n", getdegree());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("섭씨 온도를 입력하세요 ");
		this.c_degree = s.nextDouble();
	}	
	double getdegree() {
		f_degree = c_degree * 1.8 + 32;
		return this.f_degree;
	}	


}
