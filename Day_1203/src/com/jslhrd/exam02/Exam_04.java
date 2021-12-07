package com.jslhrd.exam02;
public class Exam_04 {
	public static void main(String[] args) {
		Anony anony = new Anony();
		anony.field.ron();
		anony.method1();
		anony.method2(new Vehicle() {
			@Override
			public void ron() {
				System.out.println("트럭이 달립니다");
			}
		});
	}

}
