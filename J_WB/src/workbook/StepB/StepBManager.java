package workbook.StepB;

import java.util.Scanner;

public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산\n");
			printf("2. 온도변환\n");
			printf("3. 직사각형 넓이계산\n");
			printf("4. 아파트 평형 계산\n");
			printf("5. 날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 용량 계산\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				b_YearToAge yta = new b_YearToAge();
				yta.printAge();
				break;
			case 2:
				b_degree cf = new b_degree();
				cf.printdegree();
				break;
			case 3:
				b_rectangle rec = new b_rectangle();
				rec.printarea();
				break;
			case 4:
				b_apartment apt = new b_apartment();
				apt.printP_area();
				break;
			case 5:
				b_DaysToSeconds dts = new b_DaysToSeconds();
				dts.printSeconds();
				break;
			case 6:
				b_Score sc = new b_Score();
				sc.printscore();
				break;
			case 7:
				b_Bytes bt = new b_Bytes();
				bt.printbytes();
				break;
			
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}