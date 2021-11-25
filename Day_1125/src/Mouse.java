
public class Mouse {
	String name;//이름
	int btncnt;//버튼갯수
	boolean flag;// 유선&무선
	
	public void oneClick() {
		System.out.println("마우스가 클릭되었습니다");
	}
	public void doubleClick() {
		System.out.println("마우스가 더블클릭되었습니다");		
	}
	public void move() {
		System.out.println("마우스가 이동합니다");
	}
}
