package workbook.StepG;

import java.util.Scanner;

public class g_apartment {
	private int kind;
	private int charge;
	private int total=0;
	
	public g_apartment() {input();}

	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("부동산 거래종류(1:매매, 2:임대, 0:계산종료)를 입력하세요 : ");
			this.kind = s.nextInt();
			if(kind==1) {charge =getmaemae();
			System.out.printf("이에 대한 중개 수수료는 %d원 입니다.\n", charge);
			total += charge;}
			else if(kind==2) {charge = getimdae();
			System.out.printf("이에 대한 중개 수수료는 %d원 입니다.\n", charge);
			total += charge;}
			else if(kind==0) {printtotal(); break;}
		}
	}
	public void printtotal() {
		System.out.printf("지금까지의 수수료 총액은 %d원 입니다. ", total);
		
	}

	private int getimdae() {
		int money;
		Scanner s = new Scanner(System.in);
		System.out.print("부동산 거래금액(원)을 입력하세요 : ");
		money = s.nextInt();
		if(money<20000000) {
			charge = money/1000 * 5;
			if(charge > 70000) charge = 70000;
		}
		else if(money<50000000) {
			charge = money/1000 * 5;
			if(charge>200000) charge = 200000;
		}
		else if(money<100000000) {
			charge = money/1000 * 4;
			if(charge>300000) charge = 300000;
		}
		else if(money>=100000000)
			charge = money/1000 * 3;
		
		return this.charge;
	}

	private int getmaemae() {
		int money;
		Scanner s = new Scanner(System.in);
		System.out.print("부동산 거래금액(원)을 입력하세요 : ");
		money = s.nextInt();
		if(money<50000000) {
			charge = money/1000 * 6;
			if(charge > 250000) charge = 250000;
		}
		else if(money<200000000) {
			charge = money/1000 * 5;
			if(charge > 800000) charge = 800000;
		}
		else if(money>=200000000)
			charge = money/1000 * 4;
				
		return this.charge;
		
		
	}

		

}
