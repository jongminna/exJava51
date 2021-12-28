package syncthread;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1"); //스레드이름 설정
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
