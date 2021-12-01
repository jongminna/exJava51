package com.jslhrd.sawon;
public class Sawon {
	private String sabun;//사원번호
	private String name;//이름
	private int pay;//출장비
	private int[] money = new int[10];//화폐단위
	
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int[] getMoney() {
		return money;
	}
	public void setMoney(int[] money) {
		this.money = money;
	}
	
	//화폐매수 계산 메소드
	public void payAccount() {
		int won[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		int tmp = pay;
		for(int x=0; x<won.length;x++) {
			money[x] = tmp/won[x];
			tmp %= won[x];
		}
	}
	
	// 출력
	public void sawonPrint() {
		System.out.print(sabun+"\t"+name+"\t"+pay+"\t");
		for(int x=0; x<money.length; x++) {
			System.out.print(money[x]+"\t");
		}
		System.out.println();
	}
	
	
}
