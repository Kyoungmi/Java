package workbook.StepG;

import java.util.Scanner;

public class g_YearToAge {
	
	private int birth_year;
	private int getage;
	private int[] age = new int[100];
	private int[] count = new int[6];
	private String s[] = {"유아", "어린이", "청소년", "청년", "중년", "노년"};

	public g_YearToAge(){input();}
	
	void input() {
		int i=0;
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.printf("%d번째 사람의 태어난 년도를 입력하세요. ", i+1);
		this.birth_year = s.nextInt();
		if(this.birth_year>2018) break;
		this.age[i] = this.birth_year;
		
		if(getAge(this.age[i])<7) count[0]++;
		else if(getAge(this.age[i])<13) count[1]++;
		else if(getAge(this.age[i])<20) count[2]++;
		else if(getAge(this.age[i])<30) count[3]++;
		else if(getAge(this.age[i])<60) count[4]++;
		else count[5]++;
		
		i++;
		}
	}
	
	int getAge(int age) {
		getage = 2018 - age + 1;
		return this.getage;
	}	
	
	public void printage() {
		for(int i =0; age[i]!=0; i++)
			System.out.printf("%d번째 사람의 나이는 %d 입니다.\n", i+1, getAge(age[i]));
	}
	
	public void printcount() {
		for(int i =0; i<6 ; i++)
			System.out.printf("%s는 %d명 입니다.\n", s[i], count[i]);
	}
	}

