package workbook.StepK;

import java.util.Scanner;

public class K06 {

	public static void main() {
		Scanner s = new Scanner(System.in);
		UserInfo user = new UserInfo();
		System.out.print("등록할 학생의 명수는? ");
		int count = s.nextInt();
		for(int i =0; i<count; i++) {
			user.input(i);
		}
		 	user.print(count);
	}
}
