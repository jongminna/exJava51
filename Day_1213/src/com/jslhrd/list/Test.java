package com.jslhrd.list;
class BB{
	int a;
	BB(){}
	BB(int a){
		this.a=a;
	}
}

public class Test {
	public static void main(String[] args) {
		BB b1 = new BB();
		BB b2 = new BB(10);
		BB b3 = new BB(20);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1 instanceof BB);
		
		
	}

}
