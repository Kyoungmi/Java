import java.util.Scanner;

import workbook.StepA.StepAManager;
public class WBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 Step은?");
		String step = s.next();
		if(step.equalsIgnoreCase("A")) 
			new StepAManager();
		
		System.out.printf("종료되었습니다.\n");
	}	
}