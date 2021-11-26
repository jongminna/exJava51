
public class SawonPay {
	String name;
	int pay;
	int money[] = new int[10];
	public SawonPay() {}
	public SawonPay(String name, int pay) {
		this.name=name;
		this.pay=pay;
		// 화페매수 계산 메소드 호출
		moneyPay();
	}
	
	//화폐매수계산메소드 구현
	private void moneyPay() {
		int won[]= {50000,10000,5000,1000,500,100,50,10,5,1};
		int temp=pay;
		for(int x=0; x<won.length; x++) {
			money[x]=temp/won[x];
			temp %= won[x];
		}
	}
	//출력메소드 구현
	public void sawonPayPrint() {
		System.out.print(name+"\t"+pay+"\t");
		for(int x=0; x<money.length;x++) {
			System.out.print(money[x]+"\t");
		}
		System.out.println();
	}
}
