package com.jslhrd.exam04;
public interface Data {
	int getMax(int ... var);
	int getMin(int ... var);
	void sort(int[] var, boolean bool);

	default int getSum(int ... var) {
		int sum = 0;
		for(int x=0; x<var.length; x++) {
			sum+=var[x];
		}
		return sum;
	}
}
