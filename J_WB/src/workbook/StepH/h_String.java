package workbook.StepH;

import java.util.Scanner;

public class h_String {
	private String input;

	public h_String() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("문자열을 입력하세요 (x: 종료) : ");
		input = s.next();
		if(input.equalsIgnoreCase("x")) {
			System.out.println("종료되었습니다.\n");
			break; 
		}
		System.out.printf("문자열의 개수는 %d개 입니다.\n", input.length());
		for(int i =0; i<input.length(); i++)
			System.out.printf("%c\n", input.charAt(i));
	}
	}

}
