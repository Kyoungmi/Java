package workbook.StepB;

import java.util.Scanner;

public class b_YearToAge {
	private int year;
	private int age;
	
	public b_YearToAge(){input();}
	public void printAge() {
	    if(getAge()<20)
		    System.out.printf("미성년자입니다.");
	    else
	    	System.out.printf("미성년자가 아닙니다.");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도를 입력하세요. ");
		this.year = s.nextInt();
	}	
	int getAge() {
		age = 2018 - year + 1;
		return this.age;
	}	
}
