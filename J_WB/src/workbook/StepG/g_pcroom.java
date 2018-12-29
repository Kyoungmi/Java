package workbook.StepG;

import java.util.Scanner;

public class g_pcroom {
	
	private int hour, minute;
	private int total;
	private int charge;

	public g_pcroom() {input();}

	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("사용한 시간을 시간과 분으로 입력하세요 : ");
			this.hour = s.nextInt();
			this.minute = s.nextInt();
			if(hour==0 && minute==0) {printtotal(); break;}
			charge = getcharge();
			System.out.printf("고객님의 이용료는 %d원 입니다. \n", charge);
			total += charge;
		}
	}

	int getcharge() {
		if(minute==0) {
			if(hour<2) charge = hour*2000;
			else if(hour==2) charge = (hour*2000 / 100) * 95;
			else if(hour>=3 && hour<5) charge = (hour*2000/100) * 90;
			else if(hour>=5) charge = (hour*2000/100) * 80;
		}
		else if(minute<=30) {
			if(hour<2) charge = hour*2000 + 1000;
			else if(hour==2) charge = ((hour*2000 +1000) / 100) * 95;
			else if(hour>=3 && hour<5) charge = ((hour*2000 + 1000 )/100) * 90;
			else if(hour>=5) charge = ((hour*2000 + 1000)/100) * 80;
		}
		else if(minute>30) {
		if(hour<2)charge = hour*2000 + 2000;
		else if(hour==2) charge = ((hour*2000 +2000) / 100) * 95;
		else if(hour>=3 && hour<5) charge = ((hour*2000 + 2000 )/100) * 90;
		else if(hour>=5) charge = ((hour*2000 + 2000)/100) * 80;
		}
		return this.charge;
	}

	public void printtotal() {
		System.out.printf("지금까지의 이용료 총액은 %d원 입니다. \n", total);
		
	}
}
