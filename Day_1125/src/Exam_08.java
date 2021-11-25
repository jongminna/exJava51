import java.util.Scanner;

class Sawon{
	int sabun;
	String name;
	int age;
	
	Sawon(){}
	Sawon(int sabun, String name, int age){
		this.sabun=sabun;
		this.name=name;
		this.age=age;
	}
	public void sawonPrint() {
		System.out.println(sabun+"\t"+name+"\t"+age);
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sawon[] sawon = new Sawon[10];
		int cnt=0;
		Sawon s;
		while(cnt<10) {
			System.out.print("사원등록:");
			int sabun = scn.nextInt();
			if(sabun==0) {
				break;
			}
			String name= scn.next();
			int age=scn.nextInt();
			//s = new Sawon(sabun,name,age);
			//sawon[cnt] = s;
			sawon[cnt] = new Sawon(sabun,name,age);
			cnt++;
		}
		//출력
		int count=0;
		System.out.println("사원번호\t이름\t나이");
		for(int x=0; x<cnt; x++) {
			sawon[x].sawonPrint();
			if(sawon[x].age>26) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
