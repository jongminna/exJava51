
public class Exam_02 {
	public static void main(String[] args) {
		int[] arr;//배열 변수 선언
		arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println("배열 길이 :" + arr.length);
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x]+"\t");
		}
		
	}

}
