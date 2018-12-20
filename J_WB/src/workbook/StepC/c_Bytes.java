package workbook.StepC;

import java.util.Scanner;

public class c_Bytes {


	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;
	
	public c_Bytes(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하시오. ");
		this.megabytes = s.nextInt();
		this.bytes = megabytes * 1024l * 1024l ;
		System.out.printf("전송방식을 1: Wi-Fi, 2: BlueTooth, 3: LTE, 4: USB 에서 선택하여 입력하세요. ");
		this.kind = s.nextByte();
	}	
	
	double gettime() {
		if(kind==1)
			time = bytes / 1500000.0 ;
		else if(kind==2)
			time = bytes / 300000.0 ;
		else if(kind==3)
			time = bytes / 1000000.0 ;
		else if(kind==4)
			time = bytes / 60000000.0 ;
		
		return this.time;
	}
	public void printbytes() {
		System.out.printf("파일 전송 시간은 %f 초입니다.",gettime());
		
	}

}
