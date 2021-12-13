package com.jslhrd.list;
import java.util.*;
class AA{
	
}
public class ListEx_01 {
	public static void main(String[] args) {
		List list = new ArrayList();//Object
		list.add(123);
		list.add("123");
		list.add(3.14);
		list.add(3,"DDDDD");
		list.add(true);
		list.add(new AA());
		System.out.println("갯수 :" + list.size());
		Object a = list.get(0);
		System.out.println("내용:" + list);
		
		System.out.println(a);
	}

}
