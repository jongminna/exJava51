//1초후 출력 스레드를 중지
package thread;
public class InterruptMain {
	public static void main(String[] args) {
		PrintThread2 thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		thread.interrupt();
	}

}
