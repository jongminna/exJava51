// 세 수중 대, 중, 소
public class Exam_07 {
	public static void main(String[] args) {
		int a=70;
		int b=90;
		int c=67;
		System.out.println("Source :"+ a + "\t" + b + "\t" + c);
		if(a<b) {
			int imsi = a;
			a=b;
			b=imsi;
		}
		if(a<c) {
			int imsi=a;
			a=c;
			c=imsi;
		}
		if(b<c) {
			int imsi=b;
			b=c;
			c=imsi;
		}
		System.out.println("Sort:"+ a + "\t" + b + "\t" + c);
		
	}

}
