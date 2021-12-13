package com.jslhrd.list;

import java.util.ArrayList;
import java.util.List;

class Member{
	int bun;
	String name;
	int age;
	Member(){}
	Member(int bun, String name, int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+age;
	}
	//번호기준 정렬메소드
	public void memSort(List<Member> list) {
		for(int x=0; x<list.size()-1; x++) {
			for(int y=x+1; y<list.size(); y++) {
				Member m1 = list.get(x);
				Member m2 = list.get(y);
				if(m1.bun>m2.bun) {
					list.set(x, m2);
					list.set(y,m1);
				}
			}
		}
	}
	
}
public class ListEx_04 {
	public static void main(String[] args) {
		List<Member> mList = new ArrayList();
		mList.add(new Member(5,"DDD", 30));
		mList.add(new Member(2,"BBB", 25));
		mList.add(new Member(1,"FFF", 29));
		mList.add(new Member(3,"SSS", 31));
		mList.add(new Member(4,"CCC", 22));
		
		System.out.println(mList);
		System.out.println("------------------------------");
		System.out.println("번호\t이름\t나이");
		for(Member mem : mList) {
			System.out.println(mem);
		}
		
		// sor 메소드 호출
		Member m = new Member();
		m.memSort(mList);
		
		System.out.println("------------------------------");
		System.out.println("번호\t이름\t나이");
		for(Member mem : mList) {
			System.out.println(mem);
		}
		
	}

}
