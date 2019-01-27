package workbook.StepK;

import java.util.Scanner;

class Student {
	private String[] s1 = {"번호", "국어", "영어", "수학", "총점", "평균", "학점"};
	private int[] kor = new int[100];
	private int[] eng = new int[100];
	private int[] math = new int[100];
	private int[] total = new int[100];
	private double[] ave = new double[100];
	private char grade;
	
	void input(int num) {
		Scanner s = new Scanner(System.in);
		System.out.printf("%d번 학생의 국어, 영어, 수학점수를 입력하시오 --> ", num+1);
		this.kor[num] = s.nextInt();
		this.eng[num] = s.nextInt();
		this.math[num] = s.nextInt();
		this.total[num] = this.kor[num] + this.eng[num] + this.math[num];
		this.ave[num] = this.total[num] / 3.0 ;
	}
	char getgrade(double ave) {
		if(ave>=90) grade = 'A';
		else if(ave>=80 && ave<90) grade = 'B';
		else if(ave>=70 && ave<80) grade = 'C';
		else if(ave>=60 && ave<70) grade = 'D';
		else if(ave<60) grade = 'F';
		return this.grade;
	}
	
	
	void print(int num) {
		System.out.printf("등록된 %d명의 학생 목록은 다음과 같습니다.\n", num);
		System.out.println("-------------------------------");
		for(int i =0; i<7; i++)
		System.out.printf("%-7s", s1[i]);
		System.out.print("\n");
		for(int i =0; i<num; i++)
			System.out.printf("%-8d%-8d%-8d%-8d%-8d%-8f%-8c\n", i+1, this.kor[i], this.eng[i], this.math[i], this.total[i], this.ave[i], getgrade(this.ave[i]));
	}
}	
	
public class K07 {
	public static void main() {
		Scanner s = new Scanner(System.in);
		Student user = new Student();
		System.out.print("등록할 학생의 명수는? ");
		int count = s.nextInt();
		for(int i =0; i<count; i++) {
			user.input(i);
		}
		 	user.print(count);
	}

}
