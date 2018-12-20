package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
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
			printf("8. 최대 최소 구하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				c_YearToAge yta = new c_YearToAge();
				yta.printAge();
				break;
			case 2:
				c_degree cf = new c_degree();
				cf.printdegree();
				break;
			case 3:
				c_rectangle rec = new c_rectangle();
				rec.printarea();
				break;
			case 4:
				c_apartment apt = new c_apartment();
				apt.printP_area();
				break;
			case 5:
				c_DaysToSeconds dts = new c_DaysToSeconds();
				dts.printdays();
				break;
			case 6:
			    c_Score sc = new c_Score();
				sc.printscore();
				break;
			case 7:
				c_Bytes bt = new c_Bytes();
				bt.printbytes();
				break;
			case 8:
				c_greatest gt = new c_greatest();
				gt.printgreatest();
				break;
			case 9:
				c_tax ta = new c_tax();
				ta.printtax();
				break;
			case 10:
				c_operator op = new c_operator();
				op.printresult();
				break;
			case 11:
				c_yoon_year yy = new c_yoon_year();
				yy.printyoon();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}

