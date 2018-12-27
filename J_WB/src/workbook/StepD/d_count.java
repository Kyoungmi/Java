package workbook.StepD;

import java.util.Scanner;

public class d_count {
	private int count_all;
	private int count_young=0;
	
	public d_count() { input(); }

	private void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("가족이 몇 명인지 입력하세요 ");
		this.count_all = s.nextInt();
		
		for(int i=0;i<count_all; i++){
			System.out.print("태어난 년도를 입력하세요 ");
			int birth_year = s.nextInt();
			int age = 2018 - birth_year +1;
			if(age<20) this.count_young = count_young +1;
		}
	
	}
	
	public void printyoung() {
		System.out.printf("가족들 중에 미성년자는 모두 %d 명입니다.", count_young);
	}
}