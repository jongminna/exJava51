package com.jslhrd.test;

public class BB {
	int a=10;
	void test() {
		System.out.println("BB.a="+a);
	}
	int sum(int n, int m) {
		int tot=0;
		for(int x=n; x<=m; x++) {
			tot+=x;
		}
		return tot;
	}
}
