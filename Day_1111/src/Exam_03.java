
public class Exam_03 {
	public static void main(String[] args) {
		int kor=95;
		int eng=88;
		int mat=79;
		int tot = kor+eng+mat;
		double ave = tot/3.0;
		
		if(ave>=90) {
			System.out.println("A");
		}else if(ave>=80) {
			System.out.println("B");
		}else if(ave>=70) {
			System.out.println("C");
		}else if(ave>=60) {
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		
		switch ((int)ave/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}

}
