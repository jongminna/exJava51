package com.jslhrd.exam01;
class Add implements Process{
	@Override
	public int max(int... arr) {
		int max=arr[0];
		for(int x=1; x<arr.length; x++) {
			if(max < arr[x])
				max=arr[x];
		}
		return max;
	}
	@Override
	public int min(int... arr) {
		int min=arr[0];
		for(int x=1; x<arr.length; x++) {
			if(min > arr[x])
				min=arr[x];
		}
		return min;
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Process p1 = new Add();
		System.out.println("Max : " + p1.max(10,30,20,80,75,69));
		System.out.println("Min : " + p1.min(10,30,20,80,75,69));
		System.out.println("sum : " + p1.sum(10,30,20,80,75,69));
	}

}
