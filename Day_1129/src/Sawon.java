
public class Sawon {
	String id;//아이디
	int grade;//등급
	int timeMoney;//시급
	int time;//근무시간
	int weekPay;//주간급여
	public Sawon() {}
	public Sawon(String id, int grade,int time) {
		this.id=id;
		this.grade=grade;
		this.time=time;
		getGrade();
		weekPay();
	}
	
	private void getGrade() {
	      if(grade==1) {
	    	  timeMoney=10000;
	      }else if(grade==2) {
	    	  timeMoney=5000;
	      }else {
	    	  timeMoney=2000;
	      }
	}
	
	private void weekPay() {
	    int oti=0;//초과근무시간
	    int bti=time;//실제근무시간 출력용
	    if(bti>36) {
	    	if(bti>50) {
	    		oti=14;
	    	}else {
	    		oti=bti-36;
	    	}
	    	bti=36;//기본근무시간
	    }else {
	    	oti=0;
	    }
	    weekPay = (int)(bti*timeMoney+(oti*timeMoney*1.5));
	}
	
	public void sawonPaint() {
		System.out.print(id+"\t"+grade+"\t"+timeMoney+"\t");
		System.out.print(time+"\t"+weekPay+"\n");
	}
}
