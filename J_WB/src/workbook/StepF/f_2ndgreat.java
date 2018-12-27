package workbook.StepF;

import java.util.Scanner;

public class f_2ndgreat {

	private int[] num= new int[10];
	private int first, second;
	private int second_max_index;
	private int newnum;
	
	public f_2ndgreat() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		for(int i=1; i<=10; i++) {
		System.out.printf("%d번째 수를 입력하시오. ", i);
		this.num[i-1] = s.nextInt();
		}
	}
	
	private int getfirst() {
		for(int i=0; i<9; i++) {
			if(this.num[i]<this.num[i+1]) this.first = this.num[i+1];
		}
		return this.first;
	}
	
	private int getsecond() {
		for(int i=0; i<9; i++) {
			if(this.num[i]<this.num[i+1] && this.num[i+1]!=getfirst()) {
				this.second = this.num[i+1];
				}
		}
		return this.second;
	}
	private int getindex() {
		for(int i=0; i<10; i++) {
			if(this.num[i]==getsecond()) second_max_index = i+1;
		}
		return this.second_max_index;
	}

	public void print2nd() {
		System.out.printf("%d", getfirst());
		System.out.printf("두 번째로 큰 수는 %d번째 수 %d입니다.\n", getindex(), getsecond());

		}
	}


