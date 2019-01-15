package workbook.StepJ;

import java.util.Scanner;

public class j_power2 {
	private int n1, n2;
	
	public j_power2() {input();}

	private void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 2개를 입력하시오. ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		
		System.out.printf("%d의 %d승은 %d 입니다.\n", n1, n2, power(n1, n2));
	}

	private int power(int num1, int num2) {
		if(num2 == 0)  return 1;
		else if(num2 == 1) return num1;
		else if(num2>1 && num2%2==0) return (power(num1, num2/2)*power(num1, num2/2));
		else return (power(num1, num2/2)*power(num1, num2/2)*num1);
	}

}
