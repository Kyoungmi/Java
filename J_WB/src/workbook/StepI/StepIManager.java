package workbook.StepI;

import java.util.Scanner;


public class StepIManager {

	public StepIManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴 출력하기\n");
			printf("2. 문자 입력받아 직각삼각형 출력하기\n");
			printf("3. 비만 판정\n");
			printf("4. 메뉴 번호 받아오는 메소드 만들기\n");
			printf("5. 최댓값 구하기\n");
			printf("6. 랜덤숫자 만들기\n");
			printf("7. 자판기에서 음료 선택하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				i_menu me = new i_menu();
				me.printtotal();
				break;
			case 2:
				i_triangle tr = new i_triangle();
				
				break;
			case 3:
				i_bmi bm = new i_bmi();
				break;
			case 4:
				i_menu2 m2 = new i_menu2();
				break;
			case 5:
				i_greatest gt = new i_greatest();
				break;
			case 6:
			    i_random ra = new i_random();
				break;
			case 7:
			    i_vending vi = new i_vending();
				break;

			}
			
		}
		
	}
	void printf(String s){System.out.print(s);} 
	}