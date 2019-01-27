package workbook.StepK;

import java.util.Scanner;

class UserInfo {
	private String[] s1 = {"번호", "아이디", "비밀번호"};
	private String[] id = new String[100];
	private String[] pass = new String[100];
	
	void input(int num) {
		Scanner s = new Scanner(System.in);
		System.out.print("학생의 아이디, 비밀번호를 입력하시오. ");
		this.id[num] = s.next();
		this.pass[num] = s.next();
	}
	
	void print(int num) {
		System.out.printf("등록된 %d명의 학생 목록은 다음과 같습니다.\n", num);
		System.out.println("-------------------------------");
		for(int i =0; i<3; i++)
		System.out.printf("%-7s", s1[i]);
		System.out.print("\n");
		for(int i =0; i<num; i++)
			System.out.printf("%-8d%-8s%-8s\n", i+1, this.id[i], this.pass[i]);
	}
	
}
public class K05 {
	public static void main() {
		UserInfo user = new UserInfo();
		user.input(0);
		user.print(1);
	}
}
