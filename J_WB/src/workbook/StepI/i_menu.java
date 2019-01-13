package workbook.StepI;

import java.util.Scanner;

public class i_menu {
	private int menu_num;
	private int price;
	private int total;

	public i_menu() {ShowMenu();}
	
	private void ShowMenu() {
		Scanner s = new Scanner(System.in);
		while(menu_num!=5) {
		System.out.println("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)");
		System.out.print("메뉴를 선택해주세요.(종료 : 5) ");
		this.menu_num = s.nextInt();
		if(menu_num == 1) price = 15000;
		else if(menu_num == 2) price = 10000;
		else if(menu_num == 3) price = 7000;
		else if(menu_num == 4) price = 2000;
		else if(menu_num == 5) price = 0;
		total += price;
		System.out.print("현재까지의 주문 금액은 " + total + "원 입니다.\n");
		}
		
	}
	
	public void printtotal() {
		System.out.print("총 주문 금액은 " + total + "원 입니다.\n");
	}
}
