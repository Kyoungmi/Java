package workbook.StepG;

import java.util.Scanner;

public class g_amusement {

	private int team_count;
	private int count[] = new int[4];
	private int sum;
	private int charge[] = {5000, 10000, 15000, 3000};
	private int total_sum;
	private int membership;
	private int v_count[] = new int[4];
	private int total_count;
	private String str[] = {"초등학생", "청소년", "일반인" ,"경로대상"};
	
	public g_amusement() {input();}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("오늘 방문한 팀 수를 입력하세요 : ");
		this.team_count = s.nextInt();
		for(int i =0; i<team_count; i++){
			System.out.printf("%d번팀 인원수(초등학생, 청소년, 일반, 경로대상)를 입력하세요. ", i+1);
			count[0] = s.nextInt(); v_count[0] += count[0]; total_count += count[0];
			count[1] = s.nextInt(); v_count[1] += count[1]; total_count += count[1];
			count[2] = s.nextInt(); v_count[2] += count[2]; total_count += count[2];
			count[3] = s.nextInt(); v_count[3] += count[3]; total_count += count[3];
			
			System.out.printf("%d번팀 할인카드 종류(카드없음:0, 일반등급 : 1, VIP 등급 : 2)를 입력하세요. ", i+1);
			this.membership = s.nextInt();
			
			sum = getsum();
			System.out.printf("%d번팀 입장료는 %d원 입니다. \n", i+1, sum);
			total_sum += sum;
		}
	}

	private int getsum() {
		int getsum =0;
		for(int i =0; i<4; i++) {
			getsum += count[i] * charge[i];
		}
		if(this.membership == 1) getsum = getsum / 10 * 9;
		if(this.membership == 2) getsum = getsum / 10 * 8;
		
		return getsum;
	}
	
	public void printall() {
		System.out.printf("오늘 총 방문자 수는 %d명 입니다. \n", total_count);
		for(int i =0; i<4; i++)
			System.out.printf("%s 수는 %d명 입니다.\n", str[i], v_count[i]);
	
		System.out.printf("\n총 입장료는 %d원 입니다.\n", total_sum);
	}
}
