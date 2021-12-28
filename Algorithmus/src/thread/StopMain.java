//1초후 출력 스레드를 중지
package thread;
public class StopMain {
	public static void main(String[] args) {
		PrintThread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		thread.setStop(true);
	}

}
