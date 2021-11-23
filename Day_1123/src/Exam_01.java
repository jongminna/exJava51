import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String sawon[][] = new String[20][3];
		int pay[] = new int[20];
		int cnt;
		for(cnt=0; cnt<20; cnt++) {
			System.out.print("사원등록:");
			sawon[cnt][0] = scn.next();//부서입력
			if(sawon[cnt][0].equalsIgnoreCase("end")) {
				break;
			}
			sawon[cnt][1] = scn.next();//사번입력
			sawon[cnt][2] = scn.next();//이름입력
			pay[cnt] = scn.nextInt();//급여입력
		}
		//출력
		System.out.println("부서명\t사번\t이름\t급여");
		System.out.println(sawon[0][0]+"\t"+sawon[0][1]+"\t"
					+sawon[0][2]+"\t"+pay[0]);
		String buse = sawon[0][0];//부서기억
		int btot = pay[0];//부서별 합계
		int total=0;//전체합계
		for(int x=1; x<cnt; x++) {
			if(buse.equals(sawon[x][0])) {
				System.out.println(" "+"\t"+sawon[x][1]+"\t"
						+sawon[x][2]+"\t"+pay[x]);
				btot += pay[x];//부서별합계
			}else {
				System.out.println("부서합계 :\t\t\t" + btot);
				System.out.println();
				System.out.println(sawon[x][0]+"\t"+sawon[x][1]+"\t"
						+sawon[x][2]+"\t"+pay[x]);
				total += btot;//전체합계
				btot = pay[x];//부서별합계
			}
		}
		total += btot;//전체합계		
		System.out.println("부서합계 :\t\t\t" + btot);
		System.out.println("전체합계 :\t\t\t" + total);
		
	}

}
