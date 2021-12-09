package com.jslhrd.string;
public class SawonData {
	Sawon[] sawon;
	int cnt;
	public SawonData(Sawon[] sawon, int cnt) {
		this.sawon=sawon;
		this.cnt=cnt;
	}
	private String birthReplace(String birth) {
		String year = birth.substring(0,4);
		String month = birth.substring(5,7);
		String day = birth.substring(8);
		
		return year+"년"+month+"월"+day+"일";
	}
	
	private int reAge(String birth) {
		String year = birth.substring(0,4);
		int age = 2022-Integer.parseInt(year);
		return age;
	}
	
	public void sawonPrint() {
		for(int x=0; x<cnt; x++) {
			System.out.print(sawon[x].getBun()+"\t");
			System.out.print(sawon[x].getName()+"\t");
			System.out.print(birthReplace(sawon[x].getBirth())+"\t");
			System.out.print(reAge(sawon[x].getBirth())+"\t");
			String gender="여";
			if(sawon[x].getGender().equals("M")) {
				gender="남";
			}
			System.out.print(gender+"\t");
			System.out.print(sawon[x].getPay()+"\n");
		}
	}
}
