package workbook.StepL;

public class Restaurant {

	String membership;
	String enter_time;
	int member = 0;
	int price = 0;
	int ssp[] = {0,0,0};
	
	public Restaurant(int numberofpeople, int [] ssp, String membership, String time, int price) {
		this.member = numberofpeople;
		this.membership = membership;
		this.price = price;
		this.enter_time = time;
		for(int i =0; i<3; i++) {
			this.ssp[i] = ssp[i];
		}
		
	}
}
