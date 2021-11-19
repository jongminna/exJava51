//1차원 배열을 이용한 오름차순, 내리차순 정렬 법
//거품(Bubble Sort)
public class Exam_04 {
	public static void main(String[] args) {
		int score[] = {90,88,95,84,80,78,50,77};
		System.out.print("Source Data : ");
		for(int x : score) {
			System.out.print(x +"\t");
		}
		System.out.print("\n");
		//정렬
		for(int x=0; x<score.length; x++) {
			//boolean flag=true;
			int sw=0;
			for(int y= 0; y<score.length-x-1; y++) {
				if(score[y]>score[y+1]) {
					int imsi=score[y];
					score[y]=score[y+1];
					score[y+1]=imsi;
					//flag=false;
					sw=1;
				}
			}
			//if(flag) {
			if(sw==0) {
				break;
			}
		}
		System.out.print("Sort Data : ");
		for(int x : score) {
			System.out.print(x +"\t");
		}
		System.out.print("\n");
	}

}
