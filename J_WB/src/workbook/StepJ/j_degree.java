package workbook.StepJ;

import java.util.Scanner;

public class j_degree {

	private double input_degree;
	private double[] degree = new double[10];
	private byte sel;
	private int[] count = new int[4];
	private String[] s = {"냉수", "미온수", "온수", "끓는물"};
	
	public j_degree() {input();}

	private void input() {
		int i=0;
		Scanner s = new Scanner(System.in);
		while(i<10) {
		System.out.printf("%d번 물의 온도를 입력하세요 ", i+1);
		input_degree = s.nextDouble();
		if(input_degree<0) {System.out.println("잘못입력하셨습니다."); continue;}
		sel = AskWater(input_degree);
		if(sel==0) count[0]++;
		else if(sel==1) count[1]++;
		else if(sel==2) count[2]++;
		else if(sel==3) count[3]++;
		degree[i] = input_degree;
		i++;
	}
	
}

	private byte AskWater(double degree) {
		if(input_degree<25) return 0;
		else if(input_degree<40) return 1;
		else if(input_degree<80) return 2;
		else return 3;
		
	}
	
	public void printdegree() {
		for(int i =0; i<10; i++)
			System.out.printf("%d번 물의 온도는 %f도 입니다.\n", i+1, degree[i]);
		for(int i = 0; i<4; i++)
			System.out.printf("%s 입력 횟수는 %d 입니다.\n", s[i], count[i]);
	}
}