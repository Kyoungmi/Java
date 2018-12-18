package workbook.StepA;

import java.util.Scanner;

public class Bytes {

	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;
	
	public Bytes(){input();}
	public void printbytes() {
		System.out.printf("입력하신 파일 용량은 %d입니다.\n", getmega());
		System.out.printf("%d 킬로바이트,\n", getkilo());
		System.out.printf("%d 바이트 입니다.\n", Bytes());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 기가바이트 단위 입력하시오. ");
		this.gigabytes = s.nextInt();
	}	
	int getmega() {
		megabytes = gigabytes * 1024;
		return this.megabytes;
	}	
	int getkilo() {
		kilobytes = megabytes * 1024;
		return this.kilobytes;
	}	
	long Bytes() {
		bytes = kilobytes * 1024l;
		return this.bytes;
	}	
}
