package workbook.StepE;

import java.util.Scanner;

public class StepEManager {

	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 정사각형 출력하기\n");
			printf("2. 우직각 삼각형 출력하기\n");
			printf("3. 이등변 삼각형 출력하기\n");
			printf("4. 홀수,짝수 구구단 출력\n");
			printf("5. 구구단 열맞춰 출력\n");
			printf("6. 2차원 숫자 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				e_square sq = new e_square();
				sq.printsqu();
				break;
			case 2:
				e_triangle1 t1 = new e_triangle1();
				t1.printtri();
				break;
			case 3:
				e_triangle2 t2 = new e_triangle2();
				t2.printtri2();
				break;
			case 4:
				e_googoo dan = new e_googoo();
				break;
			case 5:
				e_googoo2 dan2 = new e_googoo2();
				break;
			case 6:
			    e_2nd nd = new e_2nd();
				nd.printrowcol();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}