// 메소드 사용법
public class Exam_08 {
	public static void main(String[] args) {
		int data[] = {10, 20};
		System.out.println("data[0]="+data[0]+","
				+ "data[1]="+data[1]);
		
		swap(data);// 메소드 호출
		System.out.println("data[0]="+data[0]+","
				+ "data[1]="+data[1]);
	}
	
	static void swap(int a[]) {
		int c = a[0];
		a[0] = a[1];
		a[1] = c;
	}
	
}
