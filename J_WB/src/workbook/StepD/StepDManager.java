package workbook.StepD;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 숫자 더하기\n");
			printf("2. 큰 수 작은 수 구하기\n");
			printf("3. 총합계와 평균 값 구하기\n");
			printf("4. 미성년자 숫자 세기\n");
			printf("5. 직사각형 형태 개수 세기\n");
			printf("6. 아파트 평형 계산 및 종류 판정\n");
			printf("7. 1차 메소드의 좌표 구하기\n");
			printf("8. 2치 메소드의 좌표 구하기\n");
			printf("9. 원하는 구구단의 단 출력하기\n");
			printf("10. 두 수의 배타적 배수 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				d_sum su = new d_sum();
				su.printsum();
				break;
			case 2:
				d_greatest gt = new d_greatest();
				gt.printmax();
				break;
			case 3:
				d_total tt = new d_total();
				tt.printtotal();
				break;
			case 4:
				d_count co = new d_count();
				co.printyoung();
				break;
			case 5:
				d_rectangle rec = new d_rectangle();
				rec.printrec();
				break;
			case 6:
			    d_apartment ap = new d_apartment();
				ap.printapt();
				break;
			case 7:
				d_1st d1 = new d_1st();
				d1.print1st();
				break;
			case 8:
				d_2nd d2 = new d_2nd();
				d2.print2nd();
				break;
			case 9:
				d_googoo dan = new d_googoo();
				dan.printdan();
				break;
			case 10:
				d_notcommon nc = new d_notcommon();
				nc.printnotcom();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}

