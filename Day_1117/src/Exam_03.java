//1차원 배열을 이용한 오름차순, 내리차순 정렬 법
//선택정렬법
public class Exam_03 {
	public static void main(String[] args) {
		int score[] = {90,88,95,84,80,78,50,77};
		System.out.print("Source Data : ");
		for(int x : score) {
			System.out.print(x +"\t");
		}
		System.out.print("\n");
		//정렬
		for(int x=0; x<score.length-1; x++) {
			for(int y= x+1; y<score.length; y++) {
				if(score[x]>score[y]) {
					int imsi=score[x];
					score[x]=score[y];
					score[y]=imsi;
				}
			}
		}
		System.out.print("Sort Data : ");
		for(int x : score) {
			System.out.print(x +"\t");
		}
		System.out.print("\n");
	}

}
