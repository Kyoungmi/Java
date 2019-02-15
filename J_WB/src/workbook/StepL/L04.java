package workbook.StepL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class L04 {

	Scanner s = new Scanner(System.in);
	ArrayList<Student> stu = new ArrayList<Student>();
	
	String name;
	int number;
	String gender;
	String address;
	int phone;
	String bokhak;
	Student student;
	
	int total =0;
	
	public L04() {
	
	while(true) {
		System.out.printf("1)학생등록 2)정보수정 3)삭제 4)리스트 5)이름 검색 6)복학생 리스트 7)주소 검색 8)종료 ==> ");
		int n = s.nextInt();
		System.out.println("-------------------------------");
		switch(n) {
		case 1:
			add();
			stu.add(student);
			total++;
			System.out.printf("총 %d명이 등록되었습니다, \n", total);
			break;
		case 2:
			edit();
			System.out.println("==수정되었습니다.\n");
			break;
		case 3:
			delete();
			break;
		case 4:
			list();
			break;
		case 5:
			name();
			break;
		case 6:
			bokhakList();
			break;
		case 7:
			address();
			break;
		case 8:
			System.out.println("종료되었습니다.");
			System.exit(0);
	
}
	}
	}
 void add(){
	System.out.print("학생 이름, 학번, 성별을 입력하세요: ");
	name = s.next();
	number = s.nextInt();
	gender = s.next();
	System.out.print("주소를 입력하세요: ");
	address = s.nextLine();
	System.out.print("전화번호를 입력하세요: ");
	phone = s.nextInt();
	System.out.print("복학생 입니까?(Y/N) ");
	bokhak = s.next();
	Student student = new Student(name, number, gender, address, phone, bokhak);
	
}
 void list() {
	 System.out.println("번호\t이름\t학번\t성별\t주소\t전화번호\t복학생");
		for(int i =0; i<stu.size(); i++) {
			System.out.printf("%d\t"+stu.get(i).name+"\t"+stu.get(i).number+"\t"+stu.get(i).gender+"\t"+stu.get(i).address+"\t"+stu.get(i).phone+"\t"+stu.get(i).is_bokhak+"\n", i+1);
			
		}
	}
 
void edit() {
	list();
	System.out.print("==>수정하실 번호를 입력하세요: ");
	int ed = s.nextInt();
	add();
	stu.get(ed-1).name = name;
	stu.get(ed-1).number = number;
	stu.get(ed-1).gender = gender;
	stu.get(ed-1).address = address;
	stu.get(ed-1).phone = phone;
	stu.get(ed-1).is_bokhak = bokhak;
}

void delete() {
	System.out.print("==> 삭제할 번호를 입력하시오. ");
	int num = s.nextInt();
	System.out.print("정말로 삭제하시겠습니까?(Y/N) ");
	String yon = s.next();
	if(yon.equalsIgnoreCase("Y")) {
		stu.remove(stu.get(num-1));
		System.out.println("삭제되었습니다.");
	}
	total--;
}

void name() {
	System.out.print("검색하실 이름을 입력하세요: ");
	String whatname = s.next();
	System.out.println("검색되었습니다");
	System.out.print("번호\t이름\t학번\t성별\t주소\t전화번호\t복학생");
	for(int i =0; i<stu.size(); i++) {
		if(stu.get(i).name.equals(whatname)) 
			System.out.printf("%d\t"+stu.get(i).name+"\t"+stu.get(i).number+"\t"+stu.get(i).gender+"\t"+stu.get(i).address+"\t"+stu.get(i).phone+"\t"+stu.get(i).is_bokhak+"\n", i+1);
		
	}
	
}
void bokhakList() {
	int boknum =0 ;
	System.out.print("번호\t이름\t학번\t성별\t주소\t전화번호\t복학생");
	for(int i =0; i<stu.size(); i++) {
		if(stu.get(i).is_bokhak.equalsIgnoreCase("y")) {
			System.out.printf("%d\t"+stu.get(i).name+"\t"+stu.get(i).number+"\t"+stu.get(i).gender+"\t"+stu.get(i).address+"\t"+stu.get(i).phone+"\t"+stu.get(i).is_bokhak+"\n", i+1);
			boknum++;
		}
	}
	System.out.printf("복학생은 %d명 입니다.\n", boknum);
}
void address() {

	System.out.print("검색하실 주소를 입력하세요: ");
	String whatadd = s.nextLine();
	System.out.print("번호\t이름\t학번\t성별\t주소\t전화번호\t복학생");
	for(int i =0; i<stu.size(); i++) {
		if(stu.get(i).name.equals(whatadd)) 
			System.out.printf("%d\t"+stu.get(i).name+"\t"+stu.get(i).number+"\t"+stu.get(i).gender+"\t"+stu.get(i).address+"\t"+stu.get(i).phone+"\t"+stu.get(i).is_bokhak+"\n", i+1);
		
	}
}
}
