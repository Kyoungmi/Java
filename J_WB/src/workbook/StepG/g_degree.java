package workbook.StepG;

import java.util.Scanner;

public class g_degree {
	private double input_degree;
	private double degrees[] = new double[10];
	private int[] count = {0,0,0,0};
	private String str[] = new String[10];
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};

	public g_degree(){input();}

	void input() {
		int i=0;
		Scanner s = new Scanner(System.in);
		while(i<10) {
		System.out.printf("%d번 물의 온도를 입력하세요 ", i+1);
		input_degree = s.nextDouble();
		
		if(input_degree<0) {System.out.println("잘못입력하셨습니다."); continue;}
		else if(input_degree<25)
			{count[0]++; str[i] = "냉수";}
		else if(input_degree<40)
			{count[1]++; str[i] = "미온수";}
		else if(input_degree<80)
			{count[2]++; str[i] = "온수";}
		else if(input_degree>=80)
			{count[3]++; str[i] = "끓는물";}
		
		this.degrees[i]=input_degree;
		i++;
		}
	}
	
	public void printdegree() {
		for(int i =0; i<10; i++)
			System.out.printf("%d번 물의 온도는 %f도 입니다. %s\n", i+1, degrees[i], str[i]);
		for(int i=0; i<4; i++)
			System.out.printf("%s 입력 횟수 : %d\n", degree_name[i], count[i]);
	}
}
