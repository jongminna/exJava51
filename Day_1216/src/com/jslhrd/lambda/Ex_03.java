package com.jslhrd.lambda;

interface ABC{
	void print(int a);
}
public class Ex_03 {
	public static void main(String[] args) {
		ABC fi=(a)->{
			int s=0;
			for(int x=1; x<=a; x++) {
				s+=x;
			}
			System.out.println("1 ~ "+a+"합:" + s);
		};
		fi.print(100);
		
	}

}
