
public class Exam_01 {
	public static void main(String[] args) {
		int cnt=0, loop=0;
		for(int x=0; x<5; x++) {//row
			if(x%2==0) {
				loop=loop+1;
				cnt=loop;
				for(int y=0; y<5; y++) {//col
					System.out.print(cnt+"\t");
					cnt++;
				}
				System.out.print("\n");
			}else {
				loop=loop+9;
				cnt=loop;
				for(int y=0; y<5; y++) {//col
					System.out.print(cnt+"\t");
					cnt--;
				}
				System.out.print("\n");
			}
		}
	}

}
