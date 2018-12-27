package workbook.StepF;

import java.util.Scanner;

public class f_notcommon {

	private int number[] = new int[10];
	private int newnum, count=0;
	private boolean dup;
	
	public f_notcommon() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("1부터 100사이의 숫자를 입력하시오.");
		System.out.printf("%d번째 숫자를 입력하시오. ", this.count +1);
		this.newnum = s.nextInt();
		this.number[0] = this.newnum;
		this.count++;
		while(this.count<10) {
		dup=true;
		System.out.printf("%d번째 숫자를 입력하시오. ", this.count+1);
		this.newnum = s.nextInt();
		for(int i =0; i<this.count; i++) {
			if(this.newnum==this.number[i]) {dup=false;}
			System.out.printf("%d", number[i]);
			}
		if(dup==true) {number[this.count] = this.newnum; this.count++;}
		if(dup==false) System.out.println("잘못 입력하였습니다. 다시 입력하세요. ");
		
		}
	}
	
	
	public void printnum() {
		for(int i=0; i<10; i++)
			System.out.printf("%d번째 숫자는 %d입니다 \n", i+1, number[i]);
	}
}
