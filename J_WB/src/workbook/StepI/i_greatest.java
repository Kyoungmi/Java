package workbook.StepI;

import java.util.Scanner;

public class i_greatest {
	private int[] arr = new int[10];
	private int max;
	private int result;

	public i_greatest() {Main_Max();}

	private void Main_Max() {
		result = MaxOfTen();
		System.out.printf("최댓값은 %d 입니다.\n", result);
	}

	private int MaxOfTen() {
		Scanner s = new Scanner(System.in);
		System.out.println("10개의 숫자 중 최댓값을 구합니다.");
		System.out.print("1번 수를 입력하시오. ");
		max = arr[0] = s.nextInt();
		for(int i =1; i<10; i++) {
			System.out.printf("%d번 수를 입력하시오. ", i+1);
			arr[i] = s.nextInt();
			if(max<arr[i]) max = arr[i];
		}
		return max;
	}
}
