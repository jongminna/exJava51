package com.jslhrd.map;

public class User {
	int bun;
	String name;
	User(int bun, String name){
		this.bun=bun;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User u=(User)obj;
			return u.bun==bun && u.name.equals(name);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode()+bun;
	}
	
	@Override
	public String toString() {
		return bun+"\t"+name;
	}
}
