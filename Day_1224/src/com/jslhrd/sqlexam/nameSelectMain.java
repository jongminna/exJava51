package com.jslhrd.sqlexam;

public class nameSelectMain {

	public static void main(String[] args) throws Exception {
		OrderEx_01 ex02 = new OrderEx_01();
		ex02.makeConn();
		ex02.nameSelect("S");
		ex02.takeDown();
	}

}
