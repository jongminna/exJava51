import java.util.Scanner;

/* 점수 (1~100 사이) 7개를 입력 받아서 최대값, 최소값를 뺀 나머지 합계, 
 * 평균을  구하여 출력
      단. 입력점수의 범위를 벗어난 값이 입력될경우 “입력오류”를 출력 후 재입력한다.  
      평균이 100~87 이면 “A”, 86~73이면 “B”, 72~55이면 “C”, 0~55이면 ’D” 출력한다.
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score;
		while(true) {
		System.out.print("점수입력:");
			score = scn.nextInt();
			if(score>=1 && score <=100) {
				break;
			}
		}
		int max=score; //최대값
		int min=score; //최소값
		int sum=score; //합계
		int cnt=1; // 갯수 카운트
		
		while(cnt<7) {
			System.out.print("점수입력:");
			score = scn.nextInt();
			if(score<1 || score>100) {
				System.out.print("입력오류");
				continue;
			}
			
			if(max<score) {
				max=score;
			}else if(min>score) {
				min=score;
			}
			cnt++;//객수카운트
			sum+=score;//합계
		}//while()끝
		//최대, 최소을 뺀 5개의 합
		sum = sum - max-min;
		double ave = (int)(sum/5.*10+0.5)/10.;
		
		String hak="D";
		if(ave>=87) {
			hak="A";
		}else if(ave>=73) {
			hak="B";
		}else if(ave>=55) {
			hak="C";
		}
		
		System.out.println("최대점수:"+max);
		System.out.println("최소점수:"+min);
		System.out.println("합계:"+sum);
		System.out.println("평균:"+ave+"("+hak+")");
		
	}//main()끝

}
