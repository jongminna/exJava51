package com.jslhrd.thread;
class AA{
	void run() {
		for(int x=1; x<100;x++) {
			System.out.println("AA="+x);
		}
	}
}
class BB{
	void run() {
		for(int x=100; x>0;x--) {
			System.out.println("BB="+x);
		}
	}
}
public class NoThread {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		a.run();
		b.run();
	}

}
