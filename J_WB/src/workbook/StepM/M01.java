package workbook.StepM;

import java.util.*;
import java.io.*;

public class M01 {

	Scanner s = new Scanner(System.in);
	
	ArrayList<MenuPan> m = new ArrayList<MenuPan>();
	
	public M01() {
		
		while(true) {
			System.out.printf("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==> ");
			int num = s.nextInt();
			System.out.println("-------------------------------");
			switch(num) {
			case 1:
				add();
				System.out.println("입력되었습니다.");
				break;
			case 2:
				edit();
				System.out.println("수정되었습니다.");
				break;
			case 3:
				delete();
				System.out.println("삭제되었습니다.");
				break;
			case 4:
				list();
				break;
			case 5:
				totalnum();
				break;
			case 6:
				try {
					save();
					System.out.println("저장되었습니다.");
				}
				catch(IOException e) {
					System.out.println("문제발생");
				}
				System.out.println("종료되었습니다.");
				System.exit(0);
			}}
		}
	
	
	void add() {
		System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하시오. ");
		String name = s.next();
		String origin = s.next();
		int price = s.nextInt();
		MenuPan user = new MenuPan(name, origin, price);
		m.add(user);
	}
	void edit() {
		System.out.print("==> 수정할 번호를 입력하세요 : ");
		int n = s.nextInt();
		System.out.print("==>메뉴의 메뉴명, 원산지, 가격을 입력하시오. ");
		m.get(n-1).name = s.next();
		m.get(n-1).origin = s.next();
		m.get(n-1).price = s.nextInt();
	}
	void delete() {
		System.out.print("==> 삭제할 번호를 입력하시오. ");
		int num = s.nextInt();
		m.remove(m.get(num-1));
	}
	void list() {
		System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분가격");
		for(int i =0; i<m.size(); i++) {
			System.out.printf("%d\t"+m.get(i).name+"\t"+m.get(i).origin+"\t"+m.get(i).price, i+1);
			
		}
	}
	void totalnum() {
		System.out.printf("%d개의 메뉴가 등록되어 있습니다.\n", m.size());
	}
	void save() throws IOException{
		PrintWriter p = new PrintWriter("out.txt");
		p.write("메뉴번호\t메뉴이름\t원산지\t1인분가격");
		p.write("-------------------------------");
		for(int i =0; i<m.size(); i++) {
			p.write((i+1)+"\t"+m.get(i).name+"\t"+m.get(i).origin+"\t"+m.get(i).price+"\n");
		}
		p.close();
	}
}
