import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("이름 :");
		String n = scn.next();
		System.out.print("국어 :");
		int k = scn.nextInt();
		System.out.print("영어 :");
		int e = scn.nextInt();
		System.out.print("수학 :");
		int m = scn.nextInt();
		
		int t = k+e+m;
		int a =t/3;
/*		
		if(k>=40 && e>=40 && m>=40) {
			if(a>=60) {
				System.out.println("합격");
			}else{
				System.out.println("불합격");
				System.out.println("평균미만");
			}
		}else {
			System.out.println("불합격");
			System.out.println("과락");
		}
*/
		if(k>=40 && e>=40 && m>=40 && a>=60) {
				System.out.println("합격");
		}else {
			if(a<60) {
				System.out.println("불합격");
				System.out.println("평균미만");
			}else {
				System.out.println("불합격");
				System.out.println("과락");
			}
		}
		
	}

}
