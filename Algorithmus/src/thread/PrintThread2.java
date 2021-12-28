//무한 반복해서 출력하는 스레드
package thread;
public class PrintThread2 extends Thread {
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중 !!");
				Thread.sleep(1);
			}
		}catch(InterruptedException e) {}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}
