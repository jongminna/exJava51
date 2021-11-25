class Hak{
	int bun;
	String name;
	int kor,eng,mat,tot;
	double ave;
	Hak(){}
	Hak(int bun){
		this(bun,"김학생");
		this.bun=bun;
	}
	Hak(int bun, String name){
		//this.bun=bun;
		this.name=name;
	}
	Hak(int bun,String name,int kor,int eng,int mat){
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		totAve();
		hakPrint();
	}
	
	public void totAve() {
		tot=kor+eng+mat;
		ave=tot/3.;
	}
	public void hakPrint() {
		System.out.print(bun+"\t"+name+"\t"+kor+"\t"+eng+"\t");
		System.out.print(mat+"\t"+tot+"\t"+ave+"\n");
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		int bun=1;
		String name="김학생";
		int kor=90;
		int eng=90;
		int mat=90;
		Hak h1 = new Hak();
		h1.hakPrint();
		//Hak h2 = new Hak(bun,name,kor,eng,mat);
		//h2.totAve();
		//h2.hakPrint();
		
		Hak h3 = new Hak(10);
		h3.hakPrint();
	}

}
