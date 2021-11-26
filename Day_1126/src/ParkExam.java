import java.util.Scanner;

public class ParkExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Parking[] park = new Parking[10];
		int cnt=0;
		while(cnt<10) {
			System.out.print("주차정보:");
			String carNo = scn.next();
			if(carNo.equals("0000"))
				break;
			int parkTime = scn.nextInt();
			park[cnt] = new Parking(carNo,parkTime);
			cnt++;
		}
		//출력
		System.out.println("번호\t주차시간\t주차요금");
		for(int x=0; x<cnt; x++) {
			park[x].dataPrint();
		}
	}

}
