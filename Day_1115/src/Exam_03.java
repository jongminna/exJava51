//1 ~ 100 홀수 합
public class Exam_03 {
	public static void main(String[] args) {
		int sum=0;
		for(int x=1; x<=100; x++) {
			if(x%2==1) {
				sum+=x;
			}else {
				continue;
			}
			
		}
	}

}
