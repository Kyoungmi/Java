package workbook.StepH;

import java.util.Scanner;

public class StepHManager {

	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 숫자 알아 맞추기\n");
			printf("2. 로또 번호 만들기\n");
			printf("3. 로또 번호 당첨 확인하기\n");
			printf("4. 가위바위보 게임하기\n");
			printf("5. 슬롯머신 만들기\n");
			printf("6. 5개의 숫자의 제곱수 조합 구하기\n");
			printf("7. 문자의 개수와 나누어 출력하기\n");
			printf("8. 문자열 바꾸기\n");
			printf("9. 사용자 정보 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				h_randomnum ran = new h_randomnum();
				ran.printnum();
				break;
			case 2:
				h_lottonum lo = new h_lottonum();
				break;
			case 3:
				h_lottonum2 lo2 = new h_lottonum2();
				lo2.printlotto();
				break;
			case 4:
				h_RockPaperScissors rps = new h_RockPaperScissors();
				rps.printwin();
				break;
			case 5:
				h_slot sl = new h_slot();
				break;
			case 6:
			    h_power po = new h_power();
				po.printmaxmin();
			    break;
			case 7:
			    h_String st = new h_String();
				break;
			case 8:
			    h_String2 st2 = new h_String2();
				break;
			case 9:
			    h_userlist ul = new h_userlist();
				break;
			}
			
		}
		
	}
	void printf(String s){System.out.print(s);} 
	}

