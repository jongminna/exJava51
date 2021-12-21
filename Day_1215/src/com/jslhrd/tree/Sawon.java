package com.jslhrd.tree;
public class Sawon implements Comparable<Sawon>{
	private int sabun;
	private String name;
	private String gender;
	private String birth;
	private int age;
	public Sawon() {}
	public Sawon(int sabun,String name,String gender,String birth) {
		this.sabun=sabun;
		this.name=name;
		this.gender=gender;
		this.birth=birth;
		ageCount();
	}
	//나이계산 메서드 정의
	private void ageCount() {
		int year=Integer.parseInt(birth.substring(0,4));
		age = 2021-year;
	}
	//사원번호가 같을 경우 동일 객체 처리
/*	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Sawon) {
			Sawon sa = (Sawon)obj;
			return sabun==sa.sabun;
		}else
			return false;
	}
	@Override
	public int hashCode() {
		return sabun;
	}
*/	
	//TreeSet 저장시 정렬 기준 설정
	@Override
	public int compareTo(Sawon o) {
		return Integer.compare(sabun, o.sabun);
	}
	//객체 자신 출력
	@Override
	public String toString() {
		String gender ="여자";
		if(this.gender.equalsIgnoreCase("m"))
			gender="남자";
		return sabun+"\t"+name+"\t"+gender+"\t"+birth+"\t"+age;
	}
}
