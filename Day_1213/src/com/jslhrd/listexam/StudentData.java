package com.jslhrd.listexam;

import java.util.Collections;
import java.util.List;

public class StudentData {
	List<Student> sList;
	public StudentData(List<Student> sList) {
		this.sList=sList;
	}
	
	public void titlePrint(String title) {
		System.out.println("*** " + title+ " ***");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t판정");
	}
	public void sourceData() {
		for(Student stu : sList) {
			System.out.println(stu);
		}
	}
	
	public void sortData() {
		//오름차순 정렬
		for(int x=0; x<sList.size()-1; x++) {
			for(int y=x+1; y<sList.size(); y++) {
				Student s1 = sList.get(x);
				Student s2 = sList.get(y);
				if(s1.getBun()>s2.getBun()) {
					sList.set(x, s2);
					sList.set(y, s1);
				}
			}
		}
		//데이터 출력 메소드 호출
		sourceData();
	}
	
	public void collections_sort() {
		Collections.sort(sList);
		sourceData();
	}
	
	
}
