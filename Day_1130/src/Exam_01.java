class AA{
	static String company="samsung";
	static String model="computer";
	int price=30000;
	
	AA(){}
	
	public void print() {
		System.out.println(company);
		System.out.println("Model :" + model);
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		AA a = new AA();
		AA a1 = new AA();
		a.company="aaaa";
		a.price=100;
		System.out.println("a.company :" + a.company);
		System.out.println("a1.company :" + a1.company);
		System.out.println("a.price :" + a.price);
		System.out.println("a1.price :" + a1.price);

	}

}
