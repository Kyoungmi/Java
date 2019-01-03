package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class h_lottonum2 {

	private int[] lotto_user = new int[6];
	private int[] lotto_com = new int[6];
	private int match_count;;

	public h_lottonum2() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i =0; i<6; i++){
		System.out.printf("원하는 %d번째 로또 숫자를 입력하세요 ", i+1);
		this.lotto_user[i]=s.nextInt();
		
		for(int j =0; j<i; j++)
			if(lotto_user[i]==lotto_user[j]) {
				System.out.println("=>잘못 입력하셨습니다.");
				i--; break;
			}
		if(lotto_user[i]<1 || lotto_user[i]>45) {
			System.out.println("=>잘못 입력하셨습니다.");
			i--;
		}
		
	}
	}
	private int[] getrandom() {
		Random generator = new Random();
		for(int i=0; i<6; i++)
			lotto_com[i] = generator.nextInt(45)+1;
		
		return this.lotto_com;
	}
	
	public void printlotto() {
		lotto_com = getrandom();
		System.out.print("이번 주의 로또 당첨 번호는 ");
		for(int count=0; count<6; count++)
			System.out.printf("%d ", lotto_com[count]);
		System.out.print("입니다.\n");
		for(int i=0; i<6; i++) {
			if(lotto_com[i]==lotto_user[i]) match_count++;
		}
		System.out.printf("일치하는 로또 번호는 %d개 입니다.\n", match_count);
	}
	
}