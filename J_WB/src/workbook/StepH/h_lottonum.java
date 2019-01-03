package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class h_lottonum {

	private int[] lotto = new int[6];
	private String onemore;

	public h_lottonum() {input();}

	private void input() {
		Random generator = new Random();
		Scanner s = new Scanner(System.in);
		while(true) {
		for(int count=0; count<6; count++)
		this.lotto[count] = generator.nextInt(45) + 1;
		System.out.print("생성된 로또 번호는");
		for(int count=0; count<6; count++)
			System.out.printf("%d ", lotto[count]);
		System.out.print("입니다.\n더 만드시겠습니까? (Y/N) ");
		this.onemore = s.next();
		if(onemore.equalsIgnoreCase("Y")) input();
		else if(onemore.equalsIgnoreCase("N")) break;
		
	}
	}
	
	
}
