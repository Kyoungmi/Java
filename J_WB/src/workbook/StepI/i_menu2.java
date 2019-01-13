package workbook.StepI;

import java.util.Scanner;

public class i_menu2 {
	private int menu_num;
	private int price;
	private int get_price;
	private int total=0;

	public i_menu2() {MainMenu();}
	
	private void MainMenu() {
		while(true) {
		get_price = SelectMenu();
		total += get_price;
		System.out.printf("현재까지의 주문 금액은 %d원 입니다. \n", total);
		if(get_price == 0) break;
		}
		System.out.printf("총 주문 금액은 %d원 입니다. \n", total);
	}

	private int SelectMenu() {
		Scanner s = new Scanner(System.in);
		System.out.println("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)");
		System.out.print("메뉴를 선택해주세요.(종료 : 5) ");
		this.menu_num = s.nextInt();
		if(menu_num == 1) price = 15000;
		else if(menu_num == 2) price = 10000;
		else if(menu_num == 3) price = 7000;
		else if(menu_num == 4) price = 2000;
		else if(menu_num == 5) price = 0;
		return price;
		
	}
}
