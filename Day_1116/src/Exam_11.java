import java.util.Arrays;
import java.util.Scanner;

/* 7개의 데이터를 입력 받아서 평균에 가장 까까운 값을 출력
 * [입력 예시]
 * 입력 : 79 90 0 87 -9 77 56 45 78 56 78 
 * -> 입력자료가 1~100가 아니면 입력자료로 사용하지 않는다
 * [출력 예시]
 * 입력자료 : 79  90  87  77  56  45  78
 * 평균 : 75
 * 평균에 가장 가가운 점수 : 77
 */
public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[7];
		//입력작업
/*		int cnt=0;//데이터 카운트
		System.out.print("입력자료:");
		while(cnt<7) {
			score[cnt]=scn.nextInt();
			if(score[cnt]>=1 && score[cnt]<=100) {
				cnt++;
			}
		}
*/		
		System.out.print("입력자료:");
		for(int x=0; x<score.length; x++) {
			int a = scn.nextInt();
			if(a<1 || a>100) {
				x--;
				continue;
			}
			score[x]=a;
		}
		//System.out.println(Arrays.toString(score));
		//처리
		int sum = 0;//총점
		for(int x : score) {
			sum += x;
		}
		int ave = sum/score.length;
		int min = (score[0]>ave)?score[0]-ave:ave-score[0];
		int minScore=score[0];
		
		for(int x=1; x<score.length; x++) {
			int temp;
			if(score[x]>ave) {
				temp = score[x]-ave;
			}else {
				temp = ave-score[x];
			}
			if(min > temp) {
				min=temp;
				minScore=score[x];
			}
		}
		//출력작업
		
	}//main()끝
	
}
