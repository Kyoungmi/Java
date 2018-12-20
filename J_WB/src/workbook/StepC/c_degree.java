package workbook.StepC;

import java.util.Scanner;

public class c_degree {

	private double input_degree;
	
	public c_degree(){input();}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("온도를 입력하세요 ");
		this.input_degree = s.nextDouble();
	}
		

	public void printdegree() {
		if(input_degree<0)
			System.out.println("잘못입력하셨습니다.");
		else if(input_degree<25)
			System.out.println("냉수입니다.");
		else if(input_degree<40)
			System.out.println("미온수입니다.");
		else if(input_degree<80)
				System.out.println("온수입니다.");
		else if(input_degree>=80)
			System.out.println("끓는 물입니다.");

	}

}
