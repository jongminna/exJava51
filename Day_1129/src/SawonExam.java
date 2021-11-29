import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Sawon[] sawon = new Sawon[20];
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		while(cnt<20) {
			System.out.print("사원등록:");
			String id = scn.next();
			if(id.equalsIgnoreCase("end"))
				break;
			int grade = scn.nextInt();
			int time = scn.nextInt();
			sawon[cnt] = new Sawon(id,grade,time);
			cnt++;
		}
		
		SawonProcess process = new SawonProcess(sawon, cnt);
		process.dataPrint();
		process.weekPayMax();
/*		
		System.out.println("아이디\t등급\t시급\t근무시간\t주간급여");
		for(int x=0; x<cnt; x++) {
			sawon[x].sawonPaint();
		}
*/		
	}

}
