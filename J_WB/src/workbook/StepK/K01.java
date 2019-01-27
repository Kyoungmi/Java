package workbook.StepK;

import java.util.Scanner;

class MenuPan {
	private String[] s1 = {"메뉴번호", "메뉴이름", "원산지", "1인분가격"};
	private int[] num = new int[5];
	private String[] name = new String[5];
	private String[] origin = new String[5];
	private int[] price = new int[5];
	
	void input(int num) {
		Scanner s = new Scanner(System.in);
		System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오. ");
		this.num[num] = s.nextInt();
		this.name[num] = s.next();
		this.origin[num] = s.next();
		this.price[num] = s.nextInt();
	}
	
	void print(int num) {
		for(int i =0; i<4; i++)
		System.out.printf("%-7s", s1[i]);
		System.out.print("\n");
		for(int i =0; i<num; i++)
			System.out.printf("%-8s%-8s%-8s%-8s\n", this.num[i], this.name[i], this.origin[i], this.price[i]);
	}
	
}

public class K01 {

	public static void main() {
		MenuPan user = new MenuPan();
		user.input(0);
		user.print(1);
	}
}
