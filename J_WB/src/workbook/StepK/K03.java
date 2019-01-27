package workbook.StepK;

import java.util.Scanner;

class point {
	private double x, y;
	private int[] point = new int[100];
	private int[] count = new int[4];
	
	
	void input(int n) {
		Scanner s = new Scanner(System.in);
		System.out.printf("%d번째 좌표의 X, Y 값을 입력하시오. ", n+1);
		this.x = s.nextDouble();
		this.y = s.nextDouble();
		this.point[n] = get_area(x, y);
	}
	
	int get_area(double x, double y) {
		if(x>0 && y>0) {this.count[0]++; return 1;}
		else if(x<0 && y>0) {this.count[1]++; return 2;}
		else if(x<0 && y<0) {this.count[2]++; return 3;}
		else if(x>0 && y<0) {this.count[3]++; return 4;}
		else return 0;
	}
	void print(int n) {
		for(int i =0; i<n; i++)
		System.out.printf("%d번째 좌표는 %d사분면에 위치합니다.\n", i+1, this.point[i]);
	}
	
	void printall() {
		for(int j =0; j<4; j++)
			System.out.printf("%d사분면의 좌표는 모두 %d개입니다.\n", j+1, this.count[j]);
	}

}
public class K03 {
	public static void main() {
		Scanner s = new Scanner(System.in);
		point user = new point();
		user.input(0);
		user.print(1);
		user.printall();
		
	}

}
