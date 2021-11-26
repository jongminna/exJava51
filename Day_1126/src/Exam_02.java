import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		SawonPay[] sawon = new SawonPay[10];
		int cnt=0;
		while(cnt<10) {
			System.out.print("사원등록:");
			String name=scn.next();
			if(name.equalsIgnoreCase("end"))
				break;
			int pay = scn.nextInt();
			sawon[cnt] = new SawonPay(name,pay);
			cnt++;
		}
		//출력
		int totmoney[] = new int[10];
		System.out.print("이름\t출장비\t50000\t10000\t5000\t");
		System.out.println("1000\t500\t100\t50\t10\t5\t1");
		for(int x=0; x<cnt; x++) {
			sawon[x].sawonPayPrint();
			for(int y=0;y<10;y++) {
				totmoney[y] += sawon[x].money[y];
			}
		}
		System.out.print("합계:\t\t");
		for(int x=0; x<10; x++) {
			System.out.print(totmoney[x]+"\t");
		}
	}

}
