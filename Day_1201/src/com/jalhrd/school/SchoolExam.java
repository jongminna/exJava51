package com.jalhrd.school;

import java.util.Arrays;
import java.util.Scanner;

public class SchoolExam {
	public static void main(String[] args) {
		School[] school = new School[10];
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		while(cnt<10) {
			System.out.print("등록:");
			int bun = scn.nextInt();
			if(bun==0)
				break;
			String name = scn.next();//이름
			int score[]=new int[100];
			int no=0;
			while(true) {
				score[no]=scn.nextInt();
				if(score[no]==-99)
					break;
				no++;
			}
			int imsi[] = new int[no-1];
			for(int x=0; x<imsi.length; x++) {
				imsi[x] = score[x];
			}
			school[cnt] = new School(bun,name,imsi);
			cnt++;
		}
		//출력
		for(int x=0; x<cnt; x++) {
			school[x].dataPrint();
		}
	}

}
