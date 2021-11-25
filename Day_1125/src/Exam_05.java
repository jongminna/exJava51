class AA{
	AA(){}
	AA(String name){
		this.name=name;
	}
	AA(int age){
		this.age=age;
	}
	AA(String name, int age){
		this.name=name;
		this.age=age;
	}
	String name;
	int age;
}
public class Exam_05 {
	public static void main(String[] args) {
		AA a1 = new AA();
		
		AA a2 = new AA("김",25);
		
	}

}
