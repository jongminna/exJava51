import java.util.Scanner;

// 키보드로 정수 10개를 입력 받아서 
// 50~90사이의 합과 평균을 구하여 출력
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		int sum=0;
		while(cnt != 10) {//(cnt<10)
			System.out.print("점수 :");
			int a = scn.nextInt();
			cnt++;
			if(a>=50 && a<=90) {
				sum+=a;
			}
		}
		
		System.out.println("합 : " + sum);

	}

}
