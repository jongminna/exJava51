package com.jslhrd.exam02;
public interface Vehicle {
	void ron();
}
class Anony{
	Vehicle field = new Vehicle() {
		@Override
		public void ron() {
			System.out.println("자전거가 달립니다");
		}
	};
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void ron() {
				System.out.println("승용차가 달립니다");				
			}
		};
		localVar.ron();
	}
	void method2(Vehicle v) {
		v.ron();
	}
}
