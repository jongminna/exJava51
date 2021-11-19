// 세 수중 가장 큰값 찾기
public class Exam_06 {
	public static void main(String[] args) {
		int a=70;
		int b=90;
		int c=67;
		System.out.println("Source :"+ a + "\t" + b + "\t" + c);

		int max=(a>b)?a:b;
		max=(max<c)?c:max;
		
		System.out.println("max : " + max);
	}

}
