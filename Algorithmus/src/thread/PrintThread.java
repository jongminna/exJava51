//무한 반복해서 출력하는 스레드
package thread;
public class PrintThread extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop=stop;
	}
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행중!!");
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}
