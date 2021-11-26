import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 a :");
		int a = scn.nextInt();
		System.out.print("입력 b :");
		int b = scn.nextInt();
		int max=0, min=0;
		if(a>b) {
			max=a;
			min=b;
		}else if(a<b) {
			max=b;
			min=a;
		}else {
			System.out.println("==");
			System.exit(0);
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
