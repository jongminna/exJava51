class BB{
	int x=10;
}
class CC{
	private CC() {}
	private static CC instance = new CC();
	
	public static CC getInstance() {
		return instance;
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		BB b1 = new BB();
		BB b2 = new BB();
		if(b1==b2) {
			System.out.println("==");
		}else {
			System.out.println("xx");
		}
		
		//CC c1 = new CC();
		CC c1 = CC.getInstance();
		CC c2 = CC.getInstance();
		if(c1==c2) {
			System.out.println("==");
		}else {
			System.out.println("xx");
		}
		
	}

}
