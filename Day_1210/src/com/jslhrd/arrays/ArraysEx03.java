package com.jslhrd.arrays;

import java.util.Arrays;
class BB implements Comparable<BB>{
	int bun;
	String name;
	int age;
	BB(int b , String n, int a){
		bun=b;
		name=n;
		age=a;
	}
/*	
    //문자열 기준으로
	@Override
	public int compareTo(BB o) {
		//return name.compareTo(o.name);//오름
		return o.name.compareTo(name);//내림
	}
*/	
	//숫자
	@Override
	public int compareTo(BB o) {
		//return Integer.compare(bun, o.bun);//오름
		return Integer.compare(o.bun, bun);//내림
	}
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+age;
	}
}
public class ArraysEx03 {
	public static void main(String[] args) {
		BB[] arr = new BB[5];
		arr[0] = new BB(5,"aaa", 25);
		arr[1] = new BB(1,"ggg", 30);
		arr[2] = new BB(2,"ddd", 21);
		arr[3] = new BB(4,"sss", 27);
		arr[4] = new BB(3,"kkk", 26);
		
		System.out.println("------Sort 전---------------");
		for(BB b : arr) {
			System.out.println(b);
		}
		Arrays.sort(arr);
		System.out.println("-------Sort 후--------------");
		for(BB b : arr) {
			System.out.println(b);
		}

	}

}
