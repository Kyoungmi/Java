package workbook.StepD;

import java.util.Scanner;

public class d_rectangle {
	private int width, height;
	private int count1=0, count2=0, count3=0, count4=0, count5=0;
	
	public d_rectangle() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("직사각형의 가로 크기와 세로 크기를입력하시오. ");
		this.width = s.nextInt();
		this.height =s.nextInt();
		if(width<0 || height<0) break;
		if(width==height) this.count1++;
		else if(width>2*height) this.count2++;
		else if(2*width<height) this.count3++;
		else if(width>height) this.count4++;
		else if(width<height) this.count5++;
		}
	
	}
	
	public void printrec() {
		System.out.printf("\"정사각형\"의 개수는 %d 입니다.\n", count1);
		System.out.printf("\"좌우로 길쭉한 직사각형\"의 개수는 %d 입니다.\n", count2);
		System.out.printf("\"위아래로길쭉한 직사각형\"의 개수는 %d 입니다.\n", count3);
		System.out.printf("\"일반적인 가로형 직사각형\"의 개수는 %d 입니다.\n", count4);
		System.out.printf("\"일반적인 세로형 직사각형\"의 개수는 %d 입니다.\n", count5);
	}
}