// 1 ~ 100 까지의 정수를 이용하여 다음과 같이 출력되는 프로그램 완성
// s = 1-2+3-4+5-6+7 . . . +99-100
public class Exam_07 {
	public static void main(String[] args) {
		int cnt = 0;//1 2 3 4 5 6
		int sum = 0; //+1-2+3-4
		while(cnt<100) {
			cnt++;
			if(cnt%2==1) {//홀수
				sum+=cnt;//sum=sum+cnt
			}else {//짝수
				sum-=cnt;//sum=sum-cnt
			}
		}
		System.out.println("sum :" +sum);
	}

}
