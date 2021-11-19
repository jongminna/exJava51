
public class Exam_02 {
	public static void main(String[] args) {
		int n=0;
		int s=0;
		while(true) {
			n++;
			s+=n;
			if(n==10) {
				break;
			}
		}
		System.out.println("1 ~ 10 합 :" +s);
	}

}
