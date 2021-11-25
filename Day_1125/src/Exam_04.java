import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Student s1 = null;
		while(true) {
			s1 = new Student();
			System.out.print("학생등록:");
			s1.bun = scn.nextInt();//번호
			if(s1.bun==0) {
				break;
			}
			s1.name=scn.next();//이름
			s1.kor=scn.nextInt();//국어
			s1.eng=scn.nextInt();//영어
			s1.mat=scn.nextInt();//수학
			s1.totAve();
			s1.stuPrint();
		}
		
		
	}

}
