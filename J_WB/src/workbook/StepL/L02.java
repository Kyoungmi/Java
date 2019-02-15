package workbook.StepL;

import java.util.*;
import java.text.*;

public class L02 {

	Scanner s = new Scanner(System.in);
	ArrayList<ParkingLot> p = new ArrayList<ParkingLot>();
	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:", Locale.KOREA);
	
	int num =0;
	String time;
	int total =0;
	
	public L02() {
		System.out.print("주차할 수 있는 차의 개수를 입력하세요. ");
		num = s.nextInt();
		System.out.printf("총 %d대를 주차할 수 있습니다.\n", num);
		
	
	while(true) {
		System.out.printf("1)입차 2)출차 3)리스트 4)입차 총 개수 5)주차 잔여 개수 6)종료 ==> ");
		int n = s.nextInt();
		System.out.println("-------------------------------");
		switch(n) {
		case 1:
			GoIn();
			System.out.printf("[%d번]"+time+" 입차 되었습니다.\n\n", total+1);
			break;
		case 2:
			GoOut();
			num++;
			total--;
			System.out.println("==>정산되었습니다.\n");
			break;
		case 3:
			list();
			System.out.printf("%d대 주차 가능.\n", num);
			break;
		case 4:
			totalnum();
			break;
		case 5:
			spare();
			break;
		case 6:
			System.out.println("종료되었습니다.");
			System.exit(0);
	
}
	}
	}
 void GoIn(){
	System.out.print("입차할 차의 번호와 차종을 입력하세요 ");
	int car_num = s.nextInt();
	String car_kind = s.next();
	time = f.format(new Date());
	ParkingLot car = new ParkingLot(car_num, car_kind, time);
	p.add(car);
	
}
void GoOut() {
	list();
	System.out.print("==>출차 번호를 입력하세요: ");
	int out = s.nextInt();
	String OutTime = f.format(new Date());
	System.out.printf("==>현재 시간은 "+OutTime+" 이므로 주차금액은 %d원 입니다. \n", getfee(out, OutTime));
	p.remove(p.get(num-1));
}
int getfee(int num, String t) {
	int fee = 0;
	try {
		Date in = f.parse(p.get(num-1).time);
		Date out = f.parse(t);
		long gethour = out.getTime() - in.getTime();
		long getmin = gethour/(60*1000);
		if(getmin<10)fee = 0;
		else if(getmin%10==0) fee = 500*((int)getmin/10)-500;
		else fee = (500*((int)getmin/10));
	} catch (ParseException e) {
		e.printStackTrace();
	}
	return fee;
	
}
void list() {
	for(int i =0; i<p.size(); i++) {
		System.out.printf("[%d번] "+p.get(i).car_num+" "+p.get(i).kind+" "+p.get(i).time+"\n", i+1);
		
	}
}
void totalnum() {
	System.out.printf("총 %d대가 주차되어 있습니다.\n", total);
}
void spare() {
	System.out.printf("주차가능한 자리는 %d곳 입니다. \n", num);
}
}
