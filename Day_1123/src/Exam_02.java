import java.util.Scanner;
public class Exam_02 {
	static int student[][] = new int[20][7];
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		while(cnt<20) {
			System.out.print("학생등록:");
			student[cnt][0] = scn.nextInt();
			if(student[cnt][0]==0) {
				break;
			}
			student[cnt][1] = scn.nextInt();
			student[cnt][2] = scn.nextInt();
			student[cnt][3] = scn.nextInt();
			student[cnt][4] =student[cnt][1]+student[cnt][2]+student[cnt][3];
			cnt++;
		}
		//순위 계산
		studentRank(cnt);
		//출력 형식 -1
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int x=0; x<cnt; x++) {
			for(int y=0; y<student[x].length-1; y++) {
				System.out.print(student[x][y]+"\t");
			}
			System.out.println();
		}
		//순위를 기준으로 오름차순 정렬
		studentSort(cnt);
		
		// 반편성
		studentBunban(cnt);
		
		//출력 형식 -2
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위\t반");
		for(int x=0; x<cnt; x++) {
			for(int y=0; y<student[x].length; y++) {
				System.out.print(student[x][y]+"\t");
			}
			System.out.println();
		}
		
	}
	
	// 순위 계산
	static void studentRank(int cnt) {
		for(int x=0; x<cnt; x++) {
			student[x][5] = 1;
			for(int y=0; y<cnt; y++) {
				if(student[x][4]<student[y][4]) {
					student[x][5]++;
				}
			}
		}
	}

	//석차를 기준으로 오름차순 정렬
	static void studentSort(int cnt) {
		for(int x=0; x<cnt-1; x++) {
			for(int y=x+1; y<cnt; y++) {
				if(student[x][5]>student[y][5]) {
					for(int k=0; k<student[x].length; k++) {
						int imsi = student[x][k];
						student[x][k] = student[y][k];
						student[y][k] = imsi;
					}
				}
			}
		}
	}
	
	//반 편성( 3개반 )
	static void studentBunban(int cnt) {
		int ban=0;
		boolean sw=true;
		for(int x=0; x<cnt; x++) {
			if(sw) {
				student[x][6]=++ban;
				if(ban==3) {
					sw=false;
					ban++;
				}
			}else {
				student[x][6]=--ban;
				if(ban==1) {
					sw=true;
					ban=0;
				}
			}
		}
	}
}
