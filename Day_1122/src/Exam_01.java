
public class Exam_01 {
	public static void main(String[] args) {
		int student[][]= {{1,1,90},{1,2,80},{1,3,77},
				{2,1,90},{2,2,80},{2,3,77},
				{3,1,90},{3,2,80},{3,3,77},{3,4,95}};
		System.out.println("반\t번호\t점수");
		for(int x=0; x<student.length;x++) {
			for(int y=0; y<student[x].length; y++) {
				System.out.print(student[x][y]+"\t");
			}
			System.out.println();
		}
		//반출력시 같으반이면 반 생략
		System.out.println("반\t번호\t점수");
		System.out.println(student[0][0]+"\t"+student[0][1]+"\t"+student[0][2]);
		int ban=student[0][0];//반 기억
		for(int x=1; x<student.length; x++) {
			if(ban==student[x][0]) {// 같은 반
				System.out.println(""+"\t"+student[x][1]+"\t"+student[x][2]);
			}else {//반이 바뀌면
				System.out.println(student[x][0]+"\t"+student[x][1]+"\t"+student[x][2]);
				ban=student[x][0];
			}
		}
	}

}
