//행열처리
public class Exam_09 {
	public static void main(String[] args) {
		//1)
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=6-x; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------");

		//2)
		for(int x=1; x<=5; x++) {
			for(int k=1; k<x; k++) {
				System.out.print(" ");
			}
			for(int y=1; y<=6-x; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------");
	
		//3
		for(int x=1; x<=5; x++) {
			for(int k=1; k<6-x; k++) {
				System.out.print(" ");
			}
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------");
		
		//4
		for(int x=1; x<=5; x++) {
			for(int k=1; k<6-x; k++) {
				System.out.print(" ");
			}
			for(int y=1; y<=x*2-1; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------");
		
	
	}

}
