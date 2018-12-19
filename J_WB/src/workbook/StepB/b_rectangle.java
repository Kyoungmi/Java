package workbook.StepB;

import java.util.Scanner;

public class b_rectangle {
	
	private int width;
	private int height;
	private int area;
	private String s;
	
	public b_rectangle(){input();}
	
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
	String getrec() {
		if(width==height)
			s="정사각형입";
		else
			s="정사각형이 아닙";
		return s;
	}
	public void printarea() {
		System.out.printf("직사각형의 넓이는 %d이고,\n%s니다", getarea(), getrec());
		
	}

}
