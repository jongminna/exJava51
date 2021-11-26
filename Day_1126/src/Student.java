public class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	String by;
	int rank;
	public Student() {}
	public Student(int bun,String name,int kor, int eng,int mat) {
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		tot=kor+eng+mat;
		ave=tot/3;
		pangjeng();
		//stuPrint();
	}
	// 판정계산 메소드
	private void pangjeng() {
		if(ave>=90)
			by="수";
		else if(ave>=80)
			by="우";
		else if(ave>=70)
			by="미";
		else if(ave>=60)
			by="양";
		else
			by="가";
	}
	//자기자신을 출력
	public void stuPrint() {
		System.out.print(bun+"\t"+name+"\t");
		System.out.print(kor+"\t"+eng+"\t");
		System.out.print(mat+"\t"+tot+"\t");
		System.out.print(ave+"\t"+by+"\t"+rank+"\n");
	}
}
