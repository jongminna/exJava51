/*  1  2  3  4  5  6  7  8  9  10
 *  11 12 13 14 15 16 17 18 19 20
 *  21 . . 
 *  91 92 93 94 05 06 97 98 99 100
 */
public class Exam_06 {
	public static void main(String[] args) {
		int n=0;
		while(n<100) {
			n++;
			System.out.print(n+"\t");
			if(n%10==0) {
				System.out.print("\n");
			}
		}
	}

}
