package workbook.StepI;

import java.util.Scanner;

public class i_vending {
	private int get_price;
	private String onemore;
	private int total;
	
	public i_vending() {input();}

	private void input() {
		int i = 1;
		while(true) {
		get_price = SelectCan();
		Scanner s = new Scanner(System.in);
		System.out.print("더 필요하십니까?(Y/N) ");
		this.onemore = s.next();
		total += get_price;
		if(onemore.equalsIgnoreCase("Y")) {
			i++;
		}
		else if(onemore.equalsIgnoreCase("N")) break;
		}
		System.out.printf("%d개의 음료를 선택하여 총 %d원 입니다.\n", i, total);
	}
	
	private int SelectCan() {
		int menu_num;
		int price=0;
		Scanner s = new Scanner(System.in);
		System.out.println("1. 콜라(700원) 2. 원두커피(300원) 3. 레몬주스(1000원) \n4. 홍차(500원) 5. 코코아(600원)");
		System.out.print("메뉴를 선택해주세요. ");
		menu_num = s.nextInt();
		if(menu_num == 1) price = 700;
		else if(menu_num == 2) price = 300;
		else if(menu_num == 3) price = 1000;
		else if(menu_num == 4) price = 500;
		else if(menu_num == 2) price = 600;
		return price;
	}
	
}
