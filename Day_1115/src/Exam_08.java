//행열처리
/*   * * * * *
 *   * * * * *
 *   * * * * *
 *   * * * * *
 *   * * * * * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------");
		for(int x=1; x<=5; x++) {
			for(int y=5; y>0; y--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.println("-----------------");
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
