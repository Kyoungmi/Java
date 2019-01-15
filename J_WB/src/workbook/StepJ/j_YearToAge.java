package workbook.StepJ;

import java.util.Scanner;

public class j_YearToAge {
	private int birth_year;
	private int[] arr = new int[6];
	private int sel;
	private String s[] = {"유아", "어린이", "청소년", "청년", "중년", "노년"};

	public j_YearToAge() {input();}

	private void input() {
		int i=0;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("%d번째 사람의 태어난 년도를 입력하세요. ", i+1);
			this.birth_year = s.nextInt();
			if(this.birth_year>2018) break;
			sel = AskAge(birth_year);
			if(sel==0) arr[0]++;
			else if(sel==1) arr[1]++;
			else if(sel==2) arr[2]++;
			else if(sel==3) arr[3]++;
			else if(sel==4) arr[4]++;
			else if(sel==5) arr[5]++;
			i++;
		}
		
	}

	private int AskAge(int year) {
		int age = 2018 - birth_year + 1;
		System.out.printf("나이는 %d 입니다. \n", age);
		if(age<7) return 0;
		else if(age<13) return 1;
		else if(age<20) return 2;
		else if(age<30) return 3;
		else if(age<60) return 4;
		else return 5;
	}
	
	public void printage() {
		for(int i=0; i<6; i++)
		System.out.printf("%s는 %d명 입니다.\n", s[i], arr[i]);
	}
}
