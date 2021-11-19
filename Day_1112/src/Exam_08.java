import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;//갯수
		int sum=0;//합
		System.out.print("자료입력:");
		int score;
		while(true) {
			score = scn.nextInt();
			//cnt++;
			if(score==-99) {
				break;
			}
			cnt++;
			sum+=score;
		}
		System.out.println("sum="+sum);
		System.out.println("avg="+(double)sum/cnt);
	}

}
