package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class h_RockPaperScissors {
	private int my_finger;
	private int com_finger;
	private int[][] score = new int[2][3];

	public h_RockPaperScissors() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true){
		System.out.printf("가위(1), 바위(2), 보(3)를 입력하세요. ");
		this.my_finger = s.nextInt();
		if(my_finger==0) break;
		com_finger = getfinger();
		if(com_finger==1) System.out.print("컴퓨터가 낸 것은 가위입니다.");
		else if(com_finger==2) System.out.print("컴퓨터가 낸 것은 바위입니다.");
		else if(com_finger==3) System.out.print("컴퓨터가 낸 것은 보입니다.");
		System.out.print(" -----> ");
		getwinner(my_finger, com_finger);
	}
	}
	
	private int getfinger() {
		Random generator = new Random();
		com_finger = generator.nextInt(3)+1;
		
		return com_finger;
	}
	private void getwinner(int user, int com) {
		if(user==1) {
			if(com==3) {System.out.println("사용자 승!"); this.score[1][0]++; this.score[0][2]++;}
			else if(com==2) {System.out.println("컴퓨터 승!"); this.score[0][0]++; this.score[1][2]++;}
			else if(com==1) {System.out.println("비김~"); this.score[0][1]++; this.score[1][1]++;}
		}
		if(user==2) {
			if(com==3) {System.out.println("컴퓨터 승!"); this.score[0][0]++; this.score[1][2]++;}
			else if(com==2) {System.out.println("비김~"); this.score[0][1]++; this.score[1][1]++;}
			else if(com==1) {System.out.println("사용자 승!"); this.score[1][0]++; this.score[0][2]++;}
		}
		if(user==3) {
			if(com==3) {System.out.println("비김~"); this.score[0][1]++; this.score[1][1]++;}
			else if(com==2) {System.out.println("사용자 승!"); this.score[1][0]++; this.score[0][2]++;}
			else if(com==1) {System.out.println("컴퓨터 승!"); this.score[0][0]++; this.score[1][2]++;}
		}
	}
	
	public void printwin() {
		System.out.printf("컴퓨터 : 이긴 횟수는 %d회, 진 횟수 %d, 비긴 횟수 %d 입니다.\n" , this.score[0][0], this.score[0][2], this.score[0][1]);
		System.out.printf("사용자 : 이긴 횟수는 %d회, 진 횟수 %d, 비긴 횟수 %d 입니다.\n" , this.score[1][0], this.score[1][2], this.score[1][1]);
	}
}
