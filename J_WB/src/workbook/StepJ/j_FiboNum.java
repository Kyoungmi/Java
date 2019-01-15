package workbook.StepJ;

public class j_FiboNum {
	
	public j_FiboNum() {input();}

	private void input() {
		System.out.print("1부터 20까지 피보나치 수는 다음과 같습니다.\n");
		for(int i =1; i<21; i++) {
		System.out.printf("%d번째 : %d \n", i, fibonacci(i));
		}
	}

	private int fibonacci(int n) {
		if(n == 1) return 1;
		else if(n == 2) return 1;
		else return fibonacci(n-1) + fibonacci(n-2);
	}
}
