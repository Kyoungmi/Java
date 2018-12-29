package workbook.StepG;

import java.util.Scanner;

public class g_shoppingmall {

	private int order[] = {0,0,0};
	private int price[] = {10000, 6000, 3000};
	private int sale;
	private int total_order[] = {0,0,0};
	private int total_sale;
	
	public g_shoppingmall() {input();}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("세 종류의 제품이 있습니다. \n");
		System.out.print("(1. 가죽장갑 1만원. 2. 털장갑 6천원. 3. 비닐장갑 3천원) \n\n");
		while(true) {	
		for(int i =0; i<3; i++) {
			System.out.printf("%d번 제품은 몇개를 구입하실래요? ", i+1);
			order[i] = s.nextInt();
			total_order[i] += order[i];
			}
		if(order[0]==0 && order[1]==0 && order[2]==0) {printall(); break;}
		sale = getprice();
		System.out.printf("판매금액은 %d원 입니다.\n\n", sale);
		total_sale += sale;
		}
	}

	
	private int getprice() {
		int getprice =0;
		for(int i =0; i<3; i++) {
			getprice += order[i] * price[i];
		}
		return getprice;
	}

	public void printall() {
		System.out.printf("지금까지의 총 매출금액은 %d원 입니다. \n", total_sale);
		
	}
	
	
}
