package workbook.StepL;

import java.util.*;
import java.text.*;

public class L03 {

	Scanner s = new Scanner(System.in);
	ArrayList<Restaurant> r = new ArrayList<Restaurant>();
	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:", Locale.KOREA);
	
	int price[] = {25000, 15000, 17000};
	int ssp[] = {0, 0, 0};
	
	public L03() {
	
	while(true) {
		System.out.printf("1)주문 2)결제 3)리스트 4)종료 ==> ");
		int n = s.nextInt();
		System.out.println("-------------------------------");
		switch(n) {
		case 1:
			order();
			break;
		case 2:
			money();
			break;
		case 3:
			list();
			break;
		case 4:
			System.out.println("종료되었습니다.");
			System.exit(0);
	
}
	}
	}
 void order(){
	System.out.print("손님 수를 입력하세요: ");
	int num = s.nextInt();
	System.out.print("스테이크, 스파게티, 파스타의 개수를 입력하세요: ");
	for(int i =0 ; i<3; i++) {
		ssp[i] = s.nextInt();
	}
	System.out.print("멤버쉽 카드가 있습니까?(Y:있음): ");
	String membership = s.next();
	String in_time = f.format(new Date());
	System.out.printf("들어오신 시간은 "+in_time+"입니다.\n");
	System.out.printf("총 금액은 %d원 입니다.\n ", totalfee(membership));
	Restaurant guest = new Restaurant(num, ssp, membership, in_time, totalfee(membership));
	r.add(guest);
	
}
int totalfee(String membership) {
	int fee = 0;
	for(int i =0; i<3; i++) {
		fee = fee + price[i]*ssp[i]; 
	}
	if(membership.equalsIgnoreCase("y")) fee=(int)(fee*0.9);
	if(fee<100000) fee=(int)(fee*1.07);
	else fee = (int)(fee*1.1);
	fee = (int)(fee*1.1);

	return fee;
}

void list() {
	System.out.println("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t결제급액\t입장시간");
	for(int i =0; i<r.size(); i++) {
		System.out.printf("[%d]\t "+r.get(i).member+"\t", i+1);
		for(int j =0; j<3; j++) {
			System.out.printf("%d\t", r.get(i).ssp[j]);
		}
		System.out.printf(" "+r.get(i).membership+"\t", r.get(i).price+"\t"+r.get(i).enter_time+"\n");;
	}
}
void money() {
	list();
	System.out.print("==> 결제하실 번호를 입력하세요: ");
	int m = s.nextInt();
	r.remove(r.get(m-1));
	System.out.println("==> 결제완료되었습니다.");
}

}