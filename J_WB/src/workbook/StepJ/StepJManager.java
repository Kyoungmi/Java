package workbook.StepJ;

import java.util.Scanner;

public class StepJManager {

	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 및 연령대 판정\n");
			printf("2. 심사점수 계산\n");
			printf("3. 물의 온도 구간 개수 판정\n");
			printf("4. 연중 날짜 계산 및 날짜 간격 세기\n");
			printf("5. 주차 관리 시스템\n");
			printf("6. 피보나치 수 구하기\n");
			printf("7. 2의 제곱수 구하기\n");
			printf("8. Ackermann 수 구하기\n");
			printf("9. pow() 메소드 만들기\n");
			printf("10. 피보나치 황금비율 구하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				j_YearToAge yta = new j_YearToAge();
				yta.printage();
				break;
			case 2:
				j_score sc = new j_score();
				break;
			case 3:
				j_degree de = new j_degree();
				de.printdegree();
				break;
			case 4:
				j_countday cd = new j_countday();
				cd.printday();
				break;
			case 5:
				j_parking pa = new j_parking();
				break;
			case 6:
			    j_FiboNum fn = new j_FiboNum();
				break;
			case 7:
			    j_power po = new j_power();
				break;
			case 8:
				j_Acker ac = new j_Acker();
				break;
			case 9:
				j_power2 p2 = new j_power2();
				break;
			case 10:
				j_FiboNum2 fn2 = new j_FiboNum2();
				break;
			}
			
		}
		
	}
	void printf(String s){System.out.print(s);} 
	}