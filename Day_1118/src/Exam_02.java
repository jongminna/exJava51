import java.util.Arrays;
import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		int ave[] = {78,90,88,56,79,84,73,95,66,93,85,77};
		//오름차순 정렬 메소드 호출
		dataSort(ave);
		System.out.println(Arrays.toString(ave));
		//검색
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("점수 :");
			int score = scn.nextInt();
			if(score==-99) {
				break;
			}
			// 이진검색 시작
			int low=0, high=ave.length-1;
			while(true) {
				if(low>high) {
					System.out.println(score+"는 없음");
					break;
				}
				int m = (low+high)/2;
				if(ave[m]==score) {
					System.out.println(score+"는 "+m+"번째있음");
					break;
				}
				if(ave[m]>score) {
					high = m-1;
				}else {
					low = m+1;
				}
			}
		}
	}
	
	//데이터 오름차순 정렬
	static void dataSort(int[] a) {
		for(int x=0; x<a.length-1; x++) {
			for(int y=x+1; y<a.length; y++) {
				if(a[x]>a[y]) {
					int t=a[x];
					a[x]=a[y];
					a[y]=t;
				}
			}
		}
	}
}
