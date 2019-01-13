package workbook.StepI;

import java.util.Scanner;

public class i_bmi {
	private int height, weight;

	public i_bmi() {input();}

	private void input() {
		int i = 1;
		while(i<11) {
		Scanner s = new Scanner(System.in);
		System.out.printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하시오. ", i);
		this.height = s.nextInt();
		this.weight = s.nextInt();
		AskBmian(height, weight);
		i++;
		}
	}

	private void AskBmian(int height, int weight) {
		double bmi;
		double height2 = height * 0.01;
		bmi = weight / (height2*height2) ;
		if(bmi<18.5) System.out.println("저체중 입니다.");
		else if(bmi<23) System.out.println("정상제중 입니다.");
		else if(bmi<25) System.out.println("과체중 입니다.");
		else if(bmi<30) System.out.println("경도비만 입니다.");
		else if(bmi>=30) System.out.println("고도비만 입니다.");
	}
	
}
