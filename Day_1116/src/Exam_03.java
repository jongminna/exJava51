import java.util.Arrays;

public class Exam_03 {
	public static void main(String[] args) {
		int var[] = {10,20,30,40,50,60};
	
		System.out.print(Arrays.toString(var));
		System.out.print("\n");
		
		int sum=0;
		for(int x=0; x<var.length; x++) {
			System.out.print(var[x]+"\t");
			sum+=var[x];
		}
		System.out.print("\n");
		System.out.print("합계 :" + sum +"\n");
		
		int tot=0;
		for(int x : var) {
			System.out.print(x+"\t");
			tot+=x;
		}
		System.out.print("\n");
		System.out.print("합계 :" + tot +"\n");
		
	}

}
