package com.jslhrd.student;
public class ScoreData {
	static Score[] arrScore = new Score[5];
	static int cnt;
	
	void rank() {
		for(int x=0; x<cnt; x++) {
			//arrScore[x].setRank(1);
			int r=1;
			for(int y=0; y<cnt; y++) {
				if(arrScore[x].getTot() < arrScore[y].getTot()) {
					//arrScore[x].setRank(arrScore[x].getRank()+1);
					r++;
				}
			}
			arrScore[x].setRank(r);
		}
	}
	
	void dataPrint() {
		System.out.println("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x=0; x<cnt; x++) {
			System.out.print(arrScore[x].getStudent().getHakbun()+"\t");
			System.out.print(arrScore[x].getStudent().getName()+"\t");
			if(arrScore[x].getStudent().getGender().equals("M")) {
				System.out.print("남자\t");
			}else {
				System.out.print("여자\t");
			}
			System.out.print(arrScore[x].getStudent().getAge()+"\t");
			System.out.print(arrScore[x].getKor()+"\t");
			System.out.print(arrScore[x].getEng()+"\t");
			System.out.print(arrScore[x].getMat()+"\t");
			System.out.print(arrScore[x].getTot()+"\t");
			System.out.print(arrScore[x].getAve()+"\t");
			System.out.print(arrScore[x].getRank()+"\n");
		}
	}
}
