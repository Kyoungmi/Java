package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class h_power {
	private int[] number = new int[5];
	private int pow_value[][] = new int[5][5];
	private int max, min;
	private int max_a, max_b, min_a, min_b;

	public h_power() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("2에서 9사이의 숫자 5개를 입력하세요. ");
		for(int i=0; i<5; i++)
		this.number[i] = s.nextInt();
		pow_value = pow();
		max = min = pow_value[0][1];
		for(int i =0; i<5; i++) {
			for(int j =0; j<5; j++) {
				if(i==j) continue;
				if(pow_value[i][j]>max) {
					max = pow_value[i][j];
					max_a = number[i];
					max_b = number[j];
				}
				if(pow_value[i][j]<=min) {
					min = pow_value[i][j];
					min_a = number[i];
					min_b = number[j];
				}
			}
		}
		}
	
	private int[][] pow() {
		for(int i =0; i<5; i++) {
			for(int j =0; j<5; j++) {
				if(i==j)continue;
				pow_value[i][j] = (int) Math.pow(number[i], number[j]);
			}
		}
		return this.pow_value;
	}
	
	public void printmaxmin() {
		System.out.printf("가장 큰 수는 %d의 %d승인 %d 입니다.\n", max_a, max_b, max);
		System.out.printf("가장 작은 수는 %d의 %d승인 %d 입니다.\n", min_a, min_b, min);
	}
	

}

