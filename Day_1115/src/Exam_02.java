/* 1 ~ 100까지의 정수 중에서 홀수 합, 짝수합을 출력
 * 홀수 합 : 2500 
 * 짝수 합 : 2550
 */
public class Exam_02 {
	public static void main(String[] args) {
		int cnt=0;//1 2 3 4 5 6
		int odd=0;//홀수합
		int even=0;//짝수합
/*		while(cnt<100) {
			cnt++;
			if(cnt%2==1) {
				odd+=cnt;
			}else {
				even+=cnt;
			}
		}
*/
		for(cnt=1; cnt<=100; cnt++) {
			if(cnt%2==1) {
				odd+=cnt;
			}else {
				even+=cnt;
			}			
		}
		System.out.println("홀수합 :" + odd);
		System.out.println("짝수합 :" + even);
	}

}
