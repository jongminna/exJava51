// 세 수중 가장 큰값 찾기
public class Exam_05 {
	public static void main(String[] args) {
		int a=70;
		int b=90;
		int c=67;
		System.out.println("Source :"+ a + "\t" + b + "\t" + c);
		if(a<b) { 
			a=b;
		}
		if(a<c) {
			a=c;
		}
		System.out.println("Max :"+ a);
		
	}

}
