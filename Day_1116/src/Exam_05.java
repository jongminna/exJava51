import java.util.Scanner;

/*  정수 7개를 입력 받아서 최대, 최소, 합계, 평균을 구하여 출력
 *  [입력예시]
 *  정수 1 : 97
 *  정수 2 : 55
 *    .   .  
 *  정수  7 : 85
 *  [출력 예시]
 *  입력자료 : 97  55  . . . .  85
 *  최대값 :  xx
 *  최소값 :  xx
 *  합계 :  xx
 *  평균 :  xx.xx  
 */
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[7];
		//입력 작업
		for(int x=0; x<score.length; x++) {
			System.out.print("정수 "+(x+1)+" : ");
			score[x]=scn.nextInt();
		}
		//처리작업(최대, 최소, 합계, 평균)
		int max=score[0];
		int min=score[0];
		int sum=score[0];
		for(int x=1; x<score.length; x++) {
			if(max<score[x]) {
				max=score[x];
			}else if(min>score[x]) {
				min=score[x];
			}
			sum+=score[x];
		}
		double ave = sum/7.;
		//출력작업
		System.out.print("입력자료 : ");
		for(int x : score) {
			System.out.print(x +"\t");
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ave);
		
		
		
	}

}
