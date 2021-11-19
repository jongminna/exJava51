import java.util.Scanner;

//정수 3개입력 +,-,*,/,% 를 계산 하는 프로그램 작성
//입력 예시) 정수입력 : 1 7 3(첫 정수가 1(+),2(-),3(*),
//4(/),5(%)
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력:");
		int op=scanner.nextInt();
		int va1 = scanner.nextInt();
		int va2 = scanner.nextInt();
		if(op==1) {
			System.out.println(va1+"+"+va2+"="+(va1+va2));
		}else if(op==2) {
			System.out.println(va1+"-"+va2+"="+(va1-va2));
		}else if(op==3) {
			System.out.println(va1+"*"+va2+"="+(va1*va2));
		}else if(op==4) {
			System.out.println(va1+"/"+va2+"="+(va1/va2));
		}else if(op==5) {
			System.out.println(va1+"%"+va2+"="+(va1%va2));
		}else {
			System.out.println("연산자 오류");
		}			
	}
}
