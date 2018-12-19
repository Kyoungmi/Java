package workbook.StepB;

import java.util.Scanner;

public class b_Bytes {

	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;
	
	public b_Bytes(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하시오. ");
		this.megabytes = s.nextInt();
		this.bytes = megabytes * 1024l * 1024l ;
		System.out.printf("USB포트가 2.0이면 Y, 아니면 N을 입력하시오. ");
		this.usb2 = s.next();
	}	
	
	int gettime() {
		if(usb2.equalsIgnoreCase("y"))
			time = (int) (bytes / 60000000) ;
		else if(usb2.equalsIgnoreCase("n"))
			time = (int) (bytes / 1500000) ;
		return this.time;
	}
	public void printbytes() {
		System.out.printf("파일 전송 시간은 %d 초입니다.",gettime());
		
	}

}
