package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
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
				YearToAge yta = new YearToAge();
				yta.printAge();
				break;
			case 2:
				degree cf = new degree();
				cf.printdegree();
				break;
			case 3:
				rectangle rec = new rectangle();
				rec.printarea();
				break;
			case 4:
				apartment apt = new apartment();
				apt.printP_area();
				break;
			case 5:
				DaysToSeconds dts = new DaysToSeconds();
				dts.printSeconds();
				break;
			case 6:
				Score sc = new Score();
				sc.printscore();
				break;
			case 7:
				Bytes bt = new Bytes();
				bt.printbytes();
				break;
			
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}