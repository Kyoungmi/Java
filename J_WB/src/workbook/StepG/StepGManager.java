package workbook.StepG;

import java.util.Scanner;

public class StepGManager {

	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 국, 영, 수 점수, 등급 계산\n");
			printf("4. 부동산 중개 수수료 계산기\n");
			printf("5. pc방 이용료 계산기\n");
			printf("6. 쇼핑몰 매출 계산기\n");
			printf("7. 놀이공원 매표소 계산기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				g_YearToAge yta = new g_YearToAge();
				yta.printage();
				yta.printcount();
				break;
			case 2:
				g_degree de = new g_degree();
				de.printdegree();
				break;
			case 3:
				g_score sc = new g_score();
				sc.printscore1();
				sc.printscore2();
				break;
			case 4:
				g_apartment apt = new g_apartment();
				break;
			case 5:
				g_pcroom pc = new g_pcroom();
				break;
			case 6:
			    g_shoppingmall sh = new g_shoppingmall();
				break;
			case 7:
			    g_amusement am = new g_amusement();
				am.printall();
				break;
			}
			
		}
		
	}
	void printf(String s){System.out.print(s);} 
	}