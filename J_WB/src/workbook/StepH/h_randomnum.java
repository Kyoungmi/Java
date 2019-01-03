package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class h_randomnum {
	private int number;
	private int answer;
	private int count=0;

	public h_randomnum() {input();}

	private void input() {
		Random generator = new Random();
		this.answer = generator.nextInt(100) + 1;
	}
	
	public void printnum() {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요 ");
		this.number = s.nextInt();
		if(number>answer) {
			System.out.println("좀 더 작은 수입니다.");
			count++;}
		else if(number<answer){
			System.out.println("좀 더 큰 수입니다.");
			count++;}
		else if(number == answer) {
			count++;
			System.out.printf("%d번만에 숫자를 맞추셨습니다.", count);
			break;
		}
		}
		
	}
	
}
