import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력자료 : ");
		int carNo = scn.nextInt();
		int time = scn.nextInt();
		
		int money=0;//주차요금
		if(time>=10) {
			money=500;
			if(time>30) {
				time = time-30;
				int na = time/10;
				if(time % 10 != 0) {
					na=na+1;
				}
				money = money + na*500;
			}
		}
		if(money>30000) {
			money=30000;
		}
		System.out.println("자동차번호 :" + carNo);
		System.out.println("주차요금 :" + ((money==0)? "무료": money));
	}

}
