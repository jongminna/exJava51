package com.jslhrd.exam01;
public interface Process {
	int max(int ... arr);
	
	int min(int ... arr);
	
	default int sum(int ... arr) {
		int s=0;
		for(int x=0; x<arr.length; x++) {
			s += arr[x];
		}
		return s;
	}
}
