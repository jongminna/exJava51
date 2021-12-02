package com.jslhrd.util;

public class NumberSortExam extends NumberSort {
	//int[] number;
	int cnt;
	public NumberSortExam(int[] number, int cnt) {
		super(number);
		this.cnt=cnt;
	}
	@Override
	public void dataPrint() {
		System.out.print("Data : ");
	    for(int x=0; x<cnt; x++) {
	    	System.out.print(number[x]+"\t");
	    }
	    System.out.println();
	}
	private void sort() {
		for(int x=0; x<cnt-1; x++) {
			for(int y=x+1; y<cnt; y++) {
				if(number[x]>number[y]) {
					int imsi=number[x];
					number[x]=number[y];
					number[y]=imsi;
				}
			}
		}
	}
	
	@Override
	public void ascSort() {
		sort();
		System.out.print("\n오름차순 Data :\t");
		for(int x=0; x<cnt; x++) {
			System.out.print(number[x]+"\t");
		}
	}

	@Override
	public void descSort() {
		sort();
		System.out.print("\n내림차순 Data :\t");
		for(int x=cnt-1; x>=0; x--) {
			System.out.print(number[x]+"\t");
		}
	}

	@Override
	public int maxMinTotla() {
		return 0;
	}
}
