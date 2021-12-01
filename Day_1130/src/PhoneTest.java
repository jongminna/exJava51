
public class PhoneTest {
	public static void main(String[] args) {
		Phone p;
		p = new Phone();
		p.volume=10;
		p.volumeDown();
		System.out.println("현재 볼륨은" + p.volume+"입니다");
	}
}
