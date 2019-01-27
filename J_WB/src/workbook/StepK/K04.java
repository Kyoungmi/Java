package workbook.StepK;

import java.util.Scanner;

public class K04 {
	public static void main() {
		Scanner s = new Scanner(System.in);
		System.out.print("몇 개의 좌표를 입력하겠습니까?");
		int usercount = s.nextInt();
		point user = new point();
		for(int i =0; i<usercount; i++) {
			user.input(i);
		}
		
		user.print(usercount);
		
		user.printall();
		
	}
}
