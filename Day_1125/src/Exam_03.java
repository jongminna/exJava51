class Student{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	
	public void totAve() {
		tot = kor+eng+mat;
		ave=tot/3.;
	}
	public void stuPrint() {
		System.out.print(bun+"\t"+name+"\t"+kor+"\t");
		System.out.println(eng+"\t"+mat+"\t"+tot+"\t"+ave);
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.bun=1;
		s1.name="김학생";
		s1.kor=90;
		s1.eng=100;
		s1.mat=100;
		s1.totAve();
		s1.stuPrint();
		
		s2.bun=2;
		s2.name="박학생";
		s2.kor=90;
		s2.eng=100;
		s2.mat=100;
		s2.totAve();
		s2.stuPrint();
		
	}

}
