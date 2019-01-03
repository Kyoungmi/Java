package workbook.StepH;

import java.util.Scanner;

public class h_userlist {
	private String input;
	private String userList[];
	private String userInfo1[];
	private String userInfo2[] = new String[50];
	
	public h_userlist() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("문자열을 입력하세요 (x: 종료) : ");
		input = s.nextLine();
		if(input.equalsIgnoreCase("x")) {
			System.out.println("종료되었습니다.\n");
			break; 
		}

		userList = input.split("###");
		
		for(int i =0; i<userList.length; i++) {
		userInfo1  = userList[i].split("\\|");
		for(int j =0; j<userInfo1.length; j++)
		userInfo2[i*2] = userInfo1[0];
		userInfo2[i*2+1] = userInfo1[1];
		}
				
		System.out.printf("=> 총 %d명이 등록되었습니다.\n", userList.length);
		
		for(int i =0; i<userList.length; i++) {
		
		System.out.printf("%d %s %s\n", i+1, userInfo2[i*2], userInfo2[i*2+1]);
	}
		
	}
}
}