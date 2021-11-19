import java.util.Arrays;
import java.util.Scanner;

//5개의 정수를 입력 받아서 합, 평균을 구하여 출력
/*  입력 : 60
       입력 : 70
       입력 : 88
       입력 : 95
       입력 : 56
    [출력예시]   
       입력 값 : 60 70 88 95 56
       합계 : xxx
       평균 : xx   
*/
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum=0;
		int[] val = new int[5];
		for(int x=0; x<5; x++) {
			System.out.print("Input :");
			//int score = scn.nextInt();
			//val[x]=score;
			//sum+=score;
			val[x] = scn.nextInt();
			sum+=val[x];
		}
		//System.out.print(Arrays.toString(val));
		System.out.print("입력값 :");
		for(int x : val) {
			System.out.print(x+"\t");
		}
		System.out.println();
		System.out.print("total : " + sum);
	}

}
