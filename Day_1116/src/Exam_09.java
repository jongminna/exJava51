import java.util.Arrays;

/*  10진수를 2진수 변환
 */
public class Exam_09 {
	public static void main(String[] args) {
		int dec = 25;
		int bin[] = new int[10];
		int cnt=0;
		int imsi=dec;
		do {
			int na = imsi %2;
			bin[cnt] = na;// 나머지를 배열에  저장
			imsi /= 2;
			cnt++;
		}while(imsi !=0);
		System.out.println("10진수 : " + dec);
		System.out.print("2진수 : " );
		for(int x = cnt-1; x>=0; x--) {
			System.out.print(bin[x]+ " ");
		}
	}

}
