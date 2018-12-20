package workbook.StepC;

import java.util.Scanner;

public class c_YearToAge {
	private int year;
	private int age;
	
	public c_YearToAge(){input();}
	public void printAge() {
	    if(getAge()<7)
		    System.out.printf("유아입니다.");
	    else if(getAge()<13)
	    	System.out.printf("어린이입니다.");
	    else if(getAge()<20)
	    	System.out.printf("청소년입니다.");
	    else if(getAge()<30)
	    	System.out.printf("청년입니다.");
	    else if(getAge()<60)
	    	System.out.printf("중년입니다.");
	    else 
	    	System.out.printf("노년입니다.");
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
