package syncthread;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2"); //스레드이름 설정
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
