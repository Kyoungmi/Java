package workbook.StepF;

import java.util.Scanner;

public class StepFManager {

public StepFManager() {
	int menu;
	Scanner s = new Scanner(System.in);
	while(true) {
		printf("---------------------\n");
		printf("1. 두 번째로 큰 수 찾기\n");
		printf("2. 심사점수 계산\n");
		printf("3. 국, 영, 수 과목별 총점, 평균값 구하기\n");
		printf("4. 국, 영, 수 사람별 총점, 평균값 구하기\n");
		printf("5. 비만 판정\n");
		printf("6. 5층 아파트 거주자 숫자 구하기\n");
		printf("7. 5층 아파트 층별, 호수별 거주자 숫자 구하기\n");
		printf("8. 겹치기 않는 숫자 10개 입력 받기\n");
		printf("9. 배열을 이용한 연중 날짜 계산\n");
		printf("=>원하는 메뉴는?(0:exit) :");
		menu = s.nextInt();
		if(menu == 0) break;
		switch(menu) {
		case 1: 				
			f_2ndgreat sg = new f_2ndgreat();
			sg.print2nd();
			break;
		case 2:
			f_score sc = new f_score();
			sc.printave();
			break;
		case 3:
			f_score2 s2 = new f_score2();
			s2.printall();
			break;
		case 4:
			f_score3 s3 = new f_score3();
			s3.printall();
			break;
		case 5:
			f_bmi bm = new f_bmi();
			bm.printbmi();
			break;
		case 6:
		    f_apartment apt = new f_apartment();
			apt.printapt();
			break;
		case 7:
		    f_apartment2 apt2 = new f_apartment2();
			apt2.printapt();
			break;
		case 8:
		    f_notcommon nc = new f_notcommon();
			nc.printnum();
			break;
		case 9:
		    f_year ye = new f_year();
			ye.printday();
			break;
		}
		
	}
	
}
void printf(String s){System.out.print(s);} 
}