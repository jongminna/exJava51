package com.jslhrd.system;
//OS와 상호작용(키보드, 모니터,)
class AA{
	int no;
	AA(int no){
		this.no=no;
		System.out.println("AA("+no+")객체 생성");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("AA("+no+")객체 제거됨");
	}
}
public class SystemEx01 {
	public static void main(String[] args) {
		AA a = new AA(1);
		a=null;
		a = new AA(2);
		a = new AA(3);
		System.gc();
	}

}
