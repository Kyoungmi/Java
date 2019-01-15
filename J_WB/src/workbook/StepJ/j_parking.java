package workbook.StepJ;

import java.util.Scanner;

public class j_parking {
	private int hour1, min1, hour2, min2;
	private int fee, total = 0;
	private String str;
	
	public j_parking() {input();}

	private void input() {
		int i =0;
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.printf("%d번 차량 주차 시작 시각 (시 분) ", i+1);
		this.hour1 = s.nextInt();
		this.min1 = s.nextInt();
		System.out.printf("%d번 차량 주차 종료 시각 (시 분) ", i+1);
		this.hour2 = s.nextInt();
		this.min2 = s.nextInt();
		fee = CalcParking(hour1, min1, hour2, min2);
		System.out.printf("주차요금 : %d\n", fee);
		total += fee;
		System.out.print("더 입력하시겠습니까? ");
		this.str = s.next();
		if(str.equalsIgnoreCase("Y")) i++;
		else break;
		}
		System.out.printf("주차차량 %d대의 총 주차 요금은 %d원 입니다.\n", i+1, total);
	}

	private int CalcParking(int start_h, int start_m, int end_h, int end_m) {
		int price, count1, count2 = 0;
		count1 = start_h * 60 + start_m;
		count2 = end_h * 60 + end_m;
		price = count2 - count1;
		if(price % 10 != 0 ) price = (price / 10) * 500 + 500;
		else  price = (price / 10) * 500;
		return price;
	}
	

}
