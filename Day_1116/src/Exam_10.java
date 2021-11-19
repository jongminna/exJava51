/* 화폐매수
 * 
 */
public class Exam_10 {
	public static void main(String[] args) {
		int money[]= {50000,10000,5000,1000,
				500,100,50,10,5,1};
		int pay = 278957;
		for(int x=0; x<10; x++) {
			System.out.print(money[x]+"원 : ");
			int mok = pay/money[x];
			System.out.println(mok);
			pay %= money[x];
		}
		

	}

}
