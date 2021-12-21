package com.jslhrd.thread;
class AA_1 extends Thread{

	public void run() {
		for(int x=1; x<100;x++) {
			System.out.println("AA="+x);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}

class BB_1 extends Thread{
	public void run() {
		for(int x=100; x>0;x--) {
			System.out.println("BB="+x);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
public class ThreadEx01 {
	public static void main(String[] args) {
		AA_1 a1 = new AA_1();
		BB_1 b1 = new BB_1();
		a1.start();
		b1.start();
	}

}
