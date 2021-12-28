package com.jslhrd.sqlexam;

public class OrderEx_01Main {

	public static void main(String[] args) throws Exception {
		OrderEx_01 ex01 = new OrderEx_01();
		ex01.makeConn();
		ex01.selectOrder();
		ex01.takeDown();
	}

}
