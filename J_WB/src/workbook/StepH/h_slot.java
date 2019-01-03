package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class h_slot {
	private int coins;
	private int number[] = new int[3];
	
	public h_slot() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("사용하실 코인의 개수를 입력하세요. ");
		this.coins = s.nextInt();
		int i = 1;
		while(true){
		int count=0;
		System.out.printf("게임 %d회 Start!!! (아무 숫자나 입력하세요) ", i);
		int dummy = s.nextInt();
		Random generator = new Random();
		for(int j=0; j<3; j++)
			number[j] = generator.nextInt(9)+1;
		System.out.printf("게임 결과 : %d %d %d ", number[0], number[1], number[2]);
		for(int j=0; j<3; j++)
			for(int k =0; k<j; k++)
				if(number[j]==number[k]) count++;
		if(count==0)System.out.println("----> 꽝입니다.. 아쉽군요");
		if(count==1){System.out.println("----> 숫자 2개 일치.. 코인 2개 증정"); coins+=2;}
		if(count>1){System.out.println("----> 숫자 3개 일치.. 코인 4개 증정"); coins+=4;}
		coins--;
		System.out.printf("남아있는 코인은 %d개 입니다.\n", coins);
		i++;
		if(coins==0) {System.out.println("게임종료!!");break;}
		}
		
		}
}
