import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int a = scn.nextInt();
		if(a>100) {
			System.out.println("입력오류");
			System.exit(0);
		}
		if(a>=90)
			System.out.println("수");
		else if(a>=80)
			System.out.println("우");
		else if(a>=70)
			System.out.println("미");
		else if(a>=60)
			System.out.println("양");
		else 
			System.out.println("가");
	
	}

}
