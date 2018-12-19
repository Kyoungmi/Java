package workbook.StepB;

import java.util.Scanner;

public class b_degree {

	private double input_degree;
	private double output_degree;
	private String kind;
	
	public b_degree(){input();}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("온도를 입력하세요 ");
		this.input_degree = s.nextDouble();
		System.out.printf("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요. ");
		this.kind = s.next();
	}
	
	double getdegree() {
		if(kind.equalsIgnoreCase("C"))
			output_degree = input_degree * 1.8 + 32;
		else if(kind.equalsIgnoreCase("F"))
			output_degree = (input_degree - 32) / 1.8;
		return this.output_degree;
	}	

	public void printdegree() {
		System.out.printf("변화된 온도는 %f 입니다. ", getdegree());
		
	}
}
