import java.util.Arrays;

public class Exam_06 {
	public static void main(String[] args) {
		int var[] = {1,2,3,4,5};
		int temp[] = var;// 공유
		
		int imsi[] = var.clone();
		
		
		System.out.println(Arrays.toString(var));
		System.out.println(Arrays.toString(temp));
		
		//var[1]=100;
		System.out.println(Arrays.toString(var));
		System.out.println(Arrays.toString(temp));
		
		System.out.println("배열 복제");
		System.out.println(Arrays.toString(var));
		System.out.println(Arrays.toString(imsi));
		imsi[1]=55;
		System.out.println(Arrays.toString(var));
		System.out.println(Arrays.toString(imsi));
		
		
	}

}
