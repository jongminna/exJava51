import java.util.Scanner;

// 키보드로 정수 10개를 입력 받아서 
// 50~90사이의 합과 평균을 구하여 출력
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		while(true) {
			System.out.print("점수 :");
			int a = scn.nextInt();
			cnt++;
			if(cnt==10) {
				break;
			}
		}
		

	}

}
