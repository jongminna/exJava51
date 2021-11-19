import java.util.Scanner;

/* 키보드로 1 ~ 100사이 정수 7개를 입력 받아서
 * 최대값, 최소값을 찾아서 출력
 */
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력 :");
		int score = scn.nextInt();
		int max=score;
		int min=score;
		int cnt=1;//카운트용
		while(cnt<7) {
			score = scn.nextInt();
			if(score>0 && score<=100) {
				cnt++;
				if(max < score) {
					max=score;
				}else if(min>score) {
					min=score;
				}
			}else {
				System.out.println("입력자료는 1 ~100 만 가능");
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
	}

}
