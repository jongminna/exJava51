public class Phone {
	String model;	//모델명
	boolean power;  //전원(on/off)
	int volume;		//볼륨
	
	void power() {
		power = !power;
	}
	void volumeUp() {
		volume++;
   }
   void volumeDown() {
	   volume--;
   }
}
