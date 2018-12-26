package workbook.StepE;

import java.util.Scanner;

public class e_triangle2 {

	private int height;
		
		public e_triangle2() {input();}

		private void input() {
			Scanner s = new Scanner(System.in);
			System.out.print("이등변 삼각형의 높이를 입력하시오. ");
			this.height = s.nextInt();
		}
		
		public void printtri2() {
			int height2 = height;
			for(int i=0; i<height; i++) {
				for(int j=0; j<height2-1; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=2*i-1; k++)
				System.out.print("*");
				System.out.print("\n");
				height2--;
			}
		}
}
