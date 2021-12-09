package com.jslhrd.string;
public class Member {
	private String name;
	private String birth;
	private String phone;
	private String gender;
	private int age;
	
	public Member(String name, String birth, String phone) {
		this.name=name;
		this.birth=birth;
		this.phone=phone;
		replaceMem();
	}
	private void replaceMem() {//성별, 나이 계산
		//성별 추출
		String gen = birth.substring(7).trim();
		String gen2 = String.valueOf(birth.charAt(birth.indexOf("-")+1));
		//년도 추출
		String year = birth.substring(0,2);
		
		//성별변환 및 나이계산
		if("1256".contains(gen)) { //1900~1999
			age = 2021-(1900+Integer.parseInt(year));
			if("15".contains(gen)) {
				gender="남";
			}else {
				gender="여";
			}
		}else {//2000~2099
			age = 2021-(2000+Integer.parseInt(year));
			if("37".contains(gen)) {
				gender="남";
			}else {
				gender="여";
			}
		}
	}
	@Override
	public String toString() {
		return name+"\t"+phone+"\t"+gender+"\t"+age;
	}
	
}
