package workbook.StepJ;

public class j_FiboNum2 {

	private double goldenrate, goldenrate2;
	private int Fi1, Fi2;
	
	public j_FiboNum2() {input();}

	private void input() {
		int i = 2;
		while(true){
		Fi1 = fibonacci(i+1);
		Fi2 = fibonacci(i);
		goldenrate = Fi1/(double)Fi2;
		System.out.printf("%d번째 비율 (%d / %d) : %f \n", i, Fi1, Fi2, goldenrate);
		i++;
		goldenrate2 = (fibonacci(i+1)/(double)fibonacci(i));
		if(Math.abs(goldenrate - goldenrate2) < 0.000001) break;
		}
	}

	private int fibonacci(int n) {
		if(n == 1) return 1;
		else if(n == 2) return 1;
		else return fibonacci(n-1) + fibonacci(n-2);
	}
}