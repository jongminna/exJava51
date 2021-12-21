package com.jslhrd.thread;
class AA_2 implements Runnable{
	@Override
	public void run() {
		for(int x=1; x<100;x++) {
			System.out.println("AA="+x);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}		
	}
}

class BB_2 implements Runnable{
	public void run() {
		for(int x=100; x>0;x--) {
			System.out.println("BB="+x);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
public class ThreadEx02 {
	public static void main(String[] args) {
		AA_2 a2 = new AA_2();
		Thread t2 = new Thread(a2);
		Thread t3 = new Thread(new BB_2());
		t2.start();
		t3.start();
		
	
	
	}

}
