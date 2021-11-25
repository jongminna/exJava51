
public class Exam_01 {
	public static void main(String[] args) {
		Mouse m;// 레퍼런스 변수
		m = new Mouse();//객체생성(인스턴스)
		System.out.println(m.name);
		m.name="돌마우스";
		System.out.println(m.name);
		m.oneClick();
		Mouse m2 = new Mouse();
		
	}

}
