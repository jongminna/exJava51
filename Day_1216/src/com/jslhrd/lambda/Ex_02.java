package com.jslhrd.lambda;

public class Ex_02 {
	public static void main(String[] args) {
		MyFuncInterface fi;
		
		fi=()->{
			System.out.println("method Call()");
		};
		fi.method();
		
		fi=()->{
			for(int x=1; x<5;x++) {
				System.out.print(x+" ");
			}
		};
		fi.method();
		
	}

}
