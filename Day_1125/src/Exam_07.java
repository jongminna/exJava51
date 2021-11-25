class Cal{
	//1 ~ 100까지 합계를 구하여 출력
	public void add() {
		int sum =0;
		for(int x=1; x<=100; x++) {
			sum+=x;
		}
		System.out.println("1 ~ 100 합 :" + sum);
	}
	//1. 2 ~ M까지 소수를 출력(한줄에 5개씩)
	public void primary(int m) {
		int cnt=0;
		for(int x=2; x<=m; x++) {
			int y;
			for(y=2; y<=x; y++) {
				if(x%y==0) {
					break;
				}
			}
			if(x==y) {
				System.out.print(x+"\t");
				cnt++;
				if(cnt%5==0) {
					System.out.println();
				}
			}
		}
	}
	//정수(2 ~ 100)을 정수를 받아서 2진수로 변환후 결과 반환
	public String binary(int dec) {
		String bin="";	
		while(dec>0) {
			int na = dec%2;
			bin=na+bin;
			dec = dec / 2;
		}
		return bin;
	}
	//n개의 정수 배열을 받아서 합을 구하여 출력
	public void array(int [] aa) {
		int sum=0;
		for(int x=0; x<aa.length;x++) {
			sum+=aa[x];
		}
		System.out.println("sum="+sum);
	}
	
}
public class Exam_07 {
	public static void main(String[] args) {
		Cal c = new Cal();
		c.add();
		c.primary(50);
		String str = c.binary(25);
		System.out.println("10진수 25는 2진수 :" + str);
		
		c.array(new int[] {1,2,3,4,5,6,7,8,9});
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		c.array(a);
	}

}
