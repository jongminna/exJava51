
public class SawonProcess {
	Sawon[] sawon;
	int cnt;
	
	public SawonProcess(Sawon[] sawon, int cnt) {
		this.sawon=sawon;
		this.cnt = cnt;
	}
	
	public void dataPrint() {
		int timetot=0;
		int weekPaytot=0;
		System.out.println("아이디\t등급\t시급\t근무시간\t주간급여");
		for(int x=0; x<cnt; x++) {
			sawon[x].sawonPaint();
			timetot += sawon[x].time;
			weekPaytot += sawon[x].weekPay;
		}
		System.out.println("합계 : \t\t\t"+ timetot +"\t" + weekPaytot);
	}
	
	public void weekPayMax() {
		Sawon maxSawon = sawon[0];
		for(int x=1; x<cnt; x++) {
			if(maxSawon.weekPay<sawon[x].weekPay) {
				maxSawon = sawon[x];
			}
		}
		System.out.println("주간급여를 가장 많이 받는 사원");
		System.out.println("아이디\t주간급여");
		System.out.println(maxSawon.id +"\t"+maxSawon.weekPay);
	}	
}
