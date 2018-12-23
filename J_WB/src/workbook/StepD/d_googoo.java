package workbook.StepD;

import java.util.Scanner;

public class d_googoo {
	private int dan;
	private int i;
	
	public d_googoo() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2~9). ");
		this.dan = s.nextInt();
		
		if(dan<2 || dan>9)
			System.out.print("잘못 입력하였습니다. \n");
		
		else break;
		}
	}
	
	public void printdan() {

		for(i=1; i<10; i++){
		System.out.printf("%d x %d = %d\n", dan, i, dan*i);

		}
	}
}
