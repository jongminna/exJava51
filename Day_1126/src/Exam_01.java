import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student student[] = new Student[10];
		Student stu = null;
		int cnt=0;
		while(cnt<10) {
			System.out.print("등록:");
			int bun = scn.nextInt();
			if(bun==0)
				break;
			String name = scn.next();
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();
			stu = new Student(bun,name,kor,eng,mat);
			student[cnt] = stu;
			cnt++;
		}
		studentRank(student, cnt);
/*		
		// 석차 계산
		for(int x=0; x<cnt; x++) {
			student[x].rank=1;
			for(int y=0; y<cnt; y++) {
				if(student[x].tot<student[y].tot)
					student[x].rank++;
			}
		}
*/		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t판정\t석차");
		for(int x=0; x<cnt; x++) {
			//System.out.println(student[x].bun);
			student[x].stuPrint();
		}
		
		//오름차순 정렬
		studentBunSort(student, cnt);
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t판정\t석차");
		for(int x=0; x<cnt; x++) {
			//System.out.println(student[x].bun);
			student[x].stuPrint();
		}
	}
	
	// 석차게산 메소드 구현
	static void studentRank(Student[] stu, int cnt) {
		for(int x=0; x<cnt; x++) {
			stu[x].rank=1;
			for(int y=0; y<cnt; y++) {
				if(stu[x].tot<stu[y].tot)
					stu[x].rank++;
			}
		}
		
	}

	// 번호를 기준으로 오름차순 구현 메소드 구현
	static void studentBunSort(Student[] s, int a) {
		for(int x=0; x<a-1; x++) {
			for(int y=x+1; y<a; y++) {
				if(s[x].bun>s[y].bun) {
					Student imsi = s[x];
					s[x]=s[y];
					s[y]=imsi;
				}
			}
		}
	}
	
}
