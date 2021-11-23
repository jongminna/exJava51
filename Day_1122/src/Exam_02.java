import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int hak[][] = new int[20][3];
		//입력작업
		int cnt;
		for(cnt=0; cnt<hak.length; cnt++) {
			System.out.print("학생등록:");
			hak[cnt][0] = scn.nextInt();
			if(hak[cnt][0]==0) {
				break;
			}
			hak[cnt][1] = scn.nextInt();
			hak[cnt][2] = scn.nextInt();
		}
		
		//출력작업
		System.out.println("반\t반호\t체중");
		System.out.println(hak[0][0]+"\t"+hak[0][1]+"\t"+hak[0][2]);
		int ban =hak[0][0];
		int max = hak[0][2];//최대값
		int min = hak[0][2];//최소값
		for(int x=1; x<cnt; x++) {
			if(ban==hak[x][0]) {
				System.out.println(""+"\t"+hak[x][1]+"\t"+hak[x][2]);
			}else {
				System.out.println(hak[x][0]+"\t"+hak[x][1]+"\t"+hak[x][2]);
				ban=hak[x][0];
			}
			//최대&최소
			if(max<hak[x][2]) {
				max=hak[x][2];
			}else if(min>hak[x][2]) {
				min=hak[x][2];
			}
		}
		System.out.println("최대체중 : "+ max);
		System.out.println("최소체중 : "+ min);
	}

}
