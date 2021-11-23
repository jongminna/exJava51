import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int apt[][] = new int[11][8];
		while(true) {
			System.out.print("등록:");
			int dong = scn.nextInt();
			if(dong==0) {
				break;
			}
			scn.next();
			int age = scn.nextInt()/10;
			if(age>=60) {
				age=6;
			}
			apt[dong-1][age]++; 
			apt[dong-1][apt[0].length-1]++;//apt[dong-1][7]++;
			apt[apt.length-1][age]++;//apt[10][age]++;
			apt[apt.length-1][apt[0].length-1]++;//apt[10][7]++;
		}
		//데이터 출력
		System.out.println("동\t0~9\t10~19\t20~29\t30~39\t40~49\t50~59\t60이상\t합계");
		for(int x=0; x<apt.length-1; x++) {
			System.out.print((x+1)+"\t");
			for(int y=0; y<apt[x].length; y++) {
				System.out.print(apt[x][y]+"\t");
			}
			System.out.print("\n");
		}
		System.out.print("합계\t");
		for(int y=0; y<apt[0].length; y++) {
			System.out.print(apt[apt.length-1][y]+"\t");
		}
		
		
	}

}
