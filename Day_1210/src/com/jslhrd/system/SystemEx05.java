package com.jslhrd.system;

import java.util.Arrays;

//배열복사 arraycopy()
public class SystemEx05 {
	public static void main(String[] args) {
		int var[] = {1,2,3,4,5};
		int var2[]= {0,9,8,7,6,5,4,3};
		System.arraycopy(var, 0, var2, 3, 2);
		System.out.println("var[] : " + Arrays.toString(var));
		System.out.println("var2[] : " + Arrays.toString(var2));
	}

}
