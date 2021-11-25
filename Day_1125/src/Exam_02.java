class Korea{
	//멤버변수
	String nation="대한민국";//국적--> 명시적초기화
	String name;//이름
	String ssn;//주민번호
	public void test(int m) {
		int tot=0;
		for(int x=1; x<=m; x++) {
			tot+=x;
		}
		System.out.println("1 ~ "+m+"까지 합은 "+tot);
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Korea k = new Korea();
		k.test(100);
	}

}
