package com.jslhrd.student;

import java.util.Scanner;

public class ScoreExam {
	public static void main(String[] args) {
		Student[] student = new Student[5];
	    student[0] = new Student("1102","박학생","F",26);
	    student[1] = new Student("1101","이학생","M",28);
	    student[2] = new Student("1105","강학생","M",23);
	    student[3] = new Student("1103","장학생","F",25);
	    student[4] = new Student("1104","오학생","M",27);
	    
	    //Score[] scoreArr = new Score[5];
	    ScoreData sData = new ScoreData();
	    //sData.arrScore[0] = new 
	    
	    Score score = null;
	    Scanner scn = new Scanner(System.in);
	    int cnt=0;
	    while(cnt<5) {
	    	System.out.print("점수등록:");
	    	String hakbun = scn.next();
	    	if(hakbun.equals("0000"))
	    		break;
	    	boolean flag=false;
	    	for(int x=0; x<student.length; x++) {
	    		if(student[x].getHakbun().equals(hakbun)){
	    			int kor = scn.nextInt();
	    			int eng = scn.nextInt();
	    			int mat = scn.nextInt();
	    			//scoreArr[cnt] = new Score(student[x], kor,eng,mat);
	    			sData.arrScore[cnt] = new Score(student[x], kor,eng,mat);
	    			//cnt++;
	    			sData.cnt++;
	    			flag=true;
	    			break;
	    		}
	    	}
	    	if(flag) {
	    		System.out.println("등록되었습니다.");
	    	}else {
	    		System.out.println("등록된 학생이 없음.");
	    	}
	    }
	    
	    //석차
	    sData.rank();
	    sData.dataPrint();
	    //출력
	    
	}

}
