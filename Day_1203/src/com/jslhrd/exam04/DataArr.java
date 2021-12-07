package com.jslhrd.exam04;
public interface DataArr extends Data {
	int getMaxArr(int[] var);
	int getMinArr(int[] var);
	default int getSumArr(int[] var) {
		
		return 1;
	}
}
