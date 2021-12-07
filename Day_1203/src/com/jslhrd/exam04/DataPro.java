package com.jslhrd.exam04;

public class DataPro implements Data {
	@Override
	public int getMax(int... var) {
		int max=var[0];
		for(int x=1; x<var.length; x++) {
			if(max<var[x])
				max=var[x];
		}
		return max;
	}
	@Override
	public int getMin(int... var) {
		int min=var[0];
		for(int x=1; x<var.length; x++) {
			if(min>var[x])
				min=var[x];
		}
		return min;
	}
	@Override
	public void sort(int[] var, boolean bool) {
		imsiSort(var);
		if(bool) {
			System.out.println("오름차순 정렬");
			for(int x=0; x<var.length; x++) {
				System.out.print(var[x]+"\t");
			}
			System.out.println();
		}else {
			System.out.println("내림차순 정렬");
			for(int x=var.length-1; x>=0; x--) {
				System.out.print(var[x]+"\t");
			}
			System.out.println();			
		}
	}
	//오름차순 정렬메소드선언
	private void imsiSort(int[] var) {
		for(int x=0; x<var.length-1; x++) {
			for(int y=x+1; y<var.length; y++) {
				if(var[x]>var[y]) {
					int temp = var[x];
					var[x]=var[y];
					var[y]=temp;
				}
			}
		}
	}
}
