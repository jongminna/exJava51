import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력:");
		String op=scanner.next();
		int va1 = scanner.nextInt();
		int va2 = scanner.nextInt();
		
		switch(op) {
		case "+":
			System.out.println(va1+"+"+va2+"="+(va1+va2));
			break;
		case "-":
			System.out.println(va1+"-"+va2+"="+(va1-va2));
			break;
		case "*":
			System.out.println(va1+"*"+va2+"="+(va1*va2));
			break;
		case "/":
			System.out.println(va1+"/"+va2+"="+(va1/va2));
			break;
		case "%":
			System.out.println(va1+"%"+va2+"="+(va1%va2));
			break;
		default:
			System.out.println("오류");
		}

	}

}
