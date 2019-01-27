package workbook.StepK;

import java.util.Scanner;

public class K02 {

	public static void main() {
		Scanner s = new Scanner(System.in);
		MenuPan user = new MenuPan();
		System.out.print("등록하실 메뉴의 개수를 입력하세요 : ");
		int count = s.nextInt();
		for(int i =0; i<count; i++) {
			System.out.printf("%d번", i+1);
			user.input(i);
		}
		 	user.print(count);
	}
}
