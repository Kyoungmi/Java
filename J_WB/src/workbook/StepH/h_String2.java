package workbook.StepH;

import java.util.Scanner;

public class h_String2 {

	private String input;
	private String findStr, replaceStr;

	public h_String2() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("문자열을 입력하세요 (x: 종료) : ");
		input = s.nextLine();
		if(input.equalsIgnoreCase("x")) {
			System.out.println("종료되었습니다.\n");
			break; 
		}
		System.out.print("찾을 문자열을 입력하세요 : ");
		findStr = s.nextLine();
		System.out.print("바꿀 문자열을 입력하세요 : ");
		replaceStr = s.nextLine();
		int count=0, j=0, k=0;
		for(int i =0; i<input.length(); i++) {
			j = input.indexOf(findStr, i);
			if(j!=k)count++;
			k=j;}
		System.out.printf("=> 총 %d번 바뀌었습니다.\n", count);
		System.out.printf("%s\n", input.replace(findStr, replaceStr));
	}
	}
	
	
}