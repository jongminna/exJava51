package com.jslhrd.string;
public class Sawon {
	private int bun;//번호
	private String name;//이름
	private String birth;//생년월일(20020701)
	//private String birth2;//생년월일(2002년07월01일)	
	private String gender;//성별(M/F)
	//private int age;//나이
	private int pay;//급여
	public Sawon(int bun,String name, String birth, String gender, int pay) {
		this.bun=bun;
		this.name=name;
		this.birth=birth;
		this.gender=gender;
		this.pay=pay;
	}
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
/*	
	@Override
	public String toString() {
		String gender="여";
		if(this.gender.equals("M")) {
			gender="여";	
		}
		return bun+"\t"+name+"\t"+birth+"\t"+age+"\t"+gender+"\t"+pay;
	}
*/	
}