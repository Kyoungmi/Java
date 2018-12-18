package workbook.StepA;

import java.util.Scanner;

public class rectangle {

	private int width;
	private int height;
	private int area;
	
	public rectangle(){input();}
	public void printarea() {
		System.out.printf("직사각형의 넓이는 %d입니다.\n", getarea());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 길이를 입력하시오. ");
		this.width = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.printf("직사각형의 세 길이를 입력하시오. ");
		this.height = s1.nextInt();
	}	
	int getarea() {
		area = width * height;
		return this.area;
	}	


}
