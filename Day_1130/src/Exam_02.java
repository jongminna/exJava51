class Cal{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
	static int add(int ... a ) {//가변인자
		int s=0;
		for(int x=0; x<a.length; x++) {
			s+=a[x];
		}
		return s;
	}
	static double add(double ... a ) {//가변인자
		double s=0;
		for(int x=0; x<a.length; x++) {
			s+=a[x];
		}
		return s;
	}
	static int add1(int[] b ) {//가변인자
		int s=0;
		for(int x=0; x<b.length; x++) {
			s+=x;
		}
		return s;
	}
	
}
public class Exam_02 {
	public static void main(String[] args) {
		int s = Cal.add(10,20);
		System.out.println(s);
		System.out.println(Cal.add(3.14, 2.5));
		int ss = Cal.add(1,2,3,4,5,3);
		System.out.println(ss);
		int d[] = {1,2,3,4,5};
		int sss = Cal.add1(d);
		int ssss = Cal.add1(new int[] {1,2,3,4,5});
	}

}
