import java.util.Scanner;

import workbook.StepA.StepAManager;
import workbook.StepB.StepBManager;
import workbook.StepC.StepCManager;
import workbook.StepD.StepDManager;
import workbook.StepE.StepEManager;
import workbook.StepF.StepFManager;
import workbook.StepG.StepGManager;
import workbook.StepH.StepHManager;
import workbook.StepI.StepIManager;
import workbook.StepJ.StepJManager;
import workbook.StepK.StepKManager;

public class WBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 Step은?");
		String step = s.next();
		if(step.equalsIgnoreCase("A")) 
			new StepAManager();
		else if(step.equalsIgnoreCase("B"))
			new StepBManager();
		else if(step.equalsIgnoreCase("C"))
			new StepCManager();
		else if(step.equalsIgnoreCase("D"))
			new StepDManager();
		else if(step.equalsIgnoreCase("E"))
			new StepEManager();
		else if(step.equalsIgnoreCase("F"))
			new StepFManager();
		else if(step.equalsIgnoreCase("G"))
			new StepGManager();
		else if(step.equalsIgnoreCase("H"))
			new StepHManager();
		else if(step.equalsIgnoreCase("I"))
			new StepIManager();
		else if(step.equalsIgnoreCase("J"))
			new StepJManager();
		else if(step.equalsIgnoreCase("K"))
			new StepKManager();
		System.out.printf("종료되었습니다.\n");
	}	
}