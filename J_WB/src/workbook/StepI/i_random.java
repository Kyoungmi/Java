package workbook.StepI;

import java.util.Random;
import java.util.Scanner;

public class i_random {
	private int number ;
	private int result ;
	private int[] arr = new int[3];
	private String[] arr2 = {"대(70이상)", "중(40이상)", "소(40미만)"};
	
	public i_random() {MainRan();}

	private void MainRan() {
		System.out.println("10개의 숫자를 생성합니다.");
		for(int i =0; i<10; i++) {
			result = GetRandom();
			if(result ==0 ) arr[0] ++;
			else if(result ==1 ) arr[1] ++;
			else if(result ==2 ) arr[2] ++;
		}
		for(int j =0; j<3; j++)
		System.out.printf("%s : %d회 생성\n", arr2[j], arr[j]);
		
	}
	
	private byte GetRandom() {
		Random generator = new Random();
		this.number = generator.nextInt(100) + 1;
		System.out.printf("생성된 임의의 숫자는 %d 입니다. \n", number);
		if(number >= 70) return 0;
		else if(number>=40 && number<70) return 1;
		else return 2;
	}

}
