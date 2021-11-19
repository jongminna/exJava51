import java.util.Scanner;

//키보드를 정수를 입력 받아서 80이상이면 "Pass" 출력
public class Exam_01 {
	public static void main(String[] ar){
		Scanner scn = new Scanner(System.in);
		System.out.print("정수를 입력하세요?");
		int score = scn.nextInt();
		if(score>=80) {
			System.out.println("Pass");
		}else {
			System.out.println("No");
		}
		System.out.println("프로그램종료");
		
	}
}

