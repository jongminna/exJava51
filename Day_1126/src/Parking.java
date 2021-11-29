
public class Parking {
	String carNo;
	int parkTime;
	int money;
	public Parking() {}
	public Parking(String carNo, int parkTime) {
		this.carNo=carNo;
		this.parkTime=parkTime;
		pay();
	}
	
	private void pay() {
		if(parkTime<10) {
			money=0;
		}else if(parkTime>10 && parkTime<=30) {
			money=500;
		}else {
			money=500+(((parkTime-21)/10)*500);
		}
		if(money>30000)
			money=30000;
	}
	
	private void pay2() {
		int time = parkTime;
		if(time>10) {
			money=500;
		    if(time>30) {
		    	time=time-30;
		    	int na = time/10;
		    	if(time%10!=0) {
		    		na=na+1;
		    	}
		    	money = money+na*500;
		    }
		}
		if(money>30000) {
			money=30000;
		}
	}
	
	private void pay3() {
		int temp=parkTime;
		if(temp>=10) {
			money=500;//기본요금
			if(temp>=30) {
				temp-=30;
				while(temp>=1) {
					money += 500;
	                temp-=10;
	             }
	             if(money>30000) {
	            	 money=30000;
	             }
			}
		}
	}
	public void dataPrint() {
		System.out.println(carNo+"\t"+parkTime+"\t"+money);
	}
}
