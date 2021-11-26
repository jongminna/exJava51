import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int a = scn.nextInt();
		if(a>=80) 
			System.out.println("합격");
		else
			System.out.println("불합격");
	}

}
