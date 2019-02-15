package workbook.StepL;

import java.util.Scanner;

public class StepLManager {

	public StepLManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");
			printf("2. 주차장 입출력 관리\n");
			printf("3. 식당 주문 관리\n");
			printf("4. 학생 정보 관리\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				L01 l1 = new L01();
				break;
			case 2:
				L02 l2= new L02();
				break;
			case 3:
				L03 l3 = new L03();
				break;
			case 4:
				L04 l4 = new L04();
				break;
			}
			
		}
		
	}
	void printf(String s){System.out.print(s);} 
	}
